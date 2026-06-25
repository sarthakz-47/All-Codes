// 18.DOM
// 18.1: document object:
console.log(document);
// 18.2: how to change html code with DOM?
document.all[8].innerText = "hello";
// 18.3 : Select element by id:
let header = document.getElementById("heading");
console.log(header);
header.innerText = "Sarthak";
// 18.4. select element by className:
let para = document.getElementsByClassName("msg");
console.log(para);
para[0].innerText = "Hello john";
// 18.5 select elemnent by tag name:
let ele = document.getElementsByTagName("p");
console.log(ele);
ele[3].innerHTML = "Jadhav";

// 18.6 Query Selectors:
// 18.6.1 : select element by id -> return only first match
let x1 = document.querySelector("#heading");
console.log(x1);
// 18.6.2 : select element by class -> return only first match
let x2 = document.querySelector(".msg");
console.log(x2);
// 18.6.3 : select element by tagName -> return only first match
let x3 = document.querySelector("button");
console.log(x3);
// 18.6.4 : select all elements matching
console.log(document.querySelectorAll("#heading"));
console.log(document.querySelectorAll(".msg"));

// 18.7 Manipulating content in java using dom:
// 18.7.1 InnerText: what you see on html page
let h4 = document.querySelector("#manipulation");
console.log(h4.innerText); // og innertext
h4.innerText = "My Name is Yogesh. Im 25 years old."; // updated innertext
// 18.7.2 InnerHtml: what you see in actual html code:
h4.innerHTML = "Hello My name is Sarthak. <i>this is italic text</i>";
// 18.7.3 textContent: returns all text including hidden text
console.log(h4.textContent);

// 18.8 Manipulating using attributes:
// 18.8.1 getAttribute method:
let img = document.querySelector("img");
console.log(img.getAttribute("src"));
// 18.8.2 setAttribute method:
img.setAttribute("src", "assets/creation_2.jpeg");

// 18.9 Manipulating styels using styles attribute:
let box = document.querySelector(".box");
console.dir(box.style);
box.style.backgroundColor = "blue";
box.style.color = "white";
box.style.fontSize = "50px";
box.style.width = "400px";

// 18.10: ClassList Proeprty:
// 18.10.1 returns collection of classes defined for object
let myImg = document.querySelector("#myImage");
console.dir(myImg.classList);
// 18.10.2 used to add classes to the object:
myImg.classList.add("myImg1");
myImg.classList.add("myImg2");
// 18.10.3 used to remove classes from the object:
myImg.classList.remove("myImg2");
// 18.10.4 returns true or false:
console.log(myImg.classList.contains("myImg2"));
console.log(myImg.classList.contains("myImg1"));
// 18.10.5 if a1 class presenet and toggles(a1) then it will be removed
// if a2 class absent and toggles(a2) then it will be added
// if a2 class present and toggles(a2) then it will be removed
myImg.classList.toggle("myImg1");
myImg.classList.toggle("myImg2");
myImg.classList.toggle("myImg1");

// 18.11 Navigation on page
// DOM allows moving between related elements
// 18.11.1 parent element:
let pt = document.querySelector("#pt");
console.dir(pt.parentElement);
// 18.11.2 get all childrens:
console.log(pt.children);
// 18.11.3 get first children:
console.dir(pt.firstElementChild);
// 18.11.4 get last children:
console.dir(pt.lastElementChild);
// 18.11.5 get next sibbling:
console.dir(pt.nextElementSibling);
// 18.11.6 get prev sibbling:
console.dir(pt.previousElementSibling);


// 18.12 Adding elements on the page:
// 18.12.1 create element:
let newPara = document.createElement("p");
// 18.2.2 add content:
newPara.innerText = "Hello im new para";
//18.2.3 append element to the end of page
document.body.append(newPara);
//18.2.4 append element to the start of the page
document.body.prepend(newPara);

// 18.13 Removing elements from the page:
newPara.remove();


// 19. DOM events:
// DOM Events are actions that happen in a webpage ex. user clicks a btn
let newBtnn = document.createElement("button");
newBtnn.innerText = "mello";
document.body.append(newBtnn);

// 19.1 Mouse events:
// 19.1.1 click 
// newBtnn.onclick = function () {
//       console.log("btn was clicked now");
// }
// 19.1.2 dblclick
// newBtnn.ondblclick = function () {
//       console.log("btn was dbl clicked now");
// };
// 19.1.3 mouseDown
// newBtnn.onmouseenter = function () {
//       console.log("hi");
// }

// 19.2 Event Listners:
// An Event Listener waits for an event and runs code when that event happens.
newBtnn.addEventListener("dblclick", () => {
      console.log("Clicked");
});

newBtnn.addEventListener("click", (event) => {
      console.log(event);
});

// 19.2.1 Event listners for diffrent elements:
let myDiv = document.querySelector("#myDiv");
myDiv.addEventListener("mouseenter", () => {
      console.log("You entered the box.");
});
let myPara = document.querySelector("#myPara");
myPara.addEventListener("click", () => {
      myPara.style.color = "blue";
});

// 19.3 "this" in event listners:
// normal function:
myDiv.addEventListener("mouseenter", function () {
      console.log(this);
});
// arrow function:
myDiv.addEventListener("mouseenter", (e) => {
      console.log(this);
});

// 19.4 Keyboard Events:
// 19.4.1 Key press
let inp = document.querySelector("#inp");
inp.addEventListener("keydown", (event) => {
      console.log(event.key);
      console.log("key was pressed");
});
// 19.4.2 Key realeased
inp.addEventListener("keyup", (event) => {
      console.log("key was realeased");
});


// 19.5 Form Events:
const form = document.getElementById("login");
// 19.5.1 Submit event:
form.addEventListener("submit", (e) => {
      e.preventDefault(); //prevents submission window
      console.log("Submitted");
});
// 19.5.2 input event:
document.querySelector("#inpt").addEventListener("input", (e) => {
      console.log(e.target.value);
});
// 19.5.3 change event:
document.querySelector("#inpt").addEventListener("change", (e) => {
      console.log("chanegd");
});

// 19.5.4 Extracting data from form:
document.querySelector("#signup").addEventListener("submit", (e) => {
      e.preventDefault();

      const username = form.elements.username.value;
      const email = form.elements.email.value;

      console.log(username);
      console.log(email);
});

// More Events:
// Scroll Event:
window.addEventListener("scroll", () => {
      console.log("Scrolling");
});
// Resize Event:
window.addEventListener("resize", () => {
      console.log(window.innerWidth);
});
// Copy Event:
document.addEventListener("copy", () => {
      console.log("Copied");
});
// Page Reload:
window.addEventListener("load", () => {
      console.log("Page Loaded");
});

