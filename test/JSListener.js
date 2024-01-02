// var antlr4 = require('antlr4/index');
// const calcListener = require('./calcListener.js').calcListener
// const fs = require("fs")

import antlr4 from "../node_modules/antlr4/src/antlr4/index.web.js"
import calcListener from './calcListener.js'

// include directly the implementation of the compiler

var tContent = []
var tFile = undefined;

var openTarget = function () {
    // try {
    //     tFile = fs.openSync(JSListener.tFileName, "w")
    // }
    // catch (err) {
    //     console.log("Target file not created. " + err.message)
    //     return;
    // }
}

var closeTarget = function () {
    // if (tFile == undefined) return;
    for (var line in tContent) {
        // fs.writeSync(tFile, tContent[line].trim() + "\n")
        console.log("write:", tContent[line].trim())
    }
}

var write = function (data) {
    tContent.push(data)
}


/* main contents*/

function LoopLog(ctx) {
    for (let i = 0; i < ctx.getChildCount(); i++) {
        console.log(ctx.getChild(i).getText());
    }
}

/*
   JSListener
   Implementation of the listener of the calc language.
   Demo by Scriptol.com
   BSD license.
*/

class JSListener extends calcListener {

};

// JSListener.tFileName = "test"

JSListener.prototype.enterProgram = function (ctx) {
    // create the target file
    openTarget()
};


JSListener.prototype.exitProgram = function (ctx) {
    // fill the target file and close it
    closeTarget()
    console.log(ctx)
};



JSListener.prototype.enterAssign = function (ctx) {
    LoopLog(ctx);
};


JSListener.prototype.exitAssign = function (ctx) {
    // get the variable
    var t1 = ctx.getChild(0).getText()
    // skip the := symbol to use = instead
    // get the expression
    var t2 = ctx.getChild(2).getText()
    write(t1 + "=" + t2)
};


JSListener.prototype.enterPrint = function (ctx) {
};

JSListener.prototype.exitPrint = function (ctx) {
    var temp = "console.log("
    // I skip the 'print' keyword so go to second child
    temp += ctx.getChild(1).getText()
    temp += ")"
    write(temp)
};


JSListener.prototype.enterCondition = function (ctx) {
};

JSListener.prototype.exitCondition = function (ctx) {
};


JSListener.prototype.enterExpression = function (ctx) {
};

JSListener.prototype.exitExpression = function (ctx) {
};



JSListener.prototype.enterMultiplyingExpression = function (ctx) {
};


JSListener.prototype.exitMultiplyingExpression = function (ctx) {
};



JSListener.prototype.enterPowExpression = function (ctx) {
};

JSListener.prototype.exitPowExpression = function (ctx) {
};



JSListener.prototype.enterSignedAtom = function (ctx) {
};


JSListener.prototype.exitSignedAtom = function (ctx) {
};


JSListener.prototype.enterAtom = function (ctx) {
};

JSListener.prototype.exitAtom = function (ctx) {
};


JSListener.prototype.enterNumber = function (ctx) {
};


JSListener.prototype.exitNumber = function (ctx) {
};


JSListener.prototype.enterConstant = function (ctx) {
};

JSListener.prototype.exitConstant = function (ctx) {
};


JSListener.prototype.enterVariable = function (ctx) {
};

JSListener.prototype.exitVariable = function (ctx) {
};


JSListener.prototype.enterFunc = function (ctx) {
};

JSListener.prototype.exitFunc = function (ctx) {
};


JSListener.prototype.enterFuncname = function (ctx) {
};

JSListener.prototype.exitFuncname = function (ctx) {
};


JSListener.prototype.enterRelop = function (ctx) {
};

JSListener.prototype.exitRelop = function (ctx) {
};

JSListener.prototype.enterEmptyline = function (ctx) {
};

JSListener.prototype.exitEmptyline = function (ctx) {
    write("\n")
};


export default JSListener;
// exports.JSListener = JSListener;