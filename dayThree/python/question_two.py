def reverseInt(number):
    reverse = 0

    while (number > 0):
        last_digit = number % 10
    
        reverse = (reverse * 10) + last_digit
    
        number = number//10
    return reverse
   
number = 234
print(reverseInt(number))    



#
#number = 234
#def reverseString(number):
#    reverse = ""
#
#    for _ in word:
#        reverse = _ + reverse 
#        
#    return reverse
#        
#word = "234"
#print(reverseString(number))
#

   


