public class LowestCommonMultiple {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        System.out.println(lowestCommonMultipleCalc(firstNumber, secondNumber));
    }

    public static int lowestCommonMultipleCalc(int firstNumber, int secondNumber) {
        int start = firstNumber;
        if (secondNumber > firstNumber) {
            start = secondNumber;
        }

        for (int count = start; count <= firstNumber * secondNumber; count++) {
            if (count % firstNumber == 0 && count % secondNumber == 0) {
                return count; 
            }
        }

        return firstNumber * secondNumber;
    }
}
