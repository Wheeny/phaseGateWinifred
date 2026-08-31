public class PrintArmstrongNumbers {

    public static void main(String[] args) {

      
        for (int count = 1; count <= 1000; count++) {
            
            
            int tempNumber = count;
            int digits = 0;
            while (tempNumber > 0) {
                digits++;
                tempNumber = tempNumber / 10;
            }

            
            tempNumber = count;
            int sum = 0;
            while (tempNumber > 0) {
                int digit = tempNumber % 10;
                
               
                int product = 1;
                for (int counter = 0; counter < digits; counter++) {
                    product = product * digit;
                }
                
                sum = sum + product;
                tempNumber = tempNumber / 10;
            }


            if (sum == count) {
                System.out.println(count + " is an Armstrong number.");
            }
        }
    }
}
