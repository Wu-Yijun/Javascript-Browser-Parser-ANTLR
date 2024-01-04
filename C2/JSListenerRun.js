import antlr4 from "./antlr4.js";
import CLexer from "./CLexer.js";
import CParser from "./CParser.js";

import JSListener from "./JSListener.js";

import { Range, Variables } from "./Variables.js"

export function Token(i) {
    return CLexer.symbolicNames[i] || ("T__" + i);
}
export function Rule(i) {
    return CParser.ruleNames[i] || ("R__" + i);
}
export function TokenFind(name) {
    let index = CLexer.symbolicNames.indexOf(name);
    if (index === -1 && name.substr(0, 3) == "T__") {
        return parseInt(name.substr(3));
    }
    return index;
}
export function RuleFind(name) {
    let index = CParser.ruleNames.indexOf(name);
    if (index === -1 && name.substr(0, 3) == "R__") {
        return parseInt(name.substr(3));
    }
    return index;
}

export class JSListenerRun extends JSListener {

    constructor(tokens) {
        super();
        this.range = new Range(0, tokens.tokens.length);
        this.currentRange = this.range;
    }

    checkRename(pos, name, range, until) {
        if (until)
            range = range.extendRangeTo(until);
        let variable = range.findVar(name);
        if (variable && variable.notEnabled(pos))
            return false;
        return true;
    }

    enterCompilationUnit(ctx) {
        var range = new Range(ctx.getSourceInterval().start, ctx.getSourceInterval().stop);
        range.setProperty("Global");
        this.range = range;
        this.currentRange = range;
        super.enterCompilationUnit(ctx);
    }
    exitCompilationUnit(ctx){
        console.log(this.range);
        super.enterCompilationUnit(ctx);
    }
    // 进入宏定义
    enterDefineMacro(ctx) {
        var range = this.currentRange.addSub(ctx.getSourceInterval().start, ctx.getSourceInterval().stop);
        range.setProperty("Macro");
        this.currentRange = range;
        super.enterDefineMacro(ctx);
    }
    exitDefineMacro(ctx) {
        this.currentRange = this.currentRange.parentRg;
        super.exitDefineMacro(ctx);
    }
    enterDirectDeclarator(ctx) {
        var range = this.currentRange.addSub(ctx.getSourceInterval().start, ctx.getSourceInterval().stop);
        if (ctx.getChildCount() == 1) {
            // Identifer
            if (Token(ctx.children[0].symbol.type) == 'Identifier') {
                // new variable
                switch (range.getProperty()) {
                    case "Macro": {
                        // if(this.checkRename(ctx.))
                        // 定义宏变量（替换规则）
                        var defs = new Variables("", ctx.children[0].symbol.text, "DefinedWord", this.currentRange);
                        // 延拓作用域到上一代码块
                        defs.extendRangeTo("Block");
                        // 保存到最小作用域。
                        
                        break;
                    }
                    case "MacroFun": {
                        // 定义宏函数名
                        var defs = new Variables("", ctx.children[0].symbol.text, "DefinedFunName", this.currentRange);
                        defs.extendRangeTo("Block");
                    }
                }
            }
        } else if (ctx.getChildCount() == 4) {
            if (ctx.children[1] == "(" && ctx.children[3] == ")") {
                // parameterTypeList or identifierList?
                if (this.currentRange.getProperty() == "Macro") {
                    // 宏函数表达式 f(x,...)
                    range.setProperty("MacroFun");
                }
                // 定义函数（含参数形式或不含参数形式）

            }
        }
        this.currentRange = range;
        super.enterDirectDeclarator(ctx);
    }
    exitDirectDeclarator(ctx) {
        this.currentRange = this.currentRange.parentRg;
    }

    enterIncludePath(ctx) {
        ctx.children[1].symbol.type = TokenFind("IncludePath");
        super.enterIncludePath(ctx);
    }
}