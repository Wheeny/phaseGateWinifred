public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int sumOfCubes = 0;


        while (number > 0) {
            int digit = number % 10;                     
            sumOfCubes = sumOfCubes + (digit * digit * digit); 
            number = number / 10;                        
        }

       
        if (sumOfCubes == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
