public class Functions{ 
    

    public static int sumDigits(int number){
        int sum = 0;
        int lastDigit = 0;
      
        while (number != 0){
        lastDigit = number % 10;
            sum += lastDigit;
            number = number/10;
            }
        return sum;       

    }      
   
   

   
   
   
   
   }  
   
    
   
