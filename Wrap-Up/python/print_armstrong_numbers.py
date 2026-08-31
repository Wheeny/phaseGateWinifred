for count in range(1, 1001):
    
    temp_number = count
    digits = 0
    
    
    while temp_number > 0:
        digits += 1
        temp_number = temp_number // 10

    temp_number = count
    total_sum = 0
    
   
    while temp_number > 0:
        digit = temp_number % 10
        
        product = 1
        for _ in range(digits):
            product = product * digit
            
        total_sum = total_sum + product
        temp_number = temp_number // 10

    if total_sum == count:
        print(f"{count} is an Armstrong number.")
