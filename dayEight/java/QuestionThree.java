//import java.util.Arrays;
public class QuestionThree{
//    public static void main(String[] args){
        
//        int[][] numbers = {{3,5,7},{2,2,2},{4,1,9}};

    public static int[] sumTheArrays(int[][] numbers){
        int[] sumArray = new int[numbers.length];
        int sum = 0;
        int firstSum= 0;
        int secondSum = 0;
        int thirdSum = 0;

        for(int count = 0; count < numbers[0].length; count++){
            firstSum += numbers[0][count];
            sumArray[0] = firstSum;
            
        }
        
        for(int count = 0; count < numbers[1].length; count++){
            secondSum += numbers[1][count];
            sumArray[1] = secondSum;
        }
        
        for(int count = 0; count < numbers[2].length; count++){
            thirdSum += numbers[2][count];
            sumArray[2] = thirdSum;
        }

//
//
//        System.out.println(firstSum);
//        System.out.println(secondSum);
//        System.out.println(thirdSum);


   return sumArray;
 
    }
    
   } 


 
//        
//        for(int count = 0; count < numbers.length; count++){
//            for(int counter = 0; counter < numbers[count].length; counter++){
//                sum += numbers[count][counter];
//   
//            }
//        }
//        System.out.println(sum);
//        for(int index = 0; index < numbers.length; index++){
//            sumArray[index] = sum;
//        }
//        
//        System.out.println(Arrays.toString(sumArray));
//        
//        }
//        
//        }
//        
//        }
//
