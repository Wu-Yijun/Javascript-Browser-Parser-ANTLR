# Javascript-Browser-Parser-ANTLR
using javascript to parser code dynamically and hight code

not completed


## 先测试一个简单的例子，搞清楚怎么用，接着再具体分析语言

下载了两个项目，共同作为参考。
分别为： https://www.scriptol.com/programming/antlr4-javascript.php 以及 https://github.com/program-in-chinese/quan4

前者详细讲解了如何去用 Antlr 构建一个可用在javascript运行的编译器。后者实际写了一个网页，但是它又用了一个名为 browserify 的东西把它实际转成了 es6 单一文件 js 。这看上去挺好，但是我们无法分析结构了，并且在处理多语言时会有很大的困难。
因此，我们选择一第一个的node项目为主。

目前我的网页没有使用任何框架，因此我不希望在每次修改后，都需要本地编译一次。
而 ANTLR 一个好处是，我用 `npm install antlr4` 安装的 antlr4 是完全 ES6 化的，可用直接在浏览器运行。
~~其实不完全是~~，antlr4 有一个 `FileStream.js` 中使用了node特有库 `fs`
```javascript
// node_modules\antlr4\src\antlr4\FileStream.js
import fs from 'fs';
```
我们需要注释掉 import 那一行即可完全没有问题的使用了。

### 前期准备

- java
- node_modules\antlr4
- antlr.jar   (后面会有版本号等，但不影响)
- 你自己的编译器.g4

**具体安装：**

