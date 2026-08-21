import java.util.Scanner;
public class QuestionOne{

    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        
        
    int balance = 0;
    String transactions = """

        """;
        
    
    String menu = """
    
    
    --------------------
    TRANSACTIONS LOG APP
    --------------------
    
    
    Select Options
    
    1. Deposit money
    2. Withdraw money
    3. Show transaction history
    4. Exit the program
    
    """;
        

    while(true){
    
    System.out.print(menu);
    int menuList = input.nextInt();
    switch(menuList){
        case 1: 
             System.out.print("Deposit Amount: ");
            int deposit = input.nextInt();
            if (deposit >= 0){
                balance += deposit;
                System.out.println("Deposited: ₦" + deposit + " | New balance is: ₦" + balance );
                }
            else{
                System.out.print("Invalid Deposit");
                }
                break;
                
        case 2: 
        
            System.out.print("Withdrawal Amount: ");
            int withdrawal = input.nextInt();
            if (withdrawal < balance){
                balance += withdrawal;
                System.out.println("Withdrew: ₦" + withdrawal + " | New balance is: ₦" + balance );
                }
            else{
                System.out.println("Withdrawal failed. Insufficient Funds");
                }
                break;
                 
        case 3: 
            System.out.println("Transaction History: " + transactions);
            break;
            
        case 4: 
            System.out.println("Thank you for using Transaction Log App!");
            System.out.println("Your final balance is: ₦" + balance);
            System.out.println("Transaction history: " + transactions);  
            break;
            
        default: 
            System.out.println("Invalid Input");
    
                }
                
             }
             
         }       
    

    
        public static int checkBalance(int balance){
        return balance;
        }



//        public static int deposit(int depositedAmount, int balance){
//        if (depositedAmount > 0){
//            balance += depositedAmount; }
//       
//        return balance;
//    
//        }
       
       
//
//        public static int withdrawal(int withdrawnAmount, int balance){
//        if (withdrawnAmount <= balance){
//        balance -= withdrawnAmount; }
//       
//        return withdrawalTransactions(withdrawnAmount, balance);
//    
//       }
        
        
        
      
        
   }     



