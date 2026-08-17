import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PracticeTest{
    
    @Test
    public void testForTheSumOfTwoNumbers(){
        int firstNumber = 2;
        int secondNumber = 2;  
        int expected = 4;
        
        int actual = Practice.sum(firstNumber, secondNumber);
        
        assertEquals(expected, actual);
    }
    
    
    
    /*
javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out PositiveIntegersRange.java PositiveIntegersRangeTest.java

java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

*/





        
