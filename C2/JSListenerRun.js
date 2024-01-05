import antlr4 from "./antlr4.js";
import CLexer from "./CLexer.js";
import CParser from "./CParser.js";

import JSListener from "./JSListener.js";

import { Range, Variables } from "./Variables.js"


export function Token(i) {
    return CLexer.symbolicNames[i] || ("T__" + (i - 1));
}
export function Rule(i) {
    return CParser.ruleNames[i] || ("R__" + (i - 1));
}
export function TokenFind(name) {
    let index = CLexer.symbolicNames.indexOf(name);
    if (index === -1 && name.substr(0, 3) == "T__") {
        return parseInt(name.substr(3)) - 1;
    }
    return index;
}
export function RuleFind(name) {
    let index = CParser.ruleNames.indexOf(name);
    if (index === -1 && name.substr(0, 3) == "R__") {
        return parseInt(name.substr(3)) - 1;
    }
    return index;
}


export class JSListenerRun extends JSListener {

    judgeFormat(ctx, ...args) {
        if (ctx.getChildCount() != args.length)
            return false;
        for (let i in args) {
            if (ctx.children[i] instanceof antlr4.tree.TerminalNode) {
                if (args[i] instanceof String) {
                    if (args[i] != ctx.children[i].symbol.text)
                        return false;
                } else if (typeof args[i] == 'number') {
                    if (args[i] != ctx.children[i].symbol.tokenIndex)
                        return false;
                }
            } else if (ctx.children[i] instanceof antlr4.ParserRuleContext) {
                if (args[i] instanceof String) {
                    if (args[i] != Rule(ctx.children[i].ruleIndex))
                        return false;
                } else if (typeof args[i] == 'number') {
                    if (args[i] != ctx.children[i].ruleIndex)
                        return false;
                }
            }
        }
        return true;
    }

    enterCompilationUnit(ctx) {
        var range = new Range(ctx.getSourceInterval().start, ctx.getSourceInterval().stop);
        range.name = "Global";
        this.range = range;
        this.currentRange = range;
        super.enterCompilationUnit(ctx);
    }
    exitCompilationUnit(ctx) {
        console.log(this.range);
        super.exitCompilationUnit(ctx);
    }

