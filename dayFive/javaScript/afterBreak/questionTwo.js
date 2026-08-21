let array = [2,2,1,6,7];
let result = 0;
let count = 0
let countRepetition = 0
   
for(; count < array.length; count++){
    for(let counter = 0; counter < array.length; counter++){  
        if(array[count] == array[counter]){ 
            countRepetition+=1       
        }

     }

     if(countRepetition == 1){
        result = array[count];
        console.log(result);  
      } 
       
      countRepetition = 0
     
   }  
   
 
        
