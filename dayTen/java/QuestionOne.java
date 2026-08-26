
public class QuestionOne{

    
    public static int[] addArray(int[] numbers){
       numbers[numbers.length-1] = numbers[numbers.length-1] + 1;
            
    return numbers;
            }

    
    
    
    
     public static int[] extendArray(int[] numbers){
     
        int[] arraySum = new int[numbers.length+1];
        
        
        if(numbers[numbers.length-1] == 9){
       
            arraySum[numbers.length-1] = 1;
            arraySum[numbers.length] = 0;
            
            
        for(int count = 0; count < numbers.length-1; count++){
            arraySum[count] = numbers[count];

        }
       
        }
     return arraySum;
     
        }
   
        
        
        
        
        
 
     public static boolean reoccuringNumbers(int[] numbers){
        
        int counter = 0;
        for (int count = 0; count < numbers.length - 1; count++) {
            for (int index = 0; index < numbers.length - 1 - count; index++) {
                
                if (numbers[count] == numbers[index + 1]) {
                    counter++;

                }
            }
        }
        if(counter > 1) return true ;
        return false;
    }
    
   
 
 
 
 
  
     public static int[] intersection(int[] numbersOne, int[] numbersTwo){
     
     int counter = 0;
     
     for(int count = 0; count < numbersOne.length; count++){
        for(int index = 0; index < numbersTwo.length; index++){
            if(numbersOne[count] == numbersTwo[index]){
                counter++;
                
            }
        }
     }
     
     int[] result = new int[counter/2];
     int counters = 0;
     
     for(int count = 0; count < result.length; count++){
        for(int index = 0; index < result.length; index++){
            if(numbersOne[count] == numbersTwo[index]){
                result[counters] = numbersOne[count];
                counters++;
                
            }
        }
     }
     
     int[] finalResult = new int[counters/2];
     int counterss = 0;
     
     for(int count = 0; count < result.length; count++){
        for(int index = 0; index < result.length; index++){
            if(result[count] == result[index]){
                finalResult[counterss] = result[index];
                }
                
              }
              
            }    
                
     return  finalResult; 
   }
  
}

   
    
    
    
    
  
   
   
    
