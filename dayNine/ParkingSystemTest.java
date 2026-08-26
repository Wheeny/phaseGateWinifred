import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingSystemTest{
    
    @Test
    public void testTheNumberOfSlotsInTheParkingLot(){

       int slot = 25;
       String expected = "Invalid Input! Enter a valid slot between 1-20";
       String actual = ParkingSystem.addCar(slot);
       
       assertEquals(actual, expected);
 
    
    } 

    @Test
    public void testToAddAcarToTheParkingLot(){
    
       ParkingSystem.park = new int[] {0,0,0,0,0};
       int slot = 5;
       String expected = "Car Added Sucessfully";
       String actual = ParkingSystem.addCar(slot);
       
       assertEquals(actual, expected);
 
    
    } 


    
     @Test
    public void testToAddAcarToTheAlreadyTakenSlots(){
    
       ParkingSystem.park = new int[] {0,0,0,0,1};
       int slot = 5;
       String expected = "Slot Already Taken";
       String actual = ParkingSystem.addCar(slot);
       
       assertEquals(expected, actual);
    
    } 


    @Test
    public void testTheNumberOfSlotsInTheParkingLotAgain(){

       int slot = -4;
       String expected = "Invalid Input! Enter a valid slot between 1-20";
       String actual = ParkingSystem.removeCar(slot);
       
       assertEquals(actual, expected);
 
    
    } 
    
    
    @Test
    public void testToRemoveAcarFromTheParkingLot(){
    
       ParkingSystem.park = new int[] {0,0,0,0,1};
       int slot = 5;
       String expected = "Car Removed Sucessfully";
       String actual = ParkingSystem.removeCar(slot);
       
       assertEquals(expected, actual);
    
    }
 
 
 
    @Test
    public void testToRemoveAcarFromAnEmptySlot(){
    
       ParkingSystem.park = new int[] {0,0,0,0,0};
       int slot = 5;
       String expected = "Slot Is Empty";
       String actual = ParkingSystem.removeCar(slot);
       
       assertEquals(expected, actual);
       
    
    } 
    
    
    
    
    @Test
    public void testToCountTHeNUmberOfEmptySlots(){
    
       ParkingSystem.park = new int[20];
       String expected = "There are 20 Empty Slots Left!";
       String actual = ParkingSystem.status();
       
       assertEquals(expected, actual);
       
    
    } 
    
    
  }

