// *.Basics of document object:
// document is the most upper part of tree which is object which contains multiple key value pairs:
console.dir(document);
// all containes all the HTML elements we used so far:
console.dir(document.all);
// if we want to change any value in the all:
document.all[8].innerHTML = "Iron man";


// *.Selecting Elements:
// 1.getElementById method: ✔ Returns a single element
let img = document.getElementById("mainImg");
console.log(img);
// here mainImg is object not a variale
console.dir(img);
// 2.getElementByClass method: ✔ Returns HTMLCollection (array-like)
let boxLink = document.getElementsByClassName("boxLink");
console.log(boxLink);
// 3.getElementByTagName method: ✔ Selects all <tag> elements
let images = document.getElementsByTagName("img");
console.log(images);


// *.Selecting Queries:
// tags:
console.log(document.querySelector("p")); // selects & returns first match
// Ids:
console.log(document.querySelector("#description")); //selects tag having id
// class:
console.log(document.querySelector(".oldImg")); // selects first img with this class name
// all:
console.log(document.querySelectorAll(".oldImg")); // gives collection of all tags containg same class name


// *.Setting Content in Objects
// 1. selecting innerText:
let para = document.querySelector("p");
console.log(para.innerText); // what we see on op screen window
// 2. selecting innerHtml:
console.log(para.innerHTML); // what actually HTML written is
// 3. selecting textContent:
console.log(para.textContent); // what we see in HTML code without tags

//*Manipulating properties:
para.innerText = "Hero Xtreme 125r Dual channel ABS!";
para.innerHTML = "<u><b>Hero Xtreme 125r Dual channel ABS!<b><u>";

// *.Attributes Manipulation:
// 1. Get attribute:
let element = document.querySelector("img");
console.log(element.getAttribute("id"));
// 2. Set attribute:
console.log(element.setAttribute("id", "spidyimg"));
console.log(element.id);
// 3. Remove attribute:
console.log(element.removeAttribute("id"));
console.log(element.id);


// *.style manipulation:
let heading = document.querySelector("h1");
console.dir(heading.style);
heading.style.color = "red";
heading.style.backgroundColor = "yellow";
heading.style.fontSize = "20px";
// note: CSS properties use camelCase
// background-color → backgroundColor


// *.classList Property : Used to manage classes easily
let box = document.querySelector(".box");
console.dir(box.classList);
// Add class: add new class to that element
box.classList.add("newClass");
console.dir(box.classList);
// Remove class: remove class from a element
box.classList.remove("box");
console.dir(box.classList);
// Toggle class: to add and remove classes from element, adds if not present, removes if present
console.log(box.classList.toggle("active"));
// Check class: check if there is classList for a specefic element or not
console.log(box.classList.contains("newClass"));
console.log(box.classList.contains("box"));

// Navigation on page: siblings, childrens:
let img2 = document.querySelector(".oldImg");
console.log(img2.parentNode);

console.log(box.children);
console.log(box.firstElementChild);
console.log(box.lastElementChild);
console.log(box.nextElementSibling);
console.log(box.previousElementSibling);

// Adding elements on page:
// 1.Create element to add on the page:
let newPara = document.createElement("p");
let newPara2 = document.createElement("p");
newPara.innerHTML = "im new para.";
newPara2.innerHTML = "im new para2.";
// 2. append the newPara using:
// i) append() method: use whereToAppend.append(whatToAppend);
let body1 = document.querySelector("p");
body1.append(newPara);
// ii) prepend(): add to start
body1.prepend(newPara2);
// iii) insertAdjacent(where,what): adds element at specefic pos:
let btn = document.createElement('button');
btn.innerHTML = "press me!"
body1.insertAdjacentElement('beforebegin', btn);
body1.insertAdjacentElement('afterbegin', btn);
body1.insertAdjacentElement('beforeend', btn);
body1.insertAdjacentElement('afterend', btn);
// comment out and see results

// Removing from page: remove()
btn.remove();
newPara2.remove();


// Practice Questions - Lecture:
// Q.Add the following elements to the container using only JS and the DOM methods:
// i) a <p> with red text that says "Hey I'm red!"
let body = document.querySelector("body");
let para1 = document.createElement('p');
para1.innerText = "Hey im red!";
para1.style.color = "red";
body.append(para1);

//ii) an <h3> with blue text that says "Im blue h3!"
let h3 = document.createElement('h3');
h3.innerText = "Im blue h3";
h3.style.color = "blue";
body.append(h3);

// iii) a < div > with a black border and pink bg color with the following elements inside it:
// 1.another < h1 > that says "im in a div!"
// 2.a < p > that says "Mee to!"
let div = document.createElement("div");
div.style.border = " 2px solid black";
div.style.backgroundColor = "pink";

let h1 = document.createElement('h1');
h1.innerHTML = "im in a div!";
div.append(h1);

let p = document.createElement('p');
p.innerText = "Mee too!";
div.append(p);

body.append(div);
