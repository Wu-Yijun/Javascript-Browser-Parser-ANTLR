import calcListener from './calcListener.js'

function logout(ctx, str) {
    console.log(ctx.getChildCount(), ctx.getText(), str,
        ctx.getSourceInterval().start + ":" + ctx.getSourceInterval().stop);
}

class JSListener extends calcListener {

};

JSListener.prototype.enterProgram = function (ctx) {
    logout(ctx, "Program")
};


JSListener.prototype.exitProgram = function (ctx) {
    1
};



JSListener.prototype.enterAssign = function (ctx) {
    logout(ctx, "Assign")
};


JSListener.prototype.exitAssign = function (ctx) {
    1
};


JSListener.prototype.enterPrint = function (ctx) {
    logout(ctx, "Print")
};

JSListener.prototype.exitPrint = function (ctx) {
    1
};


JSListener.prototype.enterCondition = function (ctx) {
    logout(ctx, "Condition")
};

JSListener.prototype.exitCondition = function (ctx) {
    1
};


JSListener.prototype.enterExpression = function (ctx) {
    logout(ctx, "Expression")
};

JSListener.prototype.exitExpression = function (ctx) {
    1
};



JSListener.prototype.enterMultiplyingExpression = function (ctx) {
    logout(ctx, "MultiplyingExpression")
};


JSListener.prototype.exitMultiplyingExpression = function (ctx) {
    1
};



JSListener.prototype.enterPowExpression = function (ctx) {
    logout(ctx, "PowExpression")
};

JSListener.prototype.exitPowExpression = function (ctx) {
    1
};



JSListener.prototype.enterSignedAtom = function (ctx) {
    logout(ctx, "SignedAtom")
};


JSListener.prototype.exitSignedAtom = function (ctx) {
    1
};


JSListener.prototype.enterAtom = function (ctx) {
    logout(ctx, "Atom")
};

JSListener.prototype.exitAtom = function (ctx) {
    1
};


JSListener.prototype.enterNumber = function (ctx) {
    logout(ctx, "Number")
};


JSListener.prototype.exitNumber = function (ctx) {
};


JSListener.prototype.enterConstant = function (ctx) {
    logout(ctx, "Constant")
};

JSListener.prototype.exitConstant = function (ctx) {
    1
};


JSListener.prototype.enterVariable = function (ctx) {
    logout(ctx, "Variable")
};

JSListener.prototype.exitVariable = function (ctx) {
    1
};


JSListener.prototype.enterFunc = function (ctx) {
    logout(ctx, "Func")
};

JSListener.prototype.exitFunc = function (ctx) {
    1
};


JSListener.prototype.enterFuncname = function (ctx) {
    logout(ctx, "Funcname")
};

JSListener.prototype.exitFuncname = function (ctx) {
    1
};


JSListener.prototype.enterRelop = function (ctx) {
    logout(ctx, "Relop")
};

JSListener.prototype.exitRelop = function (ctx) {
    1
};

JSListener.prototype.enterEmptyline = function (ctx) {
    logout(ctx, "Emptyline")
};

JSListener.prototype.exitEmptyline = function (ctx) {
    1
};


export default JSListener;