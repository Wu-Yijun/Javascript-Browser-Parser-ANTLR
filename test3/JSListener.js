import CListener from './TestListener.js';

/*
regular replace rule
from:
enter(.*?)\(ctx\) \{
    \}
to:
enter$1(ctx) {
        logout(ctx, "$1");
    }
*/

function logout(ctx, str) {
    console.log(ctx.getChildCount(), ctx.getText(), str,
        ctx.getSourceInterval().start + ":" + ctx.getSourceInterval().stop);
}

export default class JSListener extends CListener {


};
