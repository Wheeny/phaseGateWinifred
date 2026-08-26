import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class QuestionOneTest{
    
    @Test
    public void testForTheSumOfTheLastNumberInTheArrayAndOne(){
       
        int[] numbers = {1,2,3};
        int[] expected = {1,2,4};
        
        int[] actual = QuestionOne.addArray(numbers);
        
        assertArrayEquals(expected, actual);
    }
    
    
    
    @Test
    public void testForTheSumOfTheLastNumberInTheArrayAndOneAgain(){
       
        int[] numbers = {4,3,2,1};
        int[] expected = {4,3,2,2};
        
        int[] actual = QuestionOne.addArray(numbers);
        
       assertArrayEquals(expected, actual);
    }
    
    
    @Test
    public void retestForTheSumOfTheLastNumberInTheArrayAndOne(){
       
        int[] numbers = {1,2,3,9};
        int[] expected = {1,2,3,1,0};
        
        int[] actual = QuestionOne.extendArray(numbers);
        
       assertArrayEquals(expected, actual);
    }
    


    @Test
    public void testForReoccurringNumbersInTheArray(){
       
        int[] numbers = {1,2,3,1};
        boolean expected = true;
        boolean actual = QuestionOne.reoccuringNumbers(numbers);
        
        assertTrue(expected == actual);
    }
    
    
    
    @Test
    public void testToReturnTheIntersectionOfTwoArrays(){
       
        int[] numbersOne = {1,2,2,1};
        int[] numbersTwo = {2,2};
        int[] expected = {2};
        int[] actual = QuestionOne.intersection(numbersOne, numbersTwo);
        
        assertArrayEquals(expected, actual);
    }
      
  
    
    
  }
