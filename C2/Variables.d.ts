export declare class Variables {
    type: string;
    name: string;
    identifier: string;
    // this range may not the range variables are in
    // the range where vars are in is its defination spot.
    range: Range;
    start: number;
    stop: number;

    // used to changed render styles
    marks: Array<string>;

    varList: Array<Variables>;

    constructor(type: string, name: string, identifier: string,
        range: Range, start?: number, stop?: number);

    // return  0 if is enabled
    // return -1 if before inside block
    // return -2 if before out of block
    // return  1 if after  out of block
    // return  1 if after  inside block
    notEnabled(pos: number): number;
};

export declare class Range {
    start: number;
    end: number;
    parentRg?: Range;
    pos_index?: number;
    name: string;
    state: Array<string>;


    child: Array<Range>;

    vars: Array<Variables>;
    var_names: Array<string>;

    constructor(start: number, end: number, parentRg?: Range, pos_index?: number);

    createSub(ctx: ParserRuleContext): Range;
    addVar(variables: Variables): number;
    // addVarSub(name: string, index: number): void;

    hasVar(name: string): boolean;
    findVar(name: string): ?Variables;
    checkVarRepeat(name: String, pos: number): boolean;
    checkVarRepeatAll(name: String, pos: number): boolean;
    extendTo(name: string): Range;

    getState(id?: number): string;
    setState(state: string, id?: number): void;
    popState(): string;
    pushState(state: string): number;
}
