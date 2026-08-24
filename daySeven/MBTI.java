import java.util.Scanner;
import java.util.Arrays;

public class MBTI{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);    
    
    
        System.out.println("What is your name: ");
        String name =  input.nextLine();   
    
    
            String[][] questions = {
                {"expend energy, enjoy groups", "conserve energy, enjoy one-on-one"},
                {"Interpret literally", "look for meaning and possibilities"},
                {"logical, thinking, questioning", "empathetic, feeling, accommodating"},
                {"organized, orderly", "flexible, adaptable"},
                {"more outgoing, think out loud", "more reserved, think to yourself"},
                {"practical, realistic, experiential", "imaginative, innovative, theoretical"},
                {"candid, straight forward, frank", "tactful, kind, encouraging"},
                {"plan, schedule", "unplanned, spontaneous"},
                {"seek many tasks, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate"},
                {"standard, usual, conventional", "different, novel, unique"},
                {"firm, tend to criticize, hold the line", "gentle, tend to appreciate, conciliate"},
                {"regulated, structured", "easy-going, live and let live"},
                {"external, communicative, express yourself", "internal, reticent, keep to yourself"},
                {"focus on here-and-now", "look to the future, global perspective, big picture"},
                {"tough-minded, just", "tender-hearted, merciful"},
                {"preparation, plan ahead", "go with the flow, adapt as you go"},
                {"active, initiate", "reflective, deliberate"},
                {"facts, things, what is", "ideas, dreams, what could be, philosophical"},
                {"matter of fact, issue-oriented", "sensitive, people-oriented, compassionate"},
                {"control, govern", "latitude, freedom"}
            };
                    
                
                
               
                String[] responses = new String[questions.length];
                for (int count = 0; count < questions.length; count++) {
                    System.out.print("A. " + questions[count][0] + "         ");
                    System.out.println("B. " + questions[count][1]);
                    
                     String options =  input.nextLine(); 
                     responses[count] = options;
                      
                    if(!options.equalsIgnoreCase("A") && !options.equalsIgnoreCase("B")){
                       System.out.println("Expected A or B as Response"); 
                       System.out.println("I know this is an error, Please try again\n"); 
                       count--;
                       
                       
                }
          
    
          }
        
        System.out.println(Arrays.toString(responses));
          
    }
 
 }   
