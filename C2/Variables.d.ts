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

    constructor(type: string, name: string, identifier: string, range: Range);

    extendRangeTo(name: string): void;

    // return 0 if is enabled
    // return 1 if before out of block
    // return 2 if  after out of block
    // return -1 if inside block but before defines
    notEnabled(index: number): number;
};

export declare class Range {
    start: number;
    end: number;
    parentRg?: Range;
    pos_index?: number;
    property?: string;

    sub: Array<Range>;
    vars: Array<Variables>;
    cur_vars: Array<string>;
    inner_vars: Array<string>;
    inner_index: Array<number>;

    constructor(start: number, end: number, parentRg?: Range, pos_index?: number);
    addSub(start: number, end: number): Range;
    addVar(variables: Variables): number;
    addVarSub(name: string, index: number): void;
    hasVar(name: string): boolean;
    findVar(name: string): ?Variables;
    extendTo(name: string): Range;


    setProperty(name: string): void;
    getProperty(): string;
}
