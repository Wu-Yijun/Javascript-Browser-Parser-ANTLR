
export class Range {
    constructor(start, end, parentRg, pos_index) {
        this.start = start;
        this.end = end;
        this.parentRg = parentRg;
        this.pos_index = pos_index;
        this.sub = [];
        this.vars = [];
        this.cur_vars = [];
        this.inner_vars = [];
        this.inner_index = [];
    }
    addSub(start, end) {
        let index = this.sub.length;
        var newRange = new Range(start, end, this, index);
        this.sub.push(newRange);
        return newRange;
    }
    addVar(variables) {
        this.vars.push(variables);
        this.cur_vars.push(variables.name);
        if (this.parentRg)
            this.parentRg.addVarSub(variables.name, this.pos_index);
        return this.vars.length - 1;
    }
    addVarSub(name, index) {
        this.inner_vars.push[name];
        this.inner_index.push[index];
        if (this.parentRg)
            this.parentRg.addVarSub(name);
    }
    hasVar(name) {
        return this.cur_vars.includes(name) || this.inner_vars.includes(name);
    }
    findVar(name) {
        let index = this.cur_vars.indexOf(name);
        if (index != -1)
            return this.vars[index];
        index = this.inner_vars.indexOf(name);
        if (index != -1)
            return this.sub[index].findVar(name);
        return null;
    }
    extendTo(name) {
        let ran = this;
        while (ran.name != name && ran.parentRg)
            ran = ran.parentRg;
        return ran;
    }

    setProperty(name) {
        this.property = name;
    }
    getProperty() {
        if (this.property)
            return this.property;
        if (this.parentRg)
            return this.parentRg.getProperty();
        return "";
    }
}

export class Variables {
    constructor(type, name, identifier, range) {
        this.type = type;
        this.name = name;
        this.identifier = identifier;
        this.range = range;
        this.start = range.start;
        this.stop = range.stop;
    }

    extendRangeTo(name) {
        while (this.range != name && this.range.parentRg)
            this.range = this.range.parentRg;
    }

    notEnabled(index) {
        if (index > this.range.stop)
            return 2;
        if (index < this.range.start)
            return 1;
        if (index < this.start)
            return -1;
        return 0;
    }
};