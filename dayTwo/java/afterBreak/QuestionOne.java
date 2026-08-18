

public class QuestionOne{
    public static void main (String[] args){
    
    int fathersAge = 38;
    int sonsAge = 18;
    ageCalc(fathersAge, sonsAge);
    
    }
    
    
    public static void ageCalc(int currentFathersAge, int currentSonsAge){
        int numberOfYears = 0;
        if(currentFathersAge/2 > currentSonsAge ) {
            numberOfYears = currentFathersAge - (currentSonsAge*  2);
            
            System.out.print("The father was twice his son's age " + numberOfYears + "years ago");
            }
            
        else{
          numberOfYears =   (currentSonsAge*2) - currentFathersAge;
          System.out.print("The father will be  twice his son's age in " + numberOfYears + " years time");
        }     
    }

}
