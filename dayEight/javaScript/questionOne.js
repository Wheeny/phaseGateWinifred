function quantitativeAptitude(numbers){
    let[] rearranged =  new [numbers.length];
    let result = 0;
    let counter = 0;
    
    for(let count = 0; count < numbers.length; count++){
        if(numbers[count] % 2 == 0){
           result =  numbers[count] * 2; 
           rearranged[counter] = result;
           counter++;
        }
        
        else{
            result = numbers[count] + 1;
            rearranged[counter] = result;
            counter++;
             }
 
        
        }
    
   return rearranged;
    }
    

let numbers = [2,8,14,5,1];
quantitativeAptitude(numbers);
