number = 153
original_number = number
sum_of_cubes = 0


while (number > 0):
    digit = number % 10                   
    sum_of_cubes  = sum_of_cubes + (digit * digit * digit)
    number = number / 10                       
        

       
if (sum_of_cubes  == original_number):
    print(f"{original_number} is an Armstrong number.")
else:
    print(f"{original_number} is not an Armstrong number.")
        
    
