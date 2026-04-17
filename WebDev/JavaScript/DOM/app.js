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
// 1. selecting innerHtml:
console.log(para.innerHTML); // what actually HTML written is
// 1. selecting textContent:
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

let img2 = document.querySelector(".oldImg");
console.log(img2.parentNode);

console.log(box.children);
console.log(box.firstElementChild);
console.log(box.lastElementChild);
console.log(box.nextElementSibling);
console.log(box.previousElementSibling);