import java.util.Scanner;
public class QuestionOne{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
     int sum = 0;
     
    for(int count = 0; count < 10; count++){
        System.out.print("Enter score: ");
        int score = input.nextInt();
        
      
        
        sum += score;
       
    
        }
        
    System.out.println("Sum: "+ sum);
    
    }
}
