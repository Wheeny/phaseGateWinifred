def score_grading(score_one, score_two, score_three):
    average = (score_one + score_two + score_three)/3;
    
    if(average >= 90 and average <= 100):
        print("A")
  
    elif(average >= 80 and average <= 90):
        print("B")
  
    elif(average >= 70 and average <= 80):
        print("C")
   
    elif(average >= 60 and average <= 70):
        print("D")
  
    else:
        print("F")
   
   
 
score_one = 60
score_two = 70
score_three = 50
    
score_grading(score_one, score_two, score_three)
    
 
    
       
     
    
    
    
