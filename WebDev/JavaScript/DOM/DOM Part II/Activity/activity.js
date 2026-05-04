let btn = document.querySelector("button");

btn.addEventListener("click", function () {
      let div = document.querySelector("div");
      div.style.backgroundColor = randomColor();
      console.log("color updated!")
});

function randomColor() {
      let red = Math.floor(Math.random() * 256);
      let green = Math.floor(Math.random() * 256);
      let blue = Math.floor(Math.random() * 256);

      let finalColor = `rgb(${red},${green},${blue})`;
      return finalColor;
}