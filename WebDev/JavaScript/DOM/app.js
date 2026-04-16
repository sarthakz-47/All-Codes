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
