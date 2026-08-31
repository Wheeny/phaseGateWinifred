public class StrongNumber {

    public static void main(String[] args) {
        int number = 145;
        int originalNumber = number;
        int sumOfFactorials = 0;

        
        while (number > 0) {
            int digit = number % 10; 

           
            int factorial = 1;
            for (int count = 1; count <= digit; count++) {
                factorial = factorial * count;
            }

        
            sumOfFactorials = sumOfFactorials + factorial;

            number = number / 10; 
        }


        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
    }
}
