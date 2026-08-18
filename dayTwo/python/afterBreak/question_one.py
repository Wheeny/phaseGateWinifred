def age_calc( current_fathers_age, current_sons_age):
    number_of_years = 0
    if(current_fathers_age/2 > current_sons_age):
        number_of_years = current_fathers_age - (current_sons_age *  2)
            
        print("The father was twice his son's age ", number_of_years, "years ago")
            
            
    else:
        number_of_years =   (current_sons_age*2) - current_fathers_age
        print("The father will be  twice his son's age in ", number_of_years, " years time")





fathers_age = 38
sons_age = 18
age_calc(fathers_age, sons_age)
   
    
