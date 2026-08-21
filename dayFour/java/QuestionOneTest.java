import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionOneTest{
    
    @Test
    public void testThatAccountBalanceIsZeroDuringCreation(){
       
        
        int expectedBalance = 0;
        int actualBalance = QuestionOne.checkBalance(0);
        
        assertEquals(expectedBalance, actualBalance);
    }
    
    
//    @Test
//    public void testthatDepositedAmountIsnotLessThanZero(){
//       
//        int balance = 0;
//        int depositedAmount = 1000;
//        int expectedBalance = 1000;
//        int actualBalance = deposit(depositedAmount, balance);
//        assertEquals(expectedBalance, actualBalance);
//    }
    
    
    
    
//    @Test
//    public void testThatWithdrawnAmountIsnotMoreThanThebalance(){
//       
//        int balance = 1000;
//        int withdrawnAmount = 500;
//        int expectedBalance = 500
//        int actualBalance = withdrawal(withdrawnAmount, balance);
//        assertEquals(expectedBalance, actualBalance);
//    }
    
    
    } 
 
 
 
 
 
 
 
