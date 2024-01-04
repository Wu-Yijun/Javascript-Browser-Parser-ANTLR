// Range 只在作用域相关时创建。
export class Range {
    constructor(start, end, parentRg, pos_index) {
        this.start = start;
        this.end = end;
        this.parentRg = parentRg;
        this.pos_index = pos_index;
        this.child = [];

        this.state = [];

        this.vars = []; // should by order
        this.vars_names = [];
    }
    createSub(ctx) {
        let index = this.child.length;
        var newRange = new Range(ctx.getSourceInterval().start, ctx.getSourceInterval().stop, this, index);
        this.child.push(newRange);
        return newRange;
    }
    addVar(variables) {
        return this.vars.push(variables) - 1;
    }
    hasVar(name) {
        if (this.vars_names.includes(name) ||
            (this.parentRg && this.parentRg.hasVar(name)))
            return true;
        return false;
    }
    findVar(name) {
        let index = this.vars_names.indexOf(name);
        if (index != -1)
            return this.vars[index];
        if (this.parentRg)
            return this.parentRg.findVar(name);
        return null;
    }
    checkVarRepeat(name, pos) {
        for (let i of this.vars)
            if (i.name == name) {
                let res = i.notEnabled(pos);
                if (res == 0)
                    return true;
                if (res > 0)
                    break;
            }
        return false;
    }
    checkVarRepeatAll(name, pos) {
        if (this.checkVarRepeat(name, pos))
            return true;
        if (this.parentRg)
            return this.parentRg.checkVarRepeatAll(name, pos);
        return false;
    }
    extendTo(name) {
        let ran = this;
        while (ran.name != name && ran.parentRg)
            ran = ran.parentRg;
        return ran;
    }
    getState(id = 0) {
        return this.state[this.state.length - 1 - id] || "";
    }
    setState(state, id = 0) {
        this.state[this.state.length - 1 - id] = state;
    }
    popState() {
        return this.state.pop() || "";
    }
    pushState(state) {
        return this.state.push(state);
    }
}

export class Variables {
    constructor(type, name, identifier, range, start, stop) {
        this.type = type;
        this.name = name;
        this.identifier = identifier;
        // inside which range
        this.range = range;
        this.start = start || range.start;
        this.stop = stop || range.stop;

        this.marks = [];
        this.varList = [];
        range.addVar(this);
    }

    notEnabled(pos) {
        if (pos < this.start) {
            if (pos < this.range.start)
                return -2;
            else
                return -1;
        } else if (pos > this.stop) {
            if (pos > this.stop)
                return 2;
            else
                return 1;
        }
        return 0;
    }
};