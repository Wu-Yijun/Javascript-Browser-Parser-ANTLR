import CListener from './CListener.js';
import CParser from './CParser.js';

import { Range, Variables } from "./Variables.js"

export declare class JSListenerRun {
    range: Range;
    currentRange: Range;

    constructor(range);

    checkRename(pos: number, name: string, range: Range, until?: string): boolean;

}