//public class QuestionTwo{
//    public static void main(String[] args){
//    
//    double firstNumber = 3;
//    double secondNumber = 4;
//    double thirdNumber = 5;
//    
//    double countOfNumbers = 3;
//    double sumOfNumbers = (firstNumber + secondNumber + thirdNumber);
//    double mean = sumOfNumbers/countOfNumbers;
//    System.out.println("Mean : " + mean);
//    
//    double median = 0;
//    double medianPosition = 0;
//      if(countOfNumbers % 2 != 0){
//        medianPosition = countOfNumbers/2;
//    }
//
//        if(firstNumber < secondNumber && secondNumber < thirdNumber){
//            median = secondNumber;
//        }
//        
//    
//    median = secondNumber;
//    
// 
//    System.out.println("Median: secondNumber which is: " + median);
//    
//    }
//}
//



public class QuestionTwo{
    public static void main(String[] args){
    
    int firstNumber = 3;
    int secondNumber = 4;
    int thirdNumber = 5;
    int[] arrayOfNumbers = {3,4,5};
    int median = 0;
    int mean = 0;
    int sumOfNumbers = 0;
   
    

    for(int number : arrayOfNumbers) {
			sumOfNumbers += number;
		}
    mean = sumOfNumbers/arrayOfNumbers.length;
    
     System.out.println("Mean : " + mean);
     
     
    
    
    if (arrayOfNumbers.length % 2 != 0){
        median = arrayOfNumbers[arrayOfNumbers.length/2]; 
    } 
    else{
        median = arrayOfNumbers[arrayOfNumbers.length/2 - 1];
    }
    
    System.out.println("Median: " + median + " which is the secondNumber");
    
        }
    }
    

