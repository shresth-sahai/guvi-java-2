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



// function a (v){
// }
// const a =(v) =>{
// }
// functions are first class citizens 
// everything is an object 
//hosiitng is applicable to function, classes , var
// const func1 = () => console.log(1)
// func1() //1 
// func2() //2 
// function func2() {
//   console.log(2)
// }
// func3() // error 
// // function exp 
// var func3 = function func4() {
//   console.log(3) 
// }
// IIFE -> defined and invoked immediately after creation

// (function(a,b){
//     console.log("Hi Im IIFE");
// })();

// var a = 1
// function a() {
// }

// console.log(typeof a)

// var b
// function b() {
// }
// b = 1

// console.log(typeof b)

// function c() {
// }
// var c = 1;

// console.log(typeof c)

// var d = 1;

// (function(){
//   d = '2'
//   console.log(typeof d)
//   function d() {
//   }
// })()

// console.log(typeof d)

// var e = 1
// const f = function e() {}

// console.log(typeof e)

// var foo = 1;
// (function () {
//   console.log(foo);
//   foo = 2;
//   console.log(window.foo);
//   console.log(foo);
//   var foo = 3;
//   console.log(foo);
//   console.log(window.foo)
// })()


// window is global object containing everythins

// this-> execution context 
// in browser ->
// console.log(this) // window obj 
// function show(){
//     console.log(this)
// }
// show()
// const p={
//     name:'ALICE',
//     greet: function(){
//          console.log(this.name);
//     }
// }
// p.greet();
// arrow is not lexical scope 
// const p={
//     name:'ALICE',
//     greet: () => {
//          console.log(this.name);
//     }
// }
// p.greet();


// var foo = 1;
// (function () {
//   console.log(foo);
//   foo = 2;
//   console.log(window.foo);
//   console.log(foo);
//   var foo = 3;
//   console.log(foo);
//   console.log(window.foo)
// })()



// var bar = 1;
// function foo() {
//   return this.bar++
// }
// const a = {
//   bar: 10,
//   foo1: foo,
//   foo2: function() {
//     return foo()
//   },
// } 
// console.log(a.foo1.call()) // point to window obj // 1
// console.log(a.foo1()) //10
// console.log(a.foo2.call())
// console.log(a.foo2())

// const obj = {
//   a: 1,
//   b: this.a + 1,
//   c: () => this.a + 1,
//   d() {
//     return this.a + 1
//   },
//   e() {
//     return (() => this.a + 1)()
//   }
// }
// console.log(obj.b) // window(undefined+1)=> NAN
// console.log(obj.c())// (undefined+1)=> NAN
// console.log(obj.d()) // 2
// console.log(obj.e()) //2 

// var a = 1
// function func() {
//   a = 2
//   console.log(a)
//   var a
// }
// func() // 2 
// console.log(a) // 1 
// if (!('b' in window)) {
//   var b = 1
// }
// console.log(b) // undefined 

(() => {
    if (!fn) {
      function fn() {
        console.log('2')
      }
    }
    fn()
  })()
  function fn() {
    console.log('1')
  }
  
  function fn1() {
    console.log('3')
  }
  (() => {
    if (!fn1) {
      function fn1() {
        console.log('4')
      }
    }
    fn1()
  })()
  
  
  // another one !
  (() => {
    if (false) {
      function fn3() {
        console.log('5')
      }
    }
    fn3()
  })()
  
  
  
  
  
  
  
  

  
  // callbacks -> async 
// func passed as an arg to another executed when 
// function completes execution 
// a callback is executed after task is completed
// async function 
// function fetchData(callback){
//     setTimeout(()=>{
//         const data={name:'A',age:12};
//         callback(data);
//     },15000);
// }
// function handleData(data){
//     console.log(data);
// }
// fetchData(handleData);

// function a() {
//   console.log(1) //1 2 1 
//   return {
//     a: function() {
//       console.log(2)
//       return a()
//     }
//   }
// }
// a().a()

<<<<<<< HEAD
// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

// for loop

// for(let i=0;i<5;i++){
//     console.log(i);
// }

// let i=0;
// while(i<5){
//      console.log(i);
//      i++;
// }
// let i=0;
// do{
//   console.log(i);
//   i++;
// }while(i<5); 
// everything in js is an object 
// functuon are first class citizens

