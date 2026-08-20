let sum = 0;
for(let count = 1; count <= 10; count++){
    const scanner = require("prompt-sync")();
    let score = Number(scanner ("Enter score: "));
    if(count % 2 === 0){      
    sum += score;
           }
        }
        
   console.log(sum);
    





