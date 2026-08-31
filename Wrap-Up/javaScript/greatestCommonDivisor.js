let firstNumber = 10;
let secondNumber = 20;
let divisor = 0;


for(let count = 1; count <= 20; count++){
    if(firstNumber % count === 0 && secondNumber % count === 0){
        divisor = count;
    }
}

console.log(divisor);
