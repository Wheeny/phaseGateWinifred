import java.util.Scanner;
public class QuestionOne{
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
     int sum = 0;
     int average = 0;
     
    for(int count = 1; count <= 10; count++){
        System.out.print("Enter score: ");
        int score = input.nextInt();
        if(score % 2 == 0){
             sum += score;
             average = sum/10;
        }
 
        }
        
    System.out.println("Sum: "+ sum);
    System.out.println("Average: "+ average);
    
    }
}
