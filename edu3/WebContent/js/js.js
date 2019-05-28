//
var name = "hong";
let num = 90;

let flag = true < 10;   
let now = new Date();

const log = console.log;

function f1(){
    let n = 'f1-name';
    console.log(name);
    alert(name);
}

const f2=function(a) {
    if(a == 'yes'){
        alert(a);
    }
}

//var array = ['lee','ko','park',44,56,new Date(),'jeong']

 log('--- array ---')
for(let item of array){
    log(item);
}

log('--- array forEach ---')
array.forEach(i=>log(i));


let aa = 'aa';
let bb = 'bb';
{
    let aa = '{aa}'
    log(aa);
    log(bb);
}

let a = 1;
{
    log(a);
    let a = 2;
}
