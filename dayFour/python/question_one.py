
balance = 0
transactions = []
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
                transactions.append(deposit)
                transactions.append(balance)
                
            else:
                print("Invalid Deposit")
        case 2: 
            withdrawal = float(input("Withdrawal Amount: "))
            if withdrawal < balance:
                balance -= withdrawal
                print(f"Withdrew: ₦{withdrawal} |New balance is: ₦{balance}")
                
            else:
                print("Withdrawal failed. 4Insufficient Funds")     
        case 3: 
            print(f"Transaction History: {transactions}")
#            for num in range(len(transactions) - 1):
#                print(f"deposited {transactions[num]} new balance {transactions[num]}]")                
        case 4: 
            print("Thank you for using Transaction Log App!")
            print(f"Your final balance is: ₦{balance}")
            print(f"Transaction history: {transactions}")    
            break
        case _: 
            print("Invalid Input")
    
    
    
def transactions(deposit, balance):
    transactions.append(deposit)
    transactions.append(balance)
    return transaction
    
def check_balance(balance):
    return balance
    
def deposit(deposited_amount, balance):
    if deposited_amount > 0.0:
        balance += deposited_amount
        
    
    return deposit_transactions(deposited_amount, balance)
    
def withdrawal(withdrawn_amount, balance):
    if withdrawn_amount <= balance:
        balance -= withdrawn_amount
    return withdrawal_transactions(withdrawn_amount, balance)
    
def deposit_transactions(deposited_amount, balance):
    transaction_log = f"Deposited: ₦{deposited_amount} | New Balance: ₦{balance}"
    
    return transaction_log
    
    
def withdrawal_transactions(withdrawn_amount, balance):
    transaction_log = f"Withdrew: ₦{withdrawn_amount} | New Balance: ₦{balance}"
    return transaction_log
    
    
 
