#import unittest

    
from unittest import TestCase
from question_one import check_balance, deposit, withdrawal, deposit_transactions, withdrawal_transactions

class TransationsLog(TestCase):

    def test_accountBalance_isZero_duringCreation(self):
        
        expected_balance = 0
        actual_balance = check_balance(0.0)
        self.assertEqual(actual_balance, expected_balance)
        
        
    def test_that_deposited_amount_isnot_lessthanzero(self):
        
        balance = 0
        deposited_amount = 1000
        expected_balance = "Deposited: ₦1000 | New Balance: ₦1000"
        actual_balance = deposit(deposited_amount, balance)
        self.assertEqual(actual_balance, expected_balance)
        

    
    def test_that_withdrawn_amount_isnot_more_than_thebalance(self):
        
        balance = 1000
        withdrawn_amount = 500
        expected_balance = "Withdrew: ₦500 | New Balance: ₦500"
        actual_balance = withdrawal(withdrawn_amount, balance)
        self.assertEqual(actual_balance, expected_balance)
        
            
    def test_that_the_transaction_log_for_deposits_arerecorded_as_requested(self):
        
        balance = 0
        deposited_amount = 1000
        expected_transaction_log = "Deposited: ₦1000 | New Balance: ₦1000"
        actual_transaction_log = deposit(deposited_amount, balance)
        self.assertEqual(actual_transaction_log, expected_transaction_log)            
  
            
    def test_that_the_transaction_log_for_withdrawals_arerecorded_as_requested(self):
        
        balance = 1000
        withdrawn_amount = 500
        expected_transaction_log = "Withdrew: ₦500 | New Balance: ₦500"
        actual_transaction_log = withdrawal(withdrawn_amount, balance)
        self.assertEqual(actual_transaction_log, expected_transaction_log)            
  
        
       
        


        
     
