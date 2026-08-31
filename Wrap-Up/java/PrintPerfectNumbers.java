public class PrintPerfectNumbers {

    public static void main(String[] args) {


        for (int number = 1; number <= 1000; number++) {
            int sumOfDivisors = 0;

            for (int count = 1; count < number; count++) {
                if (number % count == 0) {
                    sumOfDivisors = sumOfDivisors + count;
                }
            }


            if (sumOfDivisors == number) {
                System.out.println(number + " is a perfect number.");
            }
        }
    }
}