// for in loop -> loop over object properties 
// const p={name:'John',age:30};
// for(let key in p){
//     console.log(key,p[key]);
// }

// for of loop -> loop over iterable objects like arrays
// let nums=[1,2,3];
// for(let num of nums){
//     console.log(num);
// }


// arrays 
// let arr=[1,2,3];
// arr.push(4);
//  console.log(arr);
//  arr.pop();
//   console.log(arr);
  
//   arr.forEach(item => console.log(item));
  
//   // map creates a new arr by applying a function to each element 
  
//   let d=arr.map(num=>num*2);
// console.log(d);






=======

{/* <p class="p1" id="p"> 
  this is para
  <p>
    <p class="p1"> 
  this is para
  <p>
    <p class="p1"> 

  this is para
  <p></p> */}

//   // const element= document.querySelector('.p1');
// const elements=document.querySelectorAll('.p1');
// elements.forEach((elem)=>console.log(elem));

// // alert("this is an alert")
// // let res=confirm('do u want to proeceed');
// // console.log(res)

// // let name=prompt('Enter ur name')
// // console.log(name)

// let ele1=document.getElementById('p');


// Objective:
// Create a simple interactive web page that utilizes JavaScript to manipulate the DOM and handle user events.

// Task:

// Design a webpage that contains a button and a div element.
// The page should have the following behavior when the button is clicked:
// Change the content of the div element to a new message ("Button was clicked!").
// Add a new p (paragraph) element to the body of the page with some text ("A new paragraph added.").
// Display an alert box that informs the user that the button has been clicked.
// Requirements:

// The webpage should consist of an HTML button and a div element.

// JavaScript should be used to modify the content of the div when the button is clicked.

// A new p element should be dynamically created and added to the webpage.

// An alert should be displayed when the button is clicked.

// const button =document.getElementById('#my-button');
// const div=document.getElementById('my-div');

// button.addEventListener('click',()=>{
//     div.textContent='........';
//     const newPara=document.createElement('p');
//     newPara.textContent='.....';
//     document.body.appendChild(newPara);
//     alert('Clicked !')
// })


// Create a webpage that changes the background color of the page when a button is clicked.

// Task:

// Create a button and a div element on the webpage.

// When the button is clicked:

// Change the background color of the div to a random color each time.

// Display an alert box showing the name of the color that was applied.


// Create a webpage with a button that toggles the visibility of a text message.

// Task:

// Create a button and a p element (for the text) on the webpage.

// When the button is clicked:

// Toggle the visibility of the text inside the p element (i.e., show it if it's hidden, hide it if it's shown).

// Change the button text to indicate the current state (e.g., "Show Text" or "Hide Text").

//1 

const colors=['red','blue'];
const button= document.getElementById('color-button');
const div=document.getElementById('color-div');

button.addEventListener('click',()=>{
    const randomColor=colors[Math.floor(Math.random()*colors.length)];
    div.style.backgroundColor=randomColor;
    alert('')
})


// Task:

// Create two buttons: one to increment the counter and one to decrement the counter.

// Display the current value of the counter in a div.

// When the "Increment" button is clicked, increase the counter by 1.

// When the "Decrement" button is clicked, decrease the counter by 1.

// The counter should not go below zero.
<<<<<<< HEAD
>>>>>>> 52b0917 (questions addeed)
=======



// // array destructuring -> Object 
// const arr=[1,2,3];
// // const a=arr[0]
// const[a,b,c]=arr;
// const person={name:'Alice',age:30};
// const {name,age}=person;

// const add=(a,b)=>a+b;
// console.log(add(3,4)); // 7 

// // rest opr (...) -> collect all remainingin elements into an array of object 
// const sum=(...numbers) => numbers.reduce((a,b)=> a+b,0);
// console.log(sum(1,2,3,4,5,56,6,66)); //  we dont want to limit the no of parameters

// const person1= {name:'Bob',age:33,country:'India'};
// const {name1,...otherinfo}=person1;

// // spread opr -> used to spread the elelmts from array / object to another array / object 
// const a1=[1,2,3];
// const a2=[...a1,4,5];

// const p1={name:'Bob',age:33,country:'India'};
// const p2={...p1,age:21};


>>>>>>> 393b109 (code)
