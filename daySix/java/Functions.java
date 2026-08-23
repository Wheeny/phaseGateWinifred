import java.util.Arrays;
public class Functions{

    public static void main(String[] args){
    
    int[] array = {5,9,3,6,2};
    System.out.println(Arrays.toString(primeNumbers(array)));
    
    int[] secondArray = {5,-9,3,-6,2,-11};
    System.out.println(Arrays.toString(replaceNegatives(secondArray)));
    
    int[] thirdArray = {5,0,3,0,2,0};
    System.out.println(Arrays.toString(moveZeros(thirdArray)));
    
    
//    int[] fourthArray = {45,60,3,0,67,2,45,3,22,0};
//    System.out.println(Arrays.toString(duplicateFinder(fourthArray)));
//    
    
    } 

    
    
    
    
    
    public static int[] primeNumbers(int[] numbers) {
        
        
        int primeCount = 0;

        for (int count = 0; count < numbers.length; count++) {
            int currentNum = numbers[count];
            int factorCounter = 0;

           
            for (int check = 1; check <= currentNum; check++) {
                if (currentNum % check == 0) {
                    factorCounter++;
                }
            }

            
            if (factorCounter == 2) {
                primeCount++;
            }
        }

        int[] arrayOfPrimeNumbers = new int[primeCount];
        int index = 0;

      
        for (int count = 0; count < numbers.length; count++) {
            int currentNum = numbers[count];
            int factorCounter = 0;

            
            for (int check = 1; check <= currentNum; check++) {
                if (currentNum % check == 0) {
                    factorCounter++;
                }
            }

            if (factorCounter == 2) {
                arrayOfPrimeNumbers[index] = currentNum;
                index++;
            }
        }
            
            
//        Arrays.sort(arrayOfPrimeNumbers);
        int placeholder = 0;
        for(int checker = 0; checker < arrayOfPrimeNumbers.length - 1; checker++){
            for(int counter = 0; counter < arrayOfPrimeNumbers.length - 1 - checker; counter++){
                if(arrayOfPrimeNumbers[counter] < arrayOfPrimeNumbers[counter + 1]){
                    placeholder = arrayOfPrimeNumbers[counter];
                    arrayOfPrimeNumbers[counter] = arrayOfPrimeNumbers[counter + 1];
                    arrayOfPrimeNumbers[counter + 1] = placeholder;
                }
            }
        }

        return arrayOfPrimeNumbers;
    }
    
    
    
    
    
    public static int[] replaceNegatives(int[] array){
    
    int counter = 0;
    int[] rearranged = new int[array.length];
    
    for(int count = 0; count < array.length; count++){
        if(array[count] >= 0){
            rearranged[counter] = array[count];
            counter++;
            }
        else{
            rearranged[counter] = 0;
            counter++; 
        }                  

        }
   return rearranged; 
    
    }
    
    
    
    
    
    public static int[] moveZeros(int[] array){
    
    int counter = 0;
    int[] rearranged = new int[array.length];
    
    for(int count = 0; count < array.length; count++){
          if(array[count] != 0){
            rearranged[counter] = array[count];
            counter++;
            }         

        }
   return rearranged; 
    
    }
    
    
    
    
    
//    public static int[] duplicateFinder(int[] array){
//    
//    int[] rearranged = new int[array.length];
//    int dupliateCounter = 0;
//    
//    for(int count = 0; count < array.length; count++){
//        for(int counter = count+1; counter < array.length; counter++){
//            if(array[count] == array[counter]){
//                dupliateCounter++;
//                }
//             }
//          }    
//                
//                
//                
//    
//    
//    for(int count = 0; count < array.length; count++){
//        for(int counter = 0; counter < array.length; counter++){
//            if(array[count] == array[counter]){
//            rearranged[counter]  = array[count];
//
//            } 
//        }     
//
//     }
//     
//   return rearranged; 
    
  } 
    
    
    
}
