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
            if (args[i] instanceof String) {
                if (!(ctx.children[i] instanceof antlr4.tree.TerminalNode) ||
                    args != ctx.children[i].symbol.text)
                    return false;
            } else if (typeof args[i] == 'number') {
                if (!(ctx.children[i] instanceof CParser.DeclaratorContext) ||
                    args != ctx.children[i].ruleIndex)
                    return false;
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
            this.lastRange = this.currentRange.createSub(ctx);
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
            if (state == "Declare")
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
        this.currentRange.popState();
        super.exitDirectDeclarator(ctx);
    }


    // 遇到类型符
    enterTypeSpecifier(ctx) {
        this.lastType = ctx.getText();
        super.enterTypeSpecifier(ctx);
    }

    // 遇到para声明
    enterTypedefName(ctx) {
        switch (this.currentRange.getState()) {
            case "FunctionParas": {
                if (this.currentRange.getState(1) == "")
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
        this.currentRange.pushState("Declare");
        super.enterDeclaration(ctx);
    }
    exitDeclaration(ctx) {
        this.currentRange.popState();
        super.exitDeclaration(ctx);
    }

    enterFunctionDefinition(ctx) {
        this.currentRange.pushState("FuncDef");
        this.lastRange = this.currentRange.createSub(ctx);
        console.log("Created");
        super.enterFunctionDefinition(ctx);
    }
    exitFunctionDefinition(ctx) {
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