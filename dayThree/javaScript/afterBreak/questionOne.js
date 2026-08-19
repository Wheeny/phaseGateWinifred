function alphaNumericCount(input){
input = input.toLowerCase();
let moreThanOnce = 0;
        
for(let count = 0; count < input.length; count++){
    let charCounter = 0;
    for(let counter = 0; counter < input.length; counter++){
        if(input.charAt(count) == input.charAt(counter)){
            charCounter++;
            if(charCounter > 1){
                moreThanOnce++;
                        
                    }
                
                }
            
            }

        }
        return moreThanOnce;    
    }
    

  
 
let text = "a11BAcb";
console.log(alphaNumericCount(text));
    
