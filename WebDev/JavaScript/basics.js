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
let num4 = 10;
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

// String Methods in JS:
// Trim Method: Removes extra unwanted spaces from string:
let oldMsg = "       Hello World   ";
let oldMsg2 = "Hello World"
console.log(oldMsg.trim());

// Upper / Lower case method:
console.log(oldMsg2.toLowerCase());
console.log(oldMsg2.toUpperCase());

// indexOf method:
console.log(oldMsg2.indexOf('H'));

// Slice Method:
console.log(oldMsg2.slice(6));
console.log(oldMsg2.slice(0, 6));

// Replace Method:
console.log(oldMsg2.replace("World", "Sarthak"));
// Reapeat Method:
console.log(oldMsg2.repeat(3));

// Practice Questions:
//1: trim and convert to uppercase:
let msg = "help!";
// Method Chaining:
let newMsg = msg.trim().toUpperCase();
console.log(newMsg);


// Arrays in JS: Mutable & stores multiple data types values in single variable
// Creating and debugging arrays:
let array = [1, 2, 3, 4]; // array of numbers
let array1 = [true, false]; // array of bools
let array2 = ["red", "yellow", "green"]; // array of strings
let array3 = [1, true, "red", null, 3.14, 'a']; // mixed array

// Array Methods:
// 1.push() & pop():
array.push(10); // add to start
console.log(array);
array2.pop(); // remove from end
console.log(array2);

// 2: unshift() / shift():
array.unshift(0);
console.log(array); // add to start
array3.shift();
console.log(array3); // remove from start

// 3: indexOf() / includes():
console.log(array.indexOf(2));
console.log(array3.includes(10));

// 4:concat() / reverse():
console.log(array.concat(array1));
console.log(array.reverse());

// 5:slice(): extracts array elements
console.log(array.slice(1, 3));
console.log(array.slice(3));

// 6:splice(): remmoves / adds array elements
let array4 = [1, 2, 3, 4, 5, 6, 7, 8];
array4.splice(0, 2);
console.log(array4);

array4.splice(1, 3, "apple", "mango");
console.log(array4);

// 7:sort(): sorts the array converting val into strings
let array5 = ["xuv", "bmw", "toyota", "apache"];
array5.sort();
console.log(array5);

let array6 = [100, 96, 84, 2, 102];
array6.sort();
console.log(array6); // error because it converts num into string UTF numbers and then sorts

// Array References:
// References = address of val in memory
// here in array7 add of '1' is 123 and in array8 add of '1' is 789
let array7 = [1, 2, 3];
let array8 = [1, 2, 3];
console.log(array7 == array8);
// returns false because both elements are same but addreses are diffrent!

// Copying array works:
let array9 = array7;
array9.push(10);
console.log(array9);
console.log(array7);
// here add of both var points to same element!

// Constant Arrays:
// we can add , remove in const array but cannot change the entire array:
const array10 = [1, 2, 3, 4];
array10.push(11);
console.log(array10);
array10.pop();
console.log(array10);

// array10 = [11, 22, 33]; // error cannot reassign!

// Nested Arrays:
// arrays in arrays, 2D:
let array11 = [[1, 2], [3, 4], [5, 6]];
console.log(array11);
console.log(array11[0][1]);

// Practice Questions:
//1: For the given start state of an array, change it to final form using splice.
let start = ['jan', 'jul', 'mar', 'aug'];
// op:['jul','jun','mar','aug']
let result = start.splice(0, 2, 'jul', 'jun');
console.log(start);

//2:Return the index of the "javascript" from the given array if it was revresed:
let lng = ['java', 'html', 'css', 'js', 'react', 'node'];
console.log(lng.reverse().indexOf('js'));


// Assignments Questions:
//1:Write a JavaScript program to get the first n elements of an array.[n can be any positive number].
let arr = [7, 9, 0, -2];
let n = 3;
console.log(arr.slice(0, n));

//2:Write a JavaScript program to get the last n elements of an array.[n can be any positive number]
let arr2 = [7, 9, 0, -2];
let n2 = 3;
console.log(arr2.slice(arr2.length - n));

//3:Write a JavaScript program to check whether a string is blank or not.
let str3 = prompt("Enter a string:");
if (str3 == "") {
    console.log(`given String ${str3} is empty.`)
} else {
    console.log(`given String ${str3} is not empty.`)
}

