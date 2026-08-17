#import unittest

    
from unittest import TestCase
from account_function import * #check_balance, deposit

class AccountTest(TestCase):

    def test_accountBalance_isZero_duringCreation(self):
        
        expected_balance = 0
        actual_balance = check_balance(0.0)
        self.assertEqual(actual_balance, expected_balance)
        


        
#        """
#        run on terminal with: python3 -m unittest account_function_test.py
#
#        """        
