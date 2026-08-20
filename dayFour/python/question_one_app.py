balance = 0
transactions = """

"""

while True:
    menu = """
    
    --------------------
    TRANSACTIONS LOG APP
    --------------------
    
    
    Select Options
    
    1. Deposit money
    2. Withdraw money
    3. Show transaction history
    4. Exit the program
    
    """
    
    print(menu)
    user_input = int(input("Select an option to proceed: "))
    match user_input:
        case 1: 
            deposit = float(input("Deposit Amount: "))
            if deposit >= 0:
                balance += deposit
                print(f"Deposited: ₦{deposit} | New balance is: ₦{balance}")
            else:
                print("Invalid Deposit")
        case 2: 
            withdrawal = float(input("Withdrawal Amount: "))
            if withdrawal < balance:
                balance -= withdrawal
                print(f"Withdrew: ₦{withdrawal} |New balance is: ₦{balance}")
            else:
                print("Withdrawal failed. Insufficient Funds")     
        case 3: 
            print(f"Transaction History: {transactions}")
        case 4: 
            print("Thank you for using Transaction Log App!")
            print(f"Your final balance is: ₦{balance}")
            print(f"Transaction history: {transactions}")    
            break
        case _: 
            print("Invalid Input")
    
    
    
    
    
