def lowest_common_multipe_calc(first_number, second_number):

    start = first_number
    if (second_number > first_number):
        start = second_number
      

        for count in range(start, first_number * second_number):
            if (count % first_number == 0 and count % second_number == 0):
                return count
          
    return first_number * second_number




first_number = 10
second_number = 20
print(lowest_common_multipe_calc(first_number, second_number))
