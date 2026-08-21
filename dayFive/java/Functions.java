public class Functions{   
   

    public static int sumTwoNumbers(int firstNumber, int secondNumber){
       return firstNumber + secondNumber;
    }
  
  
  
    public static boolean evenNumberCheck(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
    }
    }
    
    
    public static int square(int number){
        int square = 0;
        square = number * number;
            return square;
    }
        
        
     
    public static double temperatureConverter(double temperature){    
        double tempFarenheit = 0;
        tempFarenheit = (temperature * (9/5)) + 32;
            return tempFarenheit;
    }
    

    
    
    public static int largestNumber(int firstNumber, int secondNumber, int thirdNumber){
        int largestNumber = 0;
            if(firstNumber > secondNumber && firstNumber > thirdNumber){
                largestNumber = firstNumber;}
                
            else if(secondNumber > firstNumber && secondNumber > thirdNumber){
                largestNumber = secondNumber; }
                
            else{
                largestNumber = thirdNumber;}
                
           return largestNumber;     
                
      }    
                     

    
    
    
    public static int simpleInterestCalculator(int principal, int rate, int time){
        int simpleInterest = 0;
        simpleInterest = (principal * rate * time)/100;
            return simpleInterest;
     }
     
     
     
     
     public static int rectangleArea(int length, int breadth){
        int area = 0;
        area = length * breadth;
            return area;
     }       
          
          
          
    public static int reverseAnumber(int number){
        int reverse = 0;
        int lastDigit = 0;
      
        while (number != 0){
        lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            }
        return reverse;       

    }      
          
          
       
//    public static int stringFrequency(String word){
//    int counter = 0;
//   
//    for(int count = 0; count < word.length-1; count++){
//        if(word.charAt[count] == word.charAt[count + 1]){
//            counter++;
//                    }
//                }
//        return counter;
//   
//   }
//   
   
   public static void main(String[] args){

//    int firstNumber = 5;
//    int secondNumber = 4;
    System.out.println(sumTwoNumbers(5,4));
    System.out.println(evenNumberCheck(20));
     System.out.println(square(4));
      System.out.println(temperatureConverter(20));
       System.out.println(largestNumber(3,4,5));
        System.out.println(simpleInterestCalculator(20,3,5));
         System.out.println(rectangleArea(5,4));
          System.out.println(reverseAnumber(57));
           System.out.println(evenNumberCheck(20));
//            System.out.println(stringFrequency("Happy"));

    



}
  
    
}
