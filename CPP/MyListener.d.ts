import antlr4 from "./antlr4.js";
import Lexer from './CPP14Lexer.js';
import Parser from './CPP14Parser.js';
import Listener from './CPP14ParserListener.js';

import { Range, Variables } from "./Variables.js"

export declare function Token(i: number): string;
export declare function Rule(i: number): string;
export declare function TokenFind(name: string): number;
export declare function RuleFind(name: string): number;

export declare class MyListener {
    range: Range;
    currentRange: Range;
    lastVar: Variables;
    lastType: string;
    lastRangeCtx: DirectDeclaratorContext;

    judgeFormat(ctx: antlr4.ParserRuleContext, ...args: (number | string)[]): boolean;
}