public class QuestionTwo{
    public static void main (String[] args){
    int scoreOne = 60;
    int scoreTwo = 70;
    int scoreThree = 50;
    
    scoreGrading(scoreOne, scoreTwo, scoreThree);
    
    }
    
    
    public static void scoreGrading(int scoreOne, int scoreTwo, int scoreThree){
    int average = (scoreOne + scoreTwo + scoreThree)/3;
    
    if(average >= 90 && average <= 100){
        System.out.print("A");
    }
    else if(average >= 80 && average <= 90){
        System.out.print("B");
    }
     else if(average >= 70 && average <= 80){
        System.out.print("C");
    }
     else if(average >= 60 && average <= 70){
        System.out.print("D");
    }
     else {
        System.out.print("F");
     }
     
     
    }
   
   
   
    
}   
 
    
    
    
