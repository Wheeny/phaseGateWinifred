public class PrintLeapYears {

    public static void main(String[] args) {

        for (int year = 1900; year <= 2025; year++) {
            
          
            boolean isLeapYear = false;

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeapYear = true;
            }

            
            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            }
        }
    }
}