    // 进入宏定义
    enterDefineMacro(ctx) {
        if (ctx.getChildCount() == 2)
            this.currentRange.pushState("Macro");
        else if (ctx.getChildCount() == 3) {
            this.currentRange.pushState("MacroFun");
            this.lastRange = this.currentRange.createSub(ctx, "Macro Defines");
            console.log("Created");
        } else {
            this.currentRange.pushState("MacroUnknow");
        }
        super.enterDefineMacro(ctx);
    }
    exitDefineMacro(ctx) {
        if (this.currentRange.getState() == "") {
            // empty
            this.currentRange = this.currentRange.parentRg;
        }
        this.currentRange.popState();
        super.exitDefineMacro(ctx);
    }
    enterStructOrUnionSpecifier(ctx) {
        // if (this.judgeFormat(ctx, RuleFind("structOrUnion")))
    }
    // 进入带内容声明
    enterDirectDeclarator(ctx) {
        let state = this.currentRange.getState();
        let state_new = state;
        if (ctx.getChildCount() == 1) {
            // Identifer
            console.assert(Token(ctx.children[0].symbol.type) == 'Identifier');
            let name = ctx.children[0].symbol.text;
            let markers = [];
            // new variable
            switch (state) {
                case "Declare Init": {
                    // 定义变量
                    if (this.currentRange.checkVarRepeat(name, ctx.getSourceInterval().start))
                        markers.push("Redefined");
                    var defs = new Variables(this.lastType, name, "Var",
                        this.currentRange, ctx.getSourceInterval().start);
                    for (let i of markers) defs.marks.push(i);
                    this.lastVar = defs;
                    break;
                }
                case "MacroFun":
                    markers.push("DefinesRuled");
                    console.log("MacroFun");
                case "Macro": { // 定义宏变量（替换规则）
                    console.log("Macro");
                    // 检查重复性
                    if (this.currentRange.checkVarRepeat(name, ctx.getSourceInterval().start))
                        markers.push("Redefined");
                    var defs = new Variables("", name, "DefinedWord",
                        this.currentRange, ctx.getSourceInterval().start);
                    for (let i of markers) defs.marks.push(i);
                    this.lastVar = defs;
                    break;
                }
                case "Function": {
                    if (this.currentRange.checkVarRepeat(name, ctx.getSourceInterval().start))
                        markers.push("Redefined");
                    var defs;
                    switch (this.currentRange.getState(1)) {
                        case "Macro":
                        case "MacroFun": {
                            console.log("Function Macro");
                            defs = new Variables("", name, "DefinedFun",
                                this.currentRange, ctx.getSourceInterval().start);
                            break;
                        }
                        case "FuncDef": {
                            console.log("Function FuncDef");
                            defs = new Variables(this.lastType, name, "FunDef",
                                this.currentRange, ctx.getSourceInterval().start);
                            break;
                        }
                    }
                    for (let i of markers) defs.marks.push(i);
                    this.lastVar = defs;
                    if (this.lastRange)
                        this.currentRange = this.lastRange;
                    this.lastRange = null
                    break;
                }
                case "FunctionParams": {
                    console.log("FunctionParams");
                    var defs = new Variables(this.lastType, name, "FunParams",
                        this.currentRange, ctx.getSourceInterval().start);
                    for (let i of markers) defs.marks.push(i);
                    this.lastVar.varList.push(defs);
                    break;
                }
                case "FunctionDeclare": {
                    // 函数声明
                    defs = new Variables(this.lastType, name, "FunDeclare",
                        this.currentRange, ctx.getSourceInterval().start);
                    this.currentRange.setState("FunctionDeclareDone");
                    break;
                }
            }
        } else if (this.judgeFormat(ctx, RuleFind("directDeclarator"), "(", ")")
            || this.judgeFormat(ctx, RuleFind("directDeclarator"), "(", RuleFind("parameterTypeList"), ")")) {
            // 告诉之后遇到的这是函数名
            state_new = "Function";
            if (state == "Declare Macro" || state == "Declare Init")
                state_new = "FunctionDeclare";

            console.log("Function 34");
            // 之后宏的函数名是typedefedName
            // 只有函数的变量名用到。
            // 函数声明中的自定义结构体有 bug ，会优先解析为初始化标记
            // 这个时候需要主动判断是否为类型名，决定是否修正。
            // 之后再说，我不改
        }
        this.currentRange.pushState(state_new);
        super.enterDirectDeclarator(ctx);
    }
    exitDirectDeclarator(ctx) {
        if (this.currentRange.state.length != 0)
            this.currentRange.popState();
        else
            this.currentRange.parentRg.popState();
        super.exitDirectDeclarator(ctx);
    }


    // 遇到类型符
    enterTypeSpecifier(ctx) {
        switch (this.currentRange.getState()) {
            case "Declare Def": {
                this.currentRange.setState("Declare Def Typed");
                this.currentRange.pushState("Declare Def Identifier");
                break;
            }
            case "Declare Def Typed": {
                // 定义变量只有一次声明
                super.enterTypeSpecifier(ctx);
                return;
            }
            case "Typedef": {
                // 定义类型，可以为自定类型
                this.currentRange.declarationSpecifiersNum--;
                if (this.currentRange.declarationSpecifiersNum != 0)
                    this.currentRange.pushState("Declare Def Identifier");
            }
        }
        this.lastType = ctx.getText();
        super.enterTypeSpecifier(ctx);
    }
    exitTypeSpecifier(ctx) {
        switch (this.currentRange.getState()) {
            case "Declare Def Identifier":
                this.currentRange.popState();
        }
    }

    enterStorageClassSpecifier(ctx) {
        /*
         * 'typedef'
         * 'extern'
         * 'static'
         * '_Thread_local'
         * 'auto'
         * 'register'
         */
        console.assert(ctx.getChildCount() == 1);
        console.assert(ctx.children[0] instanceof antlr4.tree.TerminalNode);
        switch (ctx.children[0].symbol.text) {
            case "typedef": {
                this.currentRange.pushState("Typedef");
                this.currentRange.declarationSpecifiersNum--;
                break;
            }
        }

        super.enterStorageClassSpecifier(ctx);
    }

    exitStorageClassSpecifier(ctx) {
        switch (this.currentRange.getState()) {
            // case "Typedef":
            //     this.currentRange.popState();
            // 在定义 def 时再删去
        }
        super.exitStorageClassSpecifier(ctx);
    }

