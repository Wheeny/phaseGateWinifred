let sum = 0;
let average = 0;

for(let count = 1; count <= 10; count++){
    const scanner = require("prompt-sync")();
    let score = Number(scanner ("Enter score: "));
    if(score % 2 === 0){      
        sum += score;
        average =sum/10
           }
        }
        
   
   console.log(average);
    





