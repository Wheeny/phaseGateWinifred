for (let number = 1; number <= 1000; number++) {
    let sumOfDivisors = 0;

    for (let count = 1; count < number; count++) {
        if (number % count === 0) {
            sumOfDivisors = sumOfDivisors + count;
                }
            }


        if (sumOfDivisors === number) {
            console.log(number + " is a perfect number.");
            }
        }