//4.Write a JavaScript program to test whether the character at the given (character) index is lowercase
let str4 = "sarthak";
let idx = 3;
if (str4[idx] == str4[idx].toLowerCase()) {
    console.log("Character is lowercase");
} else {
    console.log("Character is not lowercase");
}

//5: Write a JavaScript program to strip leading and trailing spaces from a string.
console.log(`original string before: ${str3}`);
console.log(`original string after: ${str3.trim()}`);

//6:Write a JavaScript program to check if an element exists in an array or not.
let arr3 = [1, 2, 3, 4];
let ele = 10;

if (arr3.indexOf(ele) != -1) {
    console.log(`${ele} do exists in array.`);
} else {
    console.log(`${ele} do not exists in array.`);
}

// Loops in JS:
// For loops: for(intitalization;condition;updation){work}
// Print numbers from 1 to 5:
for (let i = 0; i <= 5; i++) {
    console.log(i);
}
console.log("");

// Print odd numbers from 1 to 10:
for (let i = 0; i <= 10; i++) {
    if (i % 2 != 0) {
        console.log(i);
    }
}
console.log("");

// Print even numbers from 1 to 10:
for (let i = 0; i <= 10; i++) {
    if (i % 2 == 0) {
        console.log(i);
    }
}
console.log("");

// Print table of 5:
for (let i = 1; i <= 10; i++) {
    console.log(5 * i);
}
console.log("");

// Infinite Loops:
// for (let i = 0; i >= 0; i++) {
//     console.log("hi");
// }
// console.log("");

// Nested Loops:
for (let i = 0; i <= 3; i++) {
    for (let j = 0; j <= 3; j++) {
        console.log(j);
    }
    console.log("");
}
console.log("");

// While Loops: while(condition){work}
let i = 1;
while (i <= 5) {
    console.log(i);
    i++;
}
console.log("");

// Break keyword: used to terminate from the loop
let lat = 1;
while (lat <= 5) {
    if (lat == 3) {
        break;
    }
    console.log(lat);
    lat++;
}
console.log("");

// Loops with arrays:
let fruits = ["mango", "apple", "banana", "kiwi", "orange"];
for (let i = 0; i < fruits.length; i++) {
    console.log(fruits[i]);
}
console.log("");

// Loops with nested arrays:
let students = [["sarthak", "adarsh", "harsh"], ["no-one", "sanika", "kirti"]];
for (let i = 0; i < students.length; i++) {
    for (let j = 0; j < students[i].length; j++) {
        console.log(students[i][j]);
    }
    console.log("");
}

// for-of loop:
for (let fruit of fruits) {
    console.log(fruit);
}
console.log("");

for (let char of "sarthak") {
    console.log(char);
}
console.log("");

// Nested for-of loops:
for (let std of students) {
    for (let stds of std) {
        console.log(stds);
    }
    console.log("");
}


// Practice Questions:
// 1: Write a JS program to delete all ocurrences of element ‘num’ in a given array.
// Example:if arr=[1,2,3,4,5,6,2,3] & num = 2
// Result should be arr=[1,3,4,5,6,3]

let arrX = [1, 2, 3, 4, 5, 6, 2, 3];
let num = 2;
for (let i = 0; i < arrX.length; i++) {
    if (arrX[i] == num) {
        s
        arrX.splice(i, 1);
    }
}
console.log(arrX);

// 2: count the digits in the number:
let num5 = 287152;
let count = 0;
while (num5 > 0) {
    num5 = Math.floor(num5 / 10);
    count++;
}
console.log(count);

// 3: Find the sum of digits in a number:
let num6 = 287152;
let sum = 0;

while (num6 > 0) {
    let rem = (num6 % 10);
    sum = sum + rem;
    num6 = Math.floor(num6 / 10);
}
console.log(sum);

// 4: factorial of number n:
let fact = 1;
let n3 = 5;

for (let i = 1; i <= n3; i++) {
    fact = fact * i;
}
console.log(fact);

// 5.Largest number in array:
let arr4 = [33, 2, 21, 32, 44, 54, 21, 20];
let largest = arr4[0];
for (let i = 0; i < arr4.length; i++) {
    if (largest < arr4[i]) {
        largest = arr4[i];
    }
}
console.log(`largest element from entire array is: ${largest}`);