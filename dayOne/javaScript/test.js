const scanner = require("prompt-sync")();
let number = Number(scanner ("Enter a number: "));

let numberCopy = number;

let reverse = 0;
//let count = 0;

while (number != 0){
    let lastDigit = number % 10;
    
    reverse = (reverse * 10) + lastDigit
    
    number = Math.floor(number/10);
    //count++
    
}

console.log(reverse);
//console.log(number);
//console.log(numberCopy);


if (numberCopy === reverse){
    console.log("Palindrome")
}
else 
    console.log("Not Palindrome")
    
//console.log(count)
    



/*
javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out PositiveIntegersRange.java PositiveIntegersRangeTest.java

java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

*/
