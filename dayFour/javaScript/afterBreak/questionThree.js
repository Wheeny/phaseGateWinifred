let sum = 0;
let average = 0;
for(let count = 0; count < 10; count++){
    const scanner = require("prompt-sync")();
    let score = Number(scanner ("Enter score: "));
        
    sum += score;
    average = sum/10;
       
        }
        
   console.log(sum);
   console.log(average);
    





