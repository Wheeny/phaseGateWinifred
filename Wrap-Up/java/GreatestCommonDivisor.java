public class GreatestCommonDivisor{

    public static void main(String[] args){

        int firstNumber = 10;
        int secondNumber = 20;
        
        System.out.println(greatestCommonDivisorCalc(firstNumber, secondNumber));
}

    public static int greatestCommonDivisorCalc(int  firstNumber, int secondNumber){        
        int divisor = 0;
        
        for(int count = 1; count <= 20; count++){
        if(firstNumber % count == 0 && secondNumber % count == 0){
        divisor = count;
        }
    
    }
    return divisor;
}

}
