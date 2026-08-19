public class QuestionTwo{
    public static void main(String[] args){
   
    int number = 234;
    System.out.println(reversInteger(number)); 
   
    }


    public static int reversInteger(int number){
    int reverse = 0;
    
    while (number != 0){
    int lastDigit = number % 10;
    
    reverse = (reverse * 10) + lastDigit;
    
    number = number/10;
   
    
         }
     return reverse;
         
    }

}


