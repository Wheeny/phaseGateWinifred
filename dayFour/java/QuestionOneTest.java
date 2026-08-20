import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionOneTest{
    
    @Test
    public void testThatAccountBalanceIsZeroDuringCreation(){
       
        
        int expected_balance = 0;
        int actual_balance = QuestionOne.check_balance(balance);
        
        assertEquals(expected_balance, actual_balance);
    }
    
   } 
 
