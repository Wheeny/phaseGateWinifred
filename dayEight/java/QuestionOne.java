public class QuestionOne{


    public static int[] quantitativeAptitude(int[] numbers){
    int[] rearranged =  new int[numbers.length];
    int result = 0;
    int counter = 0;
    
    for(int count = 0; count < numbers.length; count++){
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
    
}
