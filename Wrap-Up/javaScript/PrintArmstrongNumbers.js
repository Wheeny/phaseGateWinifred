for (let count = 1; count <= 1000; count++) {
            
    let tempNumber = count;
    let digits = 0;
            
   
    while (tempNumber > 0) {
        digits++;   
        tempNumber = Math.floor(tempNumber / 10);
    }

    tempNumber = count;
    let sum = 0;
            

    while (tempNumber > 0) {
        let digit = tempNumber % 10;
                
        let product = 1;
        for (let counter = 0; counter < digits; counter++) {
            product = product * digit;
        }
                
        sum = sum + product;
        tempNumber = Math.floor(tempNumber / 10); 
    }

    if (sum === count) {
        console.log(count + " is an Armstrong number.");
    }
}
