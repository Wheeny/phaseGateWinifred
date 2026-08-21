import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsTwoTest{

   
    @Test
    public void testForTheNonReoccurringNumber(){
       
        int[] array = {2,2,1};
        int expected = 1;
        int actual = FunctionsTwo.singleNumber(array);
        
        assertEquals(expected, actual);
    }
    
    
    
    
    }
