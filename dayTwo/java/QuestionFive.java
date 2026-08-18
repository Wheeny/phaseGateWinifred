//import java.util.Scanner;
//public class QuestionFive{
//    public static void main(String[] args){
//    Scanner input = new Scanner(System.in);
//    
//    System.out.print("Enter a number: ")
//    String number = nextLine();
//  
//    
//    



public class QuestionFive{
   public static void main(String[] arg){
   
   int number = 1233345;
   int[] array = {1,2,3,3,3,4,5};
   int counter = 0;
   
   for(int count = 0; count < array.length-1; count++){
        if(array[count] == array[count + 1]){
            counter++;
            System.out.println(array[count]);
        }
   }
   
   System.out.println("Run length: " + counter);
   }
   
   }
