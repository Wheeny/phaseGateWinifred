public class QuestionOne {
    public static void main(String[] args) {
        
        String word = "Happy"; 
        
        String reverse = "";
        
        for (int count = word.length() - 1; count >= 0; count--) {
        
            reverse = reverse + word.charAt(count);
        }
        
        System.out.println(reverse);
    }
}
