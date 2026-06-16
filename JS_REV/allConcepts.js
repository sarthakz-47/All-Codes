//JavaScript all concepts:
// 1.What is JS?
// JavaScript is a programming language that makes websites interactive.

// 2.console.log() in JS: print on op window
console.log("Hello JS rev");

// 3.Variables in JS: used to store data
let surname = "Jadhav"; // surname is varibale

// 4.Datatypes in JS: Number,String,Boolean,null,Undefined
let name = "Sarthak"; // majorly used
var name2 = "Vilas"; // old not used 
const pi = 3.14; //used for constant values

// 5. NAN in JS: NOT A NUMBER:
let res = "abc" * 3;
let res2 = 1024 / 0;
console.log(res);

// 6. Null vs Undefined:
// 6.1 Declared but not defined:
let a;
console.log(typeof (a));
// 6.2 decalred as null
let b = null;
console.log(typeof (b));

// 8.Alerts and prompts:
// 8.1 Alerts: shows alert pop-up
alert("Hello");
// 8.2 Prompts: takes user input from pop-up:
// let pr = prompt("enter name");
// alert(`hello ${pr}`);

// 9.How to link JS file:
// before </body> tag -> <script src = "name.js"></script>

// 10.Conditionals:
// 10.1 If else
// 10.2 if else nested
// 10.3 Swtich

// 11.Strings:
// 11.1 How to declare:
let str = "myName Sarthak";

// 11.2 String Literals: used to display multiple var at same time
console.log(`my name is ${name}. Age is ${pi}.`);

// 11.3 String Methods:
console.log(str.length); // return length in number
console.log(str.charAt(2)); // returns char at ith idx
console.log(str.substring(0, 4)); // return substring form starting idx to ending idx eid is excluded
console.log(str.indexOf('N')); // returns idx of char
console.log(str.replace("Name", "Pic")); // replaces set of char or string in og string
console.log(str.split(" ")); // splits the string using delimeter into array
console.log(str.toUpperCase()); // converts string to uppercase/lowercase
console.log(str.slice(0, 3)); // splits the string from sid to eid

// 12.Arrays:
// 12.1 how to declare:
let arr = [1, 2, 3, 5, 4];
let multipleData = [1, "abc", true, 'a'];
console.log(multipleData);

// 12.2 Basic Array Methods: 
console.log(arr.length); // returns length of the array
console.log(arr.reverse()); // reverse the array
console.log(arr.concat(multipleData)); // combine two arrays in single array
console.log(arr.sort()); // sorts the array
console.log(arr.indexOf(2)); // returns idx of given data in array
console.log(arr.includes(0)); // returns bool value

// **push,pop,unshift,shift,slice,splice**
arr.push(4);
console.log(arr); // adds data to end of array

arr.pop();
console.log(arr); // removes data from last of the array

arr.unshift(0);
console.log(arr); // adds data to start of the array

arr.shift();
console.log(arr); // removes data from start of the array

let result = arr.slice(0, 1); // splits the array into halves
// do not modify og array returns new array
console.log(arr); // og array
console.log(result); // spliced array

// used to add,remove,replace elements in og array
// remove:
arr.splice(1, 2); // Start at index 1 (value 2) Remove 2 elements (2 and 3)
console.log(arr);

// add:
arr.splice(1, 0, 100); //Start at index 2,Remove 0 elements,Insert 100
console.log(arr);

// replace:
arr.splice(1, 2, 20, 30); //Start at index 1,Remove 2 and 3,Add 20 and 30
console.log(arr);

// 12.3 const arrays: 
// does not make array immutable
// reassignment/ updating the og array is not possible
const nums = [1, 2, 3];
nums.push(4); //possible
nums[4] = 5; // possible
console.log(nums);
// nums = [9,8,7]; // not possible


