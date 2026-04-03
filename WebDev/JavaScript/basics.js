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

// if-else statements:
let age2 = 50;
if (age2 > 18) {
    console.log("you can drive");
}
else if (age2 <= 18 && age2 >= 80) {
    console.log("you cannot drive")
}

// Switch Statement:
let day = 2;
switch (day) {
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    case 4:
        console.log("Thursday");
        break;
    case 5:
        console.log("Friday");
        break;
    case 6:
        console.log("Saturday");
        break;
    case 7:
        console.log("Sunday");
        break;
    default:
        console.log("Invalid day");
}

// Truthy and Falsy:
// everything is JS is true or false in boolean context
// Falsy values: false,0,-0,"",null,undefined,NaN
// Truthy values: evrything else

if (undefined) {
    console.log("1");
} else {
    console.log("0");
}

// Alerts and Promts:
console.error("this is error msg");
console.warn("this is warning msg");
prompt("enter you promt here");


// Practice Questions:
// Question 1:
let num = 10;
if (num % 10 == 0) {
    console.log("good");
} else {
    console.log("bad");
}

// Question 2:
let name1 = prompt("Enter your name:");
let age1 = prompt("Enter your age:");
alert(`${name1} is ${age1} years old.`);

// Question 3:
let quater = 3;
switch (quater) {
    case 1:
        console.log("Jan,Feb,Mar");
        break;
    case 2:
        console.log("Apr,May,Jun");
        break;
    case 3:
        console.log("Jul,Aug,Sep");
        break;
    case 4:
        console.log("Oct,Nov,Dec");
        break;
    default:
        console.log("Invalid quarter");
}

// Question 4:
let str1 = "hello";
if ((str1[0] == 'a' || str1[0] == 'A') && (str1.length > 5)) {
    console.log("golden");
} else {
    console.log("not golden");
}

// Question 5:
let num1 = prompt("enter num1");
let num2 = prompt("enter num2");
let num3 = prompt("enter num3");

if (num1 > num2 && num1 > num3) {
    console.log(`${num1} is largest.`);
} else if (num2 > num3) {
    console.log(`${num2} is largest.`);
} else {
    console.log(`${num3} is largest.`);
}

// Question 6:
let numx = "32";
let numy = "853";

if (numx[numx.length - 1] == numy[numy.length - 1]) {
    console.log("same last digit");
} else {
    console.log("not same last digit");
}