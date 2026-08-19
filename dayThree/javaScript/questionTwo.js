const scanner = require("prompt-sync")();
let number = Number(scanner ("Enter a number: "));

let numberCopy = number;

let reverse = 0;

while (number != 0){
    let lastDigit = number % 10;
    
    reverse = (reverse * 10) + lastDigit
    
    number = Math.floor(number/10);
   
    
}

console.log(reverse);



