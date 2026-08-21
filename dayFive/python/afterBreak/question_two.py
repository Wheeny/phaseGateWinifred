array = [2,2,1,6,7]
result = 0;
countRepetition = 0
holder = 0
   
for count in range(len(array)):
    for counter in range(len(array)):  
        if(array[count] == array[counter]):
            holder = array[count]
            countRepetition+=1  
    if(countRepetition == 1):
    print(holder)


    countRepetition = 0
     
  
   
 
        
