number = 28
sum_of_divisors = 0

for count in range (1,number):
    if (number % count == 0):
        sumof_divisors = sum_of_divisors + count
        


if (sum_of_divisors == number):
    print(f"{number} is a perfect number.")
else:
    print(f"{number} is not a perfect number.")
      
