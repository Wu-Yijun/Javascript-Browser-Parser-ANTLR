import antlr4 from "./antlr4.js";
import Lexer from './CPP14Lexer.js';
import Parser from './CPP14Parser.js';
import Listener from './CPP14ParserListener.js';

import { Range, Variables } from "./Variables.js"

function AToI(a) {
    return parseInt(a.replace("N", "-"));
}
function IToA(i) {
    return i >= 0 ? i : "N" + Math.abs(i);
}

export function Token(i) {
    return Lexer.symbolicNames[i] || ("T__" + IToA(i - 1));
}
export function Rule(i) {
    return Parser.ruleNames[i] || ("R__" + IToA(i - 1));
}
export function TokenFind(name) {
    let index = Lexer.symbolicNames.indexOf(name);
    if (index === -1 && name.substr(0, 3) == "T__") {
        return AToI(name.substr(3).replace) + 1;
    }
    return index;
}
export function RuleFind(name) {
    let index = Parser.ruleNames.indexOf(name);
    if (index === -1 && name.substr(0, 3) == "R__") {
        return AToI(name.substr(3)) + 1;
    }
    return index;
}


export class MyListener extends Listener {
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

    // enterUnaryExpression(ctx){
    //     console.log(ctx, ctx.getText());
    // }
    enterIdentifier(ctx){
        console.log(ctx, ctx.getText());
    }
}