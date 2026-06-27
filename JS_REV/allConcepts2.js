// Chapter I - Asynchronous JS  + Promises:
// 1.Call stack:When a function is called, it is pushed onto the stack.
// When it finishes, it is popped off.
// function one() {
//     two();
// }
// function two() {
//     console.log("hello");
// }
// one();

// // 2.Breakpoints in JS
// // 3.JS Single Threaded:
// console.log("1"); // line1 execute, move to line2
// console.log("2"); // line2 executed, move to line3

// setTimeout(() => {  // line executed
//     console.log("buddy");
// }, 1000)
// console.log("hello"); // end of execution

// but hello prints first and buddy print after how?
// this is called asynchronous JS
// setTimeout fnx is executed by browser not JS itself. browser has its own call stack
// it holds the "buddy" for 2 sec and then returns it to JS

// 4.Callback Hell:
// When multiple functions calls a callback functions again and agian

// 4.1 et suppose a function which gets data and defines it is saved or not:
// function saveToDB(data, done, fail) {
//     let internetSpeed = Math.floor(Math.random() * 10) + 1;
//     if (internetSpeed > 4) {
//         done(); // if yes then execute done()
//     }
//     else {
//         fail(); // else execute fail()
//     }
// }

// 4.2 calling the function while defining what to do when >4 and <4:
// saveToDB("hello", () => {
//     console.log("succsess"); //  if true->succses
// }, () => {
//     console.log("fail"); // else -> fail
// })

// 4.3 calling the fucntion when first data saved then save second data only:
// saveToDB("hello", () => {
//     console.log("succsess");
//     saveToDB("mello", () => { // now call for second data also here
//         console.log("succsess 2") // if yes then success 2
//     }, () => {
//         console.log("failure 2"); // else fail2
//     })
// }, () => {
//     console.log("fail");
// })

// this is callBack hell.

// 5.Promises:
// 5.1 same thing with promise object -> promise always return anything -> pass or fail
// function saveToDB(data) {
//     return new Promise((resolve, reject) => { // this will return a promise now
//         let internetSpeed = Math.floor(Math.random() * 10) + 1;
//         if (internetSpeed > 4) {
//             resolve("succsess: data saved."); // if yes then execute done()
//         }
//         else {
//             reject("error: weak connection"); // else execute fail()
//         }
//     })
// }
// let req = saveToDB("hello");
// console.log(req);

// 5.2 use .then() and .catch() methods for success or faiure condtns only on promises:
// saveToDB("sarthak Jadhav")
//     .then(() => {
//         console.log("saved");
//     }).catch(() => {
//         console.log("failed");
//     });
// ;

// 5.3 promise chaining: when we need to call fnx again only if first data saves:
// saveToDB("sarthak")
//     .then((result) => {
//         console.log("data1 saved.");
//         console.log(result);
//         return saveToDB("vilas");
//     })
//     .then((result) => {
//         console.log("data2 saved.");
//         console.log(result);
//         return saveToDB("jadhav");
//     })
//     .then((result) => {
//         console.log("data3 saved.")
//         console.log(result);
//     })
//     .catch((error) => {
//         console.log("failed to save.")
//         console.log(error);
//     });

// Chapter II - Async JS + APIs
// 1.async functions:
// -An async function always returns a Promise.
// -It allows writing asynchronous code that looks like synchronous code.
// -We can use .then .catch methods on functions.
async function greet() {
    return "hello"; // returns promise
}
console.log(greet());

// 2.await keyword:
// -await pauses the execution of an async function until a Promise is resolved.
async function fetchData() {
    let res = 
}
