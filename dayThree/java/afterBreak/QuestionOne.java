//public class QuestionOne{
//    public static void main(String[] args){
//    
//    String input = "a111BAcb";
//    System.out.println(alphaNumericCount(input));
//    
//    }
//
//
//    public static int alphaNumericCount(String input){
//        input = input.toLowerCase;
//        int charCounter = 0;
//        
//        for(int count = 0; count < input.length() -1 ; count++){
//            if(input.charAt(count) == input.charAt(count + 1)){
//                charCounter++;    
//            
//            } 
//        
//        }
//        
//        return charCounter;
//    
//    }
//
//}





public class QuestionOne{
    public static void main(String[] args){
    
    String text = "a11BAcb";
    System.out.println(alphaNumericCount(text));
    
    }


    public static int alphaNumericCount(String input){
        input = input.toLowerCase();
        int moreThanOnce = 0;
        
        for(int count = 0; count < input.length() ; count++){
             int charCounter = 0;
             for(int counter = 0; counter < input.length(); counter++){
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
    
  }  
  
  
  
  
  
  
 
  
  
  
  
  
  
  
  
  
  
