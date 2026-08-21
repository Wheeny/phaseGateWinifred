public class FunctionsTwo{ 
    
    public static int singleNumber(int[] array){
     int result = 0;
    for(int count = 0; count < array.length; count++){
        for(int counter= 0; counter < array.length;counter++ )
        if(array[count] != array[counter]){
        
        result = (array[count]); 
        
                    }
            
                }
    return result;
            }
   }
