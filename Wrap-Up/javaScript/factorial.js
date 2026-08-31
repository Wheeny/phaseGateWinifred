const scanner = require('prompt-sync')();
let number = scanner("Enter a number: ");
        

let factorial = 1;


    for(let count = number; count > 0; count--){
        factorial *= count;
          
        }
        
console.log(factorial);    

