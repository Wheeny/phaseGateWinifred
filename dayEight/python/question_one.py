def quantitativeAptitude(numbers):
#    rearranged =  [len(numbers)]
    result = 0
    counter = 0
   
    
    
    for num in numbers:
        if num % 2 == 0:
            numbers =  num * 2 
#            for _ in rearranged:
#                _ = result
#                counter +=1
            
        
        
        else:
            numbers = num + 1
#            for _ in rearranged:
#                _ = result
#                counter +=1
           
       
#   return rearranged
    return numbers
    

numbers = [2,8,14,5,1]
quantitativeAptitude(numbers)
print(quantitativeAptitude)
