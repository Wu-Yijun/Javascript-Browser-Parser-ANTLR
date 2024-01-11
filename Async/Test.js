function yieldToMain() {
    return new Promise(resolve => {
        setTimeout(resolve, 10);
    });
}

async function fun1() {
    for (let i = 0; i < 10; i++) {
        fun2();
        console.log("fun1 over");
    }
}

function fun2() {
    fun3();
    for (let i = 0; i < 10000000; i++)
        i++;
    console.log("fun2 over");
    
}

async function fun3() {
    await yieldToMain();
    console.log("fun3");
    for (let i = 0; i < 1000000; i++)
        i++;
    console.log("fun3 over");
}

fun1();