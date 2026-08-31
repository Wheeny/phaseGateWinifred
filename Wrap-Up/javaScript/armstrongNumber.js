let number = 153;
let originalNumber = number;
let sumOfCubes = 0;


    while (number > 0) {
        let digit = number % 10;                     
        sumOfCubes = sumOfCubes + (digit * digit * digit); 
        number = number / 10;                        
        }

       
        if (sumOfCubes == originalNumber) {
            console.log(originalNumber + " is an Armstrong number.");
        } else {
            console.log(originalNumber + " is not an Armstrong number.");
        }
    
