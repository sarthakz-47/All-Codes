// *What is node js?
// Node js is a javascript runtime enviroment
// which help js to run the code outside the browser
// used for server side programing
// not a language its a library or framework

// *process object in NodeJS:
// for (let i = 0; i < 5; i++) {
//   console.log("hello");
// }
// console.log(process.argv);

// *reuire in NodeJS:
//  const math = require("./calculator.js");
// console.log(math.add(2, 3));

// *using a library from NodeJS:
// // const cowsay = require("cowsay");
// console.log(
//   cowsay.say({
//     text: "Hello from COW!",
//   }),
// );

// *ExpressJS: NodeJs application framework
// server side programing ke liye use hota hai

// *how to use express:
// import the express from NodeJs
import express from "express";
// use the object:
const app = express();

const PORT = 8080;

// *listens for request from client
app.listen(PORT, () => {
  console.log(`Server Listening on Port: ${PORT}`);
});

// *Sends response for any route after /
// app.use((req, res) => {
//   res.send("My name is Sarthak");
// });

// *Sends response for specified route only
// get method:
app.get("/", (req, res) => {
  res.send("GET request received");
});

// *send response post method:
app.post("/user", (req, res) => {
  res.send("Post request received");
});

// *send response delete method:
app.delete("/home", (req, res) => {
  res.send("delete route");
});

// *path parameters used when to create multiple routes for multiple varibales:
// uses req.params to display
app.get("/:id/student/:name", (req, res) => {
  res.send(req.params);
});

// *query strings , whatever we send after /search?___ gets op
// uses req.query
app.get("/search", (req, res) => {
  res.send(req.query);
});
