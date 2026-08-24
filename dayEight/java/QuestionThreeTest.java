import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuestionThreeTest{

    @Test
    public void testForTheSumOfTheArraysInTheArray(){
        int[][] numbers = {{3,5,7},{2,2,2},{4,1,9}};
        int[] expected = {15,6,14};
        int[] actual = QuestionThree.sumTheArrays(numbers);
        
        assertArrayEquals(expected, actual);
        }
        
        
    @Test
    public void testForTheSumOfTheArraysInTheArrayAgain(){
        int[][] numbers = {{3,9},{2,8},{0,6}};
        int[] expected = {12,10,6};
        int[] actual = QuestionThree.sumTheArrays(numbers);
        
        assertArrayEquals(expected, actual);
        }      
        
      
        
    }   


