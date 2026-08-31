let number = 28;
let sumOfDivisors = 0;

for (let count = 1; count < number; count++) {
    if (number % count == 0) {
        sumOfDivisors = sumOfDivisors + count;
            }
        }


    if (sumOfDivisors == number) {
            console.log(number + " is a perfect number.");
        } else {
            console.log(number + " is not a perfect number.");
        }

