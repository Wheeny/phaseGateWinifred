function main() {
    let array = [5, 9, 3, 6, 2];
    console.log(primeNumbers(array));

    let secondArray = [5, -9, 3, -6, 2, -11];
    console.log(replaceNegatives(secondArray));

    let thirdArray = [5, 0, 3, 0, 2, 0];
    console.log(moveZeros(thirdArray));
}

function primeNumbers(numbers) {
let primeCount = 0;

    for (let count = 0; count < numbers.length; count++) {
        let currentNum = numbers[count];
        let factorCounter = 0;

        for (let check = 1; check <= currentNum; check++) {
            if (currentNum % check === 0) {
                factorCounter++;
            }
        }

        if (factorCounter === 2) {
            primeCount++;
        }
    }

    let arrayOfPrimeNumbers = new Array(primeCount);
    let index = 0;

    for (let count = 0; count < numbers.length; count++) {
        let currentNum = numbers[count];
        let factorCounter = 0;

        for (let check = 1; check <= currentNum; check++) {
            if (currentNum % check === 0) {
                factorCounter++;
            }
        }

        if (factorCounter === 2) {
            arrayOfPrimeNumbers[index] = currentNum;
            index++;
        }
    }

 
    let placeholder = 0;
    for (let checker = 0; checker < arrayOfPrimeNumbers.length - 1; checker++) {
        for (let counter = 0; counter < arrayOfPrimeNumbers.length - 1 - checker; counter++) {
            if (arrayOfPrimeNumbers[counter] < arrayOfPrimeNumbers[counter + 1]) {
                placeholder = arrayOfPrimeNumbers[counter];
                arrayOfPrimeNumbers[counter] = arrayOfPrimeNumbers[counter + 1];
                arrayOfPrimeNumbers[counter + 1] = placeholder;
            }
        }
    }

    return arrayOfPrimeNumbers;
}



function replaceNegatives(array) {
    let counter = 0;
    let rearranged = new Array(array.length);

    for (let count = 0; count < array.length; count++) {
        if (array[count] >= 0) {
            rearranged[counter] = array[count];
            counter++;
        } else {
            rearranged[counter] = 0;
            counter++;
        }
    }

    return rearranged;
}



function moveZeros(array) {
    let counter = 0;
    let rearranged = new Array(array.length).fill(0);

    for (let count = 0; count < array.length; count++) {
        if (array[count] !== 0) {
            rearranged[counter] = array[count];
            counter++;
        }
    }

    return rearranged;
}


main();

//let array = [5, 9, 3, 6, 2];
//console.log(primeNumbers(array));
//
//
//let secondArray = [5, -9, 3, -6, 2, -11];
//console.log(replaceNegatives(secondArray));
//
//
//let thirdArray = [5, 0, 3, 0, 2, 0];
//console.log(moveZeros(thirdArray));
