number = int(input("Enter a number: "))       
factorial = 1


for count in range(number, 1, -1):
    factorial *= count
          
        
print(factorial)  

