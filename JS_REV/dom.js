// 18.DOM
// 18.1: document object:
console.log(document);
// 18.2: how to change html code with DOM?
document.all[6].innerText = "hello";
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

console.log(pt.children);
console.dir(pt.firstElementChild);
console.dir(pt.lastElementChild);
console.dir(pt.nextElementSibling);
console.dir(pt.previousElementSibling);


// 18.12 Adding elements on the page:

// 18.12.1 create element: