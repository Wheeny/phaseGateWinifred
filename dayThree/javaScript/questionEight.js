let number = 20;
let divisor = 0;


for(let count = 1; count <= 20; count++){
    if(number % count === 0){
        divisor = count;
    }
}

console.log(divisor);
