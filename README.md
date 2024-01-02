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
其实不完全是，antlr4 有一个 `FileStream.js` 中使用了node特有库 `fs`
```javascript
// node_modules\antlr4\src\antlr4\FileStream.js
import fs from 'fs';
```
我们需要注释掉上面一行即可完全没有问题的使用了。

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
*antlr.jar *到官网上直接下载 [链接](https://www.antlr.org/download.html) ，或者如果找不到点哪里就安装写本文时的最新版 [4.13.1版本](https://www.antlr.org/download/antlr-4.13.1-complete.jar) 
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
var input = `\nx := 10 + 5\nprint x + 8\n`;

// 然后，生成输入流，传入词法分析器，传入解释器，创建ParseTrees
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

