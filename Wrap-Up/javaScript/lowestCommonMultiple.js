function lowestCommonMultipeCalc(firstNumber, secondNumber){



 
let start = firstNumber;
    if (secondNumber > firstNumber) {
        start = secondNumber;
        }

        for (let count = start; count <= firstNumber * secondNumber; count++) {
            if (count % firstNumber == 0 && count % secondNumber == 0) {
                return count; 
            }
        }

       return firstNumber * secondNumber;


}

firstNumber = 10;
secondNumber = 20;
console.log(lowestCommonMultipeCalc(firstNumber, secondNumber));
