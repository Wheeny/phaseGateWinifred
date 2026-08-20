sum_total = 0
for _ in range(1,11):
    score = int(input("Enter score: "))
    if score > 0 and score < 100:     
        sum_total += score
    else:
        print("Invalid Input")      
      
        
print(f"Sum: {sum_total}")
    