    // 遇到para声明
    enterTypedefName(ctx) {
        switch (this.currentRange.getState()) {
            case "FunctionParams": {
                // 宏参数列表
                console.log("FunctionParams Macros");
                let markers = [];
                var defs = new Variables(this.lastType, ctx.getText(), "MacroParams",
                    this.currentRange, ctx.getSourceInterval().start);
                for (let i of markers) defs.marks.push(i);
                this.lastVar.varList.push(defs);
                if (this.currentRange.getState(1) == "")
                    break;
            }
            case "Declare Def Typed": {
                // 变量声明
                // typedef 定义量的使用。 
                let markers = ["Defined only"];
                if (this.currentRange.checkVarRepeat(name, ctx.getSourceInterval().start))
                    markers.push("Redefined");
                var defs = new Variables(this.lastType, ctx.getText(), "Var",
                    this.currentRange, ctx.getSourceInterval().start);
                for (let i of markers) defs.marks.push(i);
                break;
            }
            case "Declare Def Identifier": {
                // 这是自定义类型的使用
                break;
            }
            case "Typedef": {
                // typedef 名称
                let markers = [];
                if (this.currentRange.checkVarRepeat(name, ctx.getSourceInterval().start))
                    markers.push("Redefined");
                var defs = new Variables(this.lastType, ctx.getText(), "Typedef",
                    this.currentRange, ctx.getSourceInterval().start);
                for (let i of markers) defs.marks.push(i);
                this.currentRange.popState();
                break;
            }
            case "Declare Init": {
                // 函数类型或变量类型
                break;
            }
        }
        super.enterTypedefName(ctx);
    }

    enterParameterList(ctx) {
        if (this.currentRange.getState() == "") {
            // 因为刚进入一个新的作用域，因此没东西才是正常的。
            // 如果非空，说明是函数声明而不是定义
            this.currentRange.pushState("FunctionParams");
        } else {
            this.currentRange.pushState(this.currentRange.getState());
        }
        super.enterParameterList(ctx);
    }
    exitParameterList(ctx) {
        this.currentRange.popState();
        super.enterParameterList(ctx);
    }

    enterDeclaration(ctx) {
        if (this.judgeFormat(ctx, RuleFind("declarationSpecifiers"), RuleFind("initDeclaratorList"), ";")) {
            // 初始化（和声明）
            // 函数声明也是，函数定义是 fundeclaration
            this.currentRange.pushState("Declare Init");
        } else if (this.judgeFormat(ctx, RuleFind("declarationSpecifiers"), ";")) {
            // 仅声明
            this.currentRange.pushState("Declare Def");
        } else if (this.judgeFormat(ctx, RuleFind("staticAssertDeclaration"))) {
            // ??
            this.currentRange.pushState("Declare SA");
        } else if (this.judgeFormat(ctx, RuleFind("macroDefines"))) {
            // 声明宏
            this.currentRange.pushState("Declare Macro");
        } else {
            this.currentRange.pushState("Declare Unknow");
        }
        console.log(this.currentRange.getState());
        super.enterDeclaration(ctx);
    }
    exitDeclaration(ctx) {
        this.currentRange.popState();
        super.exitDeclaration(ctx);
    }

    enterDeclarationSpecifiers(ctx) {
        this.currentRange.declarationSpecifiersNum = ctx.getChildCount();
        //storageClassSpecifier
        //typeSpecifier
        //typeQualifier
        //functionSpecifier
        //alignmentSpecifier
    }

    enterFunctionDefinition(ctx) {
        this.currentRange.pushState("FuncDef");
        this.lastRange = this.currentRange.createSub(ctx, "Function Block");
        console.log("Created");
        super.enterFunctionDefinition(ctx);
    }
    exitFunctionDefinition(ctx) {
        console.log("Exit");
        console.assert(this.currentRange.getState() == "");
        this.currentRange = this.currentRange.parentRg;
        this.currentRange.popState();
        super.exitFunctionDefinition(ctx);
    }

    enterIncludePath(ctx) {
        ctx.children[1].symbol.type = TokenFind("IncludePath");
        super.enterIncludePath(ctx);
    }

    exitExternalDeclaration(ctx) {
        console.assert(this.currentRange.name == "Global");
        // debugger;
    }
    enterExternalDeclaration(ctx) {
        console.assert(this.currentRange.name == "Global");
        console.log("Enter");
        // debugger;
    }
}