*java*我就不讲了
*node_modules\antlr4* 使用命令就会自动在根目录下创建 `node_module\antlr4\*` 一系列文件：
```bash
npm install antlr4
```
*antlr.jar *到官网上直接下载 [(官网链接)](https://www.antlr.org/download.html) ，或者如果找不到点哪里就安装写本文时的最新版 [4.13.1版本](https://www.antlr.org/download/antlr-4.13.1-complete.jar) 
*你自己的编译器.g4* 自己找一个，建议简单一点的，比如Test文件夹里的一个简易的 [calc.g4](./test/calc.g4)

### 使用方法

使用起来非常 easy ，网上写的你未必能正常跑，只要配好了 java 环境，在 calc.g4 的路径下直接在控制台(注意JavaScript要大写)：
```bash
..\antlr.jar -Dlanguage=JavaScript calc.g4
```

然后就会输出一大堆文件。
我们用的到的有
- calcLexer.js
- calcListener.js
- calcParser.js

这三个 javascript 文件。

#### 编写我们的网页

我们的关键性代码只有几行 `my_calc.js`：
```javascript
// 首先，引入库
import antlr4 from "../node_modules/antlr4/src/antlr4/index.web.js"
import calcLexer from "./calcLexer.js"
import calcParser from "./calcParser.js"
import JSListener from "./JSListener.js"

// 然后，定义我们的输入
var input = `\n x := 10 + 5 \n print x + 8 \n`;

// 然后，生成输入流，传入词法分析器，传入语法解释器，创建抽象语法树
var chars = new antlr4.InputStream(input)
var lexer = new calcLexer(chars)
var tokens = new antlr4.CommonTokenStream(lexer)
var parser = new calcParser(tokens)
parser.buildParseTrees = true
var tree = parser.program()

// 最后，从树中提取流程，将编译结果用 js 代码打印
var extractor = new JSListener()
antlr4.tree.ParseTreeWalker.DEFAULT.walk(extractor, tree)
```

四个导入中，第一个是库，第二个是生成的词法分析器，第三个是生成的解释器，第四个是需要我们完成的翻译器。

库的部分没什么好说的，注意路径要正确（还有前面说过的改掉一个import）。其实所有的相关代码都是放在 `/node_modules/antlr4/src/` 目录下的，因此也可以只保留这一个目录到其它路径，剩余的就不要了。
中间两个导入的库有一点要注意，那就是生成时使用的 antlr4 的的位置是 `antlr4` 因此我们把它们内部使用的 import 改为和 `my_calc.js` 一样的 antlr4 的路径。（calcListener.js 里的路径也要改）
最后一个是我们自己实现的 JSListener ，稍有复杂，关键代码见下：

```javascript
// 导入模板运行过程
import calcListener from './calcListener.js'

// 定义
class JSListener extends calcListener {};

// 重写一些方法
JSListener.prototype.exitAssign = function (ctx) {
    // 赋值完毕时调用
    var left_value = ctx.getChild(0).getText()
    var right_value = ctx.getChild(2).getText()
    console.log(left_value + " = " + right_value)
};
JSListener.prototype.exitPrint = function (ctx) {
    // 打印完毕时调用
    var output_text = ctx.getChild(1).getText()
    console.log(`console.log(${output_text})`)
};

// 导出类
export default JSListener;
```

或者我们其实也可以就地修改 `calcListener.js` ，向其中的方法中加入具体的执行过程。（我的项目里没有展示）

把这些都放在一起，再创建 `test.html` ：
```html
<html>
<head></head>
<body>
  <script type="module" src="my_calc.js"></script>
</body>
</html>
```
 其中， `type="module"` 是为了让我们的模块可用正常运行，不然无法再代码中使用 `import`

### Bingo! 它输出了

```javascript
x = 10+5
console.log(x+8)
```

你需要使用 go live 来预览你的网页，不然它不会加载这么多js

![evaluate](./res/image0.png)

可用看到，总共资源为 0.5M 的大小，已经不是可用轻易忽略的size了。

对应 C 语言的大小，三个文件加起来一共 357KB ，也就接近 1M 的大小了。如果对应网速较差时，这不是一个易于接受的大小。考虑到优化，我们一方面可用打开缓存，另一方面还可以将不同语言的分别保存，仅需要时再调用。同时，将 ANTLR 和 语言 部分的代码分离，增加重复利用率。

### 迁移到词性分类(为高亮做准备)

进一步修改代码，尝试更高级地打印出每一段：
我们在每一个 `JSListener.enterSomething(){}` 中，加入输出打印各种信息，观察程序的执行流程。
```javascript
function logout(ctx, str) {
    console.log(ctx.getChildCount(), ctx.getText(), str,
        ctx.getSourceInterval().start + ":" + ctx.getSourceInterval().stop);
}
// ...
JSListener.enterSomething(ctx){
    logout(ctx, "Something");
}
```

修改待编译代码为更复杂的
```
x := 10 + 5 * 6 ^ 2
print x + 8
```
分别输出子节点数量，文本串，函数名，对应位置范围（如下）

![identify](./res/image2.png)

子节点数量指示的是对应函数类型的子节点数，与子节点的性质无关，因此，可用很方便的从诸如加法表达式中提取出加号。

### 更高级的测试（使用 C 实战）

[跳转到文档中部](#c-实战)

### QA

> 为什么我不用 node 测试

**你以为我不想吗！** 我仿照着示例 `node calc.js test.calc` 。然后你猜怎么着？它报错了，我还看不懂。

> 为什么我第一个实际测试选用 C ，python 不香吗

因此 C 语法简明单一，而且我非常熟。 **我就瞧不起pyhton怎着么了，招你惹你了！**


## C 实战

### 尝试构建

从 [antlr提供的编译器集合](https://github.com/antlr/grammars-v4) 中找出 C 的 C.g4
由于它太全了，省去了我到处找的功夫，因此我给它了一个star ~~（暗示star）~~

~~但是它版本较旧，比如我 C++ 用的是 C++23 ，但它的版本才到 C++14~~

新建一个文件夹，同样的过程，处理完后，把 test 里我们创建的文件复制过去。

然后修改一些链接名称。

运行我们发现 parser.program() 是未定义的。
因此需要一个入口程序
但我不知道入口在哪.

在网上找到了类似的问题 [Stack OveSflow](https://stackoverflow.com/questions/67973358/c-grammar-in-antlr4-raises-error-extraneous-input-int-on-int-main) ，结果需要使用 `compilationUnit()` 而不是 `primaryExpression()` 作为入口。

~~确实，该是编译单元而不是基础表达式。~~

使用简单的C代码进行测试。

```C
#include <stdio.h>
#define LAST 10
int foo();
int main()
{
    int i, sum = 0;
   
    for ( i = 1; i <= LAST; i++ ) {
      sum += i;
    } /*-for-*/
    printf("sum = %d\\n", sum + foo());

    return 0;
}
int foo(){
    return 10;
}
```

然后我们发现几点问题：
1. 注释没有渲染，在词法被剔除了
2. 宏没有渲染，被剔除了
3. 变量没有对应！
4. 很多量无法区分，比如变量或数字

进一步分析流程，发现在之前的步骤，就可以得到全部的 tokens 的类型，范围和字符值。这是没有经过修剪的全部值。
于是可以用下面的代码打印所有的 tokens
```javascript
for(let e of tokens.tokens){
    console.log(e.type, e.start, e.stop ,e.text)
}
// var extractor = new JSListener();
// antlr4.tree.ParseTreeWalker.DEFAULT.walk(extractor, tree);
```

tokens 的 type 对照表可以见之前生成的 C.tokens 文件。
我们使用 C++ 按对照表生成 css 样式表（供高亮使用）：
同时我们也生成一份自动转码 js 代码（方便测试用）
最后修改我们的代码使每一个块获得对应的样式：
```javascript
var str="";
for (let e of tokens.tokens) {
    str+=`<span class="CodeCStyle${e.type}">${e.text}</span>`;
}
document.getElementById("test").innerHTML = str;
```
经过测试，现在以及可以很好的显示测试了。

目前存在的问题还剩：
1. 变量没有对应
2. 很多量无法区分，比如变量或数字
3. 宏和注释等内容没有内部结构

我们下一步对 g4 文件下手，尝试加入一些内容让我们可以区分这些量。

### 自定义词法分析

将文件夹拷贝一份，为 `./C2/*` 。

然后修改 BlockComment, 引入 BlockCommentNote 
然后我们发现词法分析任然显示为 BlockComment ，没有把 BlockCommentNote 提取出来。**经过一番调查我发现它是没法分解tokens的**

那么词法分析就不用自定义了。
一切入手的位置都集中在了监听器解析树。

解析有两种方案，一种是叠buff，通过css选择器来决定样式。另一是手动分配样式的类。

我们使用第二种。 ~~然后还得到的结论就是尽量不要手动修改 g4 代码（因为没啥可以改的）~~
这个不好改的原因是它不是有结构的，内部为纯粹的字符串序列，如果在高优先级会影响正常文本的解析，在低优先级就是被被人捷足先登了挺不好。
于是结论就是不改。直接用js正则匹配也挺方便。

还原 `C.g4` 。

我们手动在正则匹配遇到多行注释时分析 @meta ，遇到字符串常量时分析格式化输入输出，遇到反斜杠自动高亮输出。

![HighLight](/res/image3.png)

然后关于前面的include和宏，这还是需要修改 g4 文件启用解析的。经过一系列调整，它终于可以正常解析了。我们在 Listener 遇到 include 使用引号的 path 时，手动将其类型改为 IncludePath ，这样它才会作为Path而非字符串被解析。

![Almost there](res/image4.png)

### Almost There

现在还剩下最后的工作，将代码中的变量进行分析，分析类型、作用域等。保证在最后的着色环节有正确的参考依赖。

观察发现 `directDeclaration` 对应的为所有变量、函数、宏的定义名称。它们分别位于 `declaration` 部分（变量）、 `externalDeclaration` 部分全局定义。
因此我们可以通过类似状态机的方式来决定每一个具体的 `directDeclaration` 分别对应什么。

在此之前，我们先要定义两个类用来映射变量和代码块。变量保存了变量名、类型、开始位置，代码块位置。代码块为作用域的范围，代码块内可以访问外层的前面的变量，代码块无法访问内层的变量。代码块内的变量自上而下存储。同时,还要存储变量的类型和标识(结构体/函数/变量/宏 等等)

最后,我们从上到下遍历整个列表,输出渲染后的代码（请忽略这丑陋的配色）
后期处理还要处理一些变量缺失等特殊情况(宏中的变量缺失标灰, 宏转字符串报红, 其它的下面标黄线)

![Final Result](res/image5.png)

### 其它优化

 ~~等我有时间了~~，~~下次一定~~ ，#TODO ~~这总行了吧~~

- 完成结构体部分的分析。
- 我定义的样式不完整，像是 `__inline__` 我就没有预设样式
- 完善全部结构，目前只是简单的能用
- 还需将代码整理，封装好，让我们可以直接调用。
- 在调用时，同时输入预先定义的参数列表（比如 printf ），不然它报错。
- 决定 `A b(c);` 的渲染方式（这似乎是没法用词法语法分析分辨的）
- 自用分析并导入 include 部分。
- C.g4 里的 Identifier 是直接用的，我们可以预先设好区分，而不是现在用的在监听器遍历树的时候分析。
- ...


## 不管优化了，我们直接开干 C++

*由于C++内容比较多，我们尽量尝试全部覆盖*

### 新的优化思路

后来我睡觉的时候想，C 里面我们通过 JavaScript 代码来分析语法单元究竟是函数定义/声明/变量定义/声明等等。但其实没必要。我们希望可以在语法分析中将token命名为不同的名字来区分这些性质，最终达到大大简化我们计算的目的。

### 开始

从 [antlr提供的编译器集合](https://github.com/antlr/grammars-v4) 中找出 C++ 的 CPP14Parser.g4 和 CPP14Lexer.g4 这两个文件，看到它把词法和语法分析拎开了。以及我们还需要 CPP14ParserBase.js 这个文件，因为需要在编译完后作为基类被继承。

**Lexer** 一共 400 行，结构较为清晰。

**Parser** 巨长无比，一共 1000 多行，因此需要我们费一些功夫来深入分析一下。

先试着编译看看效果。

``` bash
..\antlr.jar -Dlanguage=JavaScript CPP14Lexer.g4 CPP14Parser.g4
..\tools\repath.exe CPP14Lexer.js CPP14Parser.js CPP14Listener.js
```

输出没什么问题，然后我们尝试跑一下并打印 tokens：

*复制过来 Variables.js 和 JSListenerRun.js 这两个文件，后者稍微改动一下，（改名为 MyListener），最后在改一个简单的Test ，选取最上层节点为编译单元 translationUnit 然后遍历树。*
```javascript
for(let i of tokens.tokens)
    console.log(i.text, Token(i.type))
```

修改一些名字后，发现可以很顺利地跑起来，且词法分析基本没问题。

但存一个问题，就是分析时间很长，此时页面会无响应。因此我们需要先尝试将 Antlr4 的处理改成可中断的。

但如果在深处中断，需要所有我们调用它的函数都设置为异步的，这样对性能和代码修改量都是不友好的。

我们发现一个链条：`translationUnit -> declarationseq -> declaration+` 一个编译单元可以分解为多个声明的列表。因此我们可以将每一个 declaration 作为一个切片，中间可以执行其它任务。
这样一个单元只包含一个函数，量稍微少了一些些，残存的问题就是长的函数、类定义。（之后再想办法）

先测试一下分段后的性能：
![before](res/image6.png) ![after](res/image7.png)

可以看出来，长任务被分块为了一些小段。但是小段还是稍长了一些。后续还需要进一步减少每个块上面的开销。

![long-func](res/image8.png)

不过可以看出，当我们把函数的长度大大延长时，每一块的时间增长的并不是很多，还是在勉强可以接受的量级内。

#### 使用 C++ 自动处理函数异步

写好程序，自动查找。命令格式为
```bash
..\tools\ParserToAsync.exe CPP14Parser.js translationUnit declarationseq declaration
```
参数列表为 Path A1 A2 A3 ... An B
意思是处理 Path 文件， A1 函数中的 A2 是异步的，A2 函数中的 A3 是异步的，... An-1 函数中的 An 是异步的，最后，在 An 函数的 B 后面进行分块。

### 调整语法分析

我们先给 Identifier 分个类
在最前面引入 `identifier` 为 `Identifier` ，再将后面的 `Identifier` 全部替换为 `identifier`
然后试图找到那些 `Identifier` 分别对应什么。

主要需要考虑的是定义部分的变量


