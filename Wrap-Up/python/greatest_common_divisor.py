firstNumber = 10
secondNumber = 20
divisor = 0


for count in range(1,21):
    if(firstNumber % count == 0 and secondNumber % count == 0):
        divisor = count
 
print(divisor)
