public class PerfectNumber {

    public static void main(String[] args) {
        int number = 28;
        int sumOfDivisors = 0;

       
        for (int count = 1; count < number; count++) {
            if (number % count == 0) {
                sumOfDivisors = sumOfDivisors + count;
            }
        }


        if (sumOfDivisors == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
