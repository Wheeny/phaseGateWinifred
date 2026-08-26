import java.util.Scanner;
import java.util.Arrays;

public class ParkingSystem{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
            
        boolean isActive = true;
        
        while (isActive){
        
            System.out.print("""
                --------------------------
                ||WHAT DO YOU WANT TO DO||
                --------------------------
                
                1. PARK
                2. REMOVE
                3. CHECK
                4. STATUS
                5. EXIT
                      
            """);
            
            int option = input.nextInt();
            
            if (option == 1){
                
                System.out.print("Pick a slot to park your car: ");
                int park = input.nextInt();
                
                System.out.println(addCar(park));
                System.out.print(slot());
                System.out.println();
            } 
            
            else if (option == 2){
                
                System.out.print("What slot do you want to remove your car from: ");
                int move = input.nextInt();
                
                System.out.println(removeCar(move));
                System.out.print(slot());
                System.out.println();
            } 
            
            
            else if (option == 3){    
                System.out.println(slot());
                System.out.println();
            } 
            
            else if (option == 4){
                System.out.print(status());
                System.out.println();    
            }
            
            
            else if (option == 5){
                
                System.out.println("******GOODBYE******");
                isActive = false;
            } 
                        
            
        }
        
        
        
    }
   


    public static int[] park = new int[20];
    

    public static String addCar(int slot){
        if(slot < 1 || slot > 20){
            return "Invalid Input! Enter a valid slot between 1-20";
        }
        
        
        if(park[slot-1] == 0){
            park[slot-1] = 1;
            return "Car Added Sucessfully";
        }
          
        else{  
            return "Slot Already Taken";
            }
    
    }
    
    
    
   public static String removeCar(int slot){
        if(slot < 1 || slot > 20){
            return "Invalid Input! Enter a valid slot between 1-20";
        }


        if(park[slot-1] == 1){
            park[slot-1] = 0;
            return "Car Removed Sucessfully";
        }
             
        else{
            return "Slot Is Empty";
            }
    
    }
    
    
    
    
    public static String status(){
        int emptyCount = 0;
        int occupiedCount = 0;
       
        
        for(int index = 0; index < park.length; index++){
            if(park[index] == 0){
                emptyCount++;
            }
            else{
              occupiedCount++;  
            }
        }   
        return "There are " + emptyCount + " Empty Slots Left!";
    }
    
    
     public static String slot(){
        return Arrays.toString(park);
    }
    
 }   
    
    
    
