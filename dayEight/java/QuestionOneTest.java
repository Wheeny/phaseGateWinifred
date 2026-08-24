import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuestionOneTest{

    @Test
    public void testForThePatternInTheArray(){
        int[] numbers = {2,8,14,5,1};
        int[] expected = {4,16,28,6,2};
        int[] actual = QuestionOne.quantitativeAptitude(numbers);
        
        assertArrayEquals(expected, actual);
        }
        
        
    @Test
    public void testForThePatternInTheArrayAagain(){
        int[] numbers = {-1,5,6,7,4};
        int[] expected = {0,6,12,8,8};
        int[] actual = QuestionOne.quantitativeAptitude(numbers);
        
        assertArrayEquals(expected, actual);
        }      



    @Test
    public void retestForThePatternInTheArrayAagain(){
        int[] numbers = {5,4,3,2,1};
        int[] expected = {6,8,4,4,2};
        int[] actual = QuestionOne.quantitativeAptitude(numbers);
        
        assertArrayEquals(expected, actual);
        }  
        
        
        
    @Test
    public void anotherTestForThePatternInTheArrayAagain(){
        int[] numbers = {12,17,39};
        int[] expected = {24,18,40};
        int[] actual = QuestionOne.quantitativeAptitude(numbers);
        
        assertArrayEquals(expected, actual);
        }        
        
    }   


