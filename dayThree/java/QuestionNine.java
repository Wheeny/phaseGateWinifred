public class QuestionNine{
    public static void main(String[] args){
    
    
    int number = 20;
    int divisor = 0;
    int divisorCounter = 0;
    

    for(int count = 1; count <= 20; count++){
        if(number % count == 0){
            divisor = count;
            divisorCounter++;
    }
}

System.out.println(divisorCounter);
    
    }

}

