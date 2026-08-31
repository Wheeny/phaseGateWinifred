let number = 145;
let originalNumber = number;
let sumOfFactorials = 0;

        
while (number > 0) {
    let digit = number % 10; 

           
    let factorial = 1;
    for (let count = 1; count <= digit; count++) {
        factorial = factorial * count;
            }

        
    sumOfFactorials = sumOfFactorials + factorial;

    number = number / 10; 
        }


if (sumOfFactorials == originalNumber) {
    console.log(originalNumber + " is a Strong number.");
        } 
else {
    console.log(originalNumber + " is not a Strong number.");
        }

