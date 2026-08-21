import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsTest{
    
    @Test
    public void testForTheSumOfDigitsOfAnInteger(){
       
        int number = 42;
        int expected = 6;
        int actual = Functions.sumDigits(number);
        
        assertEquals(expected, actual);
    }
    
    
    
    
    
    }
