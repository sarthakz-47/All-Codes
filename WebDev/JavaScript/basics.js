// Javascript is a dynamically typed language. Runs in browser and on server side.
// Console is a tool to interact with JS in real time, which uses REPL -> read,evaluate,print,loop

// **1.Variables in JS:
// Used to store data for later use puropose
// declared using:
// 1. var -> function-scoped or globally-scoped, can be re-declared and updated
// 2. let -> block-scoped, can be updated but not re-declared
// 3. const -> block-scoped, cannot be updated or re-declared

var age = 25;
let name = "sarthak";
const pi = 3.14;
let a = null;
let b;

// **2.Data types in JS:
// Primitive : Number, String, Boolean, Null, Undefined, Symbol
// Reference : Objects, Arrays, Functions
console.log(typeof age);
console.log(typeof name);
console.log(typeof pi);
console.log(typeof a);
console.log(typeof b);


// 3.Operators in JS:
// Arithimatic: +, -, *, /, %
// Comparision: <, >, <=, >=, ==, ===, !=, !==
// Logical: &&, ||, !
// Assignment: =, +=, -=, *=, /=, %=
// Unary: ++, --


// 4.Strings in JS:
let str = "hello";
let myName = 'sarthak';
let str2 = `hi`;
console.log(str);
console.log(myName);
console.log(str2);

// Indices in strings:
console.log(str[0]);
console.log(myName[1]);
console.log(str2[2]);