// 13.Loops in JS:
// 13.1 For loops:
for (let i = 0; i <= 5; i++) {
      console.log(i);
}
// 13.2 While loops:
let i = 100;
while (i <= 105) {
      console.log(i);
      i++;
}
// 13.2 For each loop: arrays and strings
let fr = ["banana", "apple", "mango"];
for (let x of fr) {
      console.log(x);
}

// 14.Objects in JS:
// 14.1 How to create:
const student = {
      name: "abc",
      age: 20,
      isStudent: true
}
// 14.2 How to accses data from objects:
console.log(student.name);
// 14.3 How to add feild to object:
student.city = "mumbai";
console.log(student);
// 14.4 How to update existing feild:
student.age = 21;
console.log(student);
// 14.4 how to delete a feild:
delete student.isStudent;
console.log(student);
// 14.4 Object inside object:
const car = {
      name: "i20",
      model: 2010,
      engine: {
            version: "iwx20",
            exp: 2050,
      }
}
console.log(car.engine.version);
// 14.5 array object:
const array = [
      { name: "abc", age: 20 },
      { name: "xyz", age: 30 }
]
console.log(array[0].age);
// 14.5 Math Objects:
console.log(Math.max(3, 4));
console.log(Math.min(3, 4));
console.log(Math.round(3.49));
console.log(Math.floor(3.9));
console.log(Math.ceil(3.2));
console.log(Math.abs(-45));
console.log(Math.pow(2, 3));
console.log(Math.sqrt(169));
console.log(Math.PI);
console.log(Math.E);
console.log(Math.random());

// 14.6 generate random numbers from given range:
// 1.Math.random() -> any random no from 0->1(exclusive) for ex: 0.813
// 2.multiply it with 10 -> 8.13
// 3.take floor of that number -> 8
// 4.add 1 to result -> 9 (because 1 is not inclusive)
let randomNum = Math.floor(Math.random() * 11) + 10;
console.log(randomNum);
// Math.floor(Math.random()*(max-min+1))+min;

// 15.Functions in JS:
// 15.1 How to decalre:
function sum(a, b) {
      return a + b;
}
// 15.2 Scopes:
// Block Scope-> {let a = 10}; print(a)-> not valid
// Fnx Scope-> func(){return a+b}; print(a)->not valid
// Global Scope-> availabe anywhere

// 15.3 Try-catch method:
try {
      console.log(a1);
} catch (err) {
      console.log(`Error: ${err.messege}`);
}

// 16. Arrow Functions:
// 16.1 how to create:
const multiply = (a, b) => {
      return a * b;
};
console.log(multiply(2, 4));
const square = x => x * x;
console.log(square(2));

// 16.2 setTimeout(fnx,delay) method:
// prints output once after the dealay in x ms
setTimeout(() => {
      console.log("hi baby!")
}, 5000);

// 16.3 setInterval(fnx,interval) method:
const id = setInterval(() => {
      console.log("shweta <3")
}, 2000);
// 16.4 how to stop setInterval fnx:
setTimeout(() => {
      clearInterval(id);
}, 10000);

// **this keywrod in JS:
/*
Think of it like:
👉 “Who is calling me right now?”

1. In a normal object method
const user = {
  name: "Amit",
  greet() {
    console.log(this.name);
  }
};
user.greet();

Here:
this → refers to user
So output: "Amit"

2. In a regular function (not inside object)
function show() {
  console.log(this);
}
show();

Here:
In strict mode → this is undefined
In non-strict mode → this is window (browser global object)

3. In an arrow function
Arrow functions do not have their own this.
They take this from the surrounding scope.

const obj = {
  name: "Amit",
  greet: () => {
    console.log(this.name);
  }
};
obj.greet();

Here:
this is NOT obj
It comes from outside → usually window or undefined
So this.name is not "Amit"

4. In a constructor / class
class Person {
  constructor(name) {
    this.name = name;
  }
}
const p = new Person("Amit");
console.log(p.name);

Here:
this refers to the new object being created (p)
Simple rule to remember

👉 this depends on how the function is called, not where it is written.
*/