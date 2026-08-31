number = 145
original_number = number
sum_of_factorials = 0

        
while (number > 0):
    digit = number % 10

           
    factorial = 1
    for count in range(1, digit+1):
        factorial = factorial * count
            

        
    sum_of_factorials  = sum_of_factorials  + factorial

    number = number // 10 
        


if (sum_of_factorials  == original_number ):
    print(f"{original_number} is a Strong number.")
       
else:
    print(f"{original_number} is not a Strong number.")
        

