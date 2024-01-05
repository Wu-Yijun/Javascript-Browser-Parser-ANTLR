// Range 只在作用域相关时创建。
export class Range {
    constructor(start, stop, parentRg, pos_index) {
        this.start = start;
        this.stop = stop;
        this.parentRg = parentRg;
        this.pos_index = pos_index;
        this.child = [];

        this.state = [];

        this.vars = []; // should by order
        this.vars_names = [];
    }
    createSub(ctx, name) {
        let index = this.child.length;
        var newRange = new Range(ctx.getSourceInterval().start, ctx.getSourceInterval().stop, this, index);
        newRange.name = name;
        this.child.push(newRange);
        return newRange;
    }
    addVar(variables) {
        this.vars_names.push(variables.name);
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
        if (this.state.length == 0)
            debugger;
        return this.state.pop() || "";
    }
    pushState(state) {
        return this.state.push(state);
    }

    goForRange(pos) {
        if (this.start > pos || this.stop < pos)
            return null;
        for (let i of this.child) {
            let res = i.goForRange(pos);
            if (res)
                return res;
        }
        return this;
    }
    gothroughForVar(name, pos, identifier) {
        if (this.start > pos || this.stop < pos)
            return null;
        for (let i of this.child) {
            let res = i.gothroughForVar(name, pos, identifier);
            if (res)
                return res;
        }
        // 从内向外找!
        for (let i of this.vars)
            if (i.name == name) {
                let res = i.notEnabled(pos);
                if (res == 0)
                    if (identifier) {
                        if (identifier == i.identifier)
                            return i;
                    } else {
                        return i;
                    }
                if (res > 0)
                    break;
            }
        return null;
    }
    insideName(name) {
        if (name == this.name)
            return true;
        if (this.parentRg && this.parentRg.insideName(name))
            return true;
        return false;
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