def prime_numbers(numbers):
    prime_count = 0


    for count in range(len(numbers)):
        current_num = numbers[count]
        factor_counter = 0

        for check in range(1, current_num + 1):
            if current_num % check == 0:
                factor_counter += 1

        if factor_counter == 2:
            prime_count += 1

 
    array_of_prime_numbers = [0] * prime_count
    index = 0

  
    for count in range(len(numbers)):
        current_num = numbers[count]
        factor_counter = 0

        for check in range(1, current_num + 1):
            if current_num % check == 0:
                factor_counter += 1

        if factor_counter == 2:
            array_of_prime_numbers[index] = current_num
            index += 1

  
    placeholder = 0
    length = len(array_of_prime_numbers)
    for checker in range(length - 1):
        for counter in range(length - 1 - checker):
            if array_of_prime_numbers[counter] < array_of_prime_numbers[counter + 1]:
                placeholder = array_of_prime_numbers[counter]
                array_of_prime_numbers[counter] = array_of_prime_numbers[counter + 1]
                array_of_prime_numbers[counter + 1] = placeholder

    return array_of_prime_numbers





def replace_negatives(array):
    counter = 0
    rearranged = [0] * len(array)

    for count in range(len(array)):
        if array[count] >= 0:
            rearranged[counter] = array[count]
            counter += 1
        else:
            rearranged[counter] = 0
            counter += 1

    return rearranged






def move_zeros(array):
    counter = 0
    rearranged = [0] * len(array)

    for count in range(len(array)):
        if array[count] != 0:
            rearranged[counter] = array[count]
            counter += 1

    return rearranged


def main():
    array = [5, 9, 3, 6, 2]
    print(prime_numbers(array))

    second_array = [5, -9, 3, -6, 2, -11]
    print(replace_negatives(second_array))

    third_array = [5, 0, 3, 0, 2, 0]
    print(move_zeros(third_array))




main()
    
    
#array = [5, 9, 3, 6, 2]
#print(prime_numbers(array))
#
#second_array = [5, -9, 3, -6, 2, -11]
#print(replace_negatives(second_array))
#
#third_array = [5, 0, 3, 0, 2, 0]
#print(move_zeros(third_array))    
#    
#    
