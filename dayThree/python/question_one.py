def reverseString(word):
    reverse = ""

    for _ in word:
        reverse = _ + reverse 
        
    return reverse
        
word = "Happy"
print(reverseString(word))
   

