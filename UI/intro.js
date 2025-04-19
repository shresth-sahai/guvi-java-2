/*

JS -> UI dev cannot happen -> create interactive web pages 
js -> language of web browser 
now js how to run it in local -> NODE JS -> env to run js outside web browser 

*/
// console.log("ABC");// printing statemnet 
// variables in JS 

// 1 var -> older way , function scoped/ global scoped , hoisted 
// 2 let -> reassigned , ES6 , blocked scope , not hoistimg
// 3 const 

// let name='John';
// const age=12;
// var a=1;

// var name='Alice';
// console.log(name);


// var name="Alice";
// console.log(name);
// hoisting declaration is moved to the top of their scope
//not assignment 
// console.log(age); // undefined
// var age =25;
// console.log(age); // 25

// let name='Alice';
// console.log(name);

// console.log(age); // reference err 
// let age=12;
// console.log(age);
// { block scope
// }
// if(true){
//     let age=25;
//     console.log("line 20",age);
// }
//  console.log("line 22",age);
// function scope
// function a(){
//     var m='Hello';
//     console.log(m);  // Hello
// }
// a()// calling the function to get executed 
// console.log(m);

// if(true){
//     let blockScope='I m inside block';
//     const anotherVariable='Cannot be changed';
//     console.log(blockScope);//  console.log(blockScope);
// }
//  console.log(blockScope); // err 

// re declaration  var allows re declare , let const dont allow
// var name='Alice';
// var name ='Bob';
// console.log(name);

// let name='Alice';
// let name ='Bob';
// console.log(name);

// js is dynamically typed language

// string , number, boolean , object , array , null ,undefined
//symbol, bigint 

// let age;
// console.log(age)
// let empty=null;console.log(empty)
// let p={name:'Alice',age:12};
// let number=[1,2,3];

// let n=5;
// let text="the number is" + n;
// console.log(text); // automatically converted into string 
// // type coercion 













// 1. What is the output of the following code?

// console.log(x);
// var x = 10;

// A) undefined
// B) 10
// C) ReferenceError
// D) null

// Answer: A) undefined

// What is the output of the following code?


// console.log(a);
// let a = 5;
// A) undefined
// B) 5
// C) ReferenceError
// D) null

// Answer: C) ReferenceError

// What is the output of the following code?

// console.log(b);
// var b = 7;
// let c = 5;
// A) undefined
// B) 7
// C) ReferenceError
// D) 5

// Answer: A) undefined

// What will be the output of the following code?


// var x = 10;
// if (true) {
//     var x = 20;
// }
// console.log(x);
// A) 10
// B) 20
// C) undefined
// D) null

// Answer: B) 20

// What is the output of this code?


// const x = 10;
// x = 20;
// console.log(x);
// A) 10
// B) 20
// C) TypeError: Assignment to constant variable.
// D) undefined

// Answer: C) TypeError: Assignment to constant variable.

// What is the output of the following code?


// console.log(a);
// {
//     let a = 10;
// }
// A) undefined
// B) 10
// C) ReferenceError
// D) null

// Answer: C) ReferenceError

// Which of the following can be redeclared in the same scope?

// A) var
// B) let
// C) const
// D) All of the above

// Answer: A) var

// What is the result of the following code?


// console.log(typeof x);
// let x = 5;
// A) undefined
// B) number
// C) ReferenceError
// D) undefined and number

// Answer: C) ReferenceError

// What is the output of the following code?


// function test() {
//     console.log(x);
//     var x = 2;
// }
// test();
// A) undefined
// B) 2
// C) ReferenceError
// D) null

// Answer: A) undefined

// What is the output of the following code?


// var x = 10;
// function foo() {
//     var x = 20;
//     console.log(x);
// }
// foo();
// console.log(x);
// A) 20, 10
// B) 10, 20
// C) undefined, undefined
// D) 20, 20

// Answer: A) 20, 10

// Which of the following statements is true about const?

// A) You can reassign a const variable.
// B) A const variable must be initialized at the time of declaration.
// C) const variables can be updated, but not reassigned.
// D) const variables are function-scoped.

// Answer: B) A const variable must be initialized at the time of declaration.

// What will the following code output?


// let a = 5;
// {
//     let a = 10;
// }
// console.log(a);
// A) 5
// B) 10
// C) undefined
// D) ReferenceError

// Answer: A) 5

// What is the output of the following code?


// let x = 10;
// function test() {
//     let x = 20;
//     console.log(x);
// }
// test();
// A) undefined
// B) 20
// C) 10
// D) ReferenceError

// Answer: B) 20

// Which statement about variable declarations in JavaScript is true?

// A) Variables declared using var are block-scoped.
// B) Variables declared using let and const are function-scoped.
// C) Variables declared using let are not hoisted.
// D) Variables declared with const cannot be reassigned but can be mutated if they are objects.

// Answer: D) Variables declared with const cannot be reassigned but can be mutated if they are objects.

// What is the output of the following code?


// console.log(a);
// let a = 10;
// A) undefined
// B) 10
// C) ReferenceError
// D) null



