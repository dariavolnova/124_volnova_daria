import random
list_1 = [random.randint(0, 9999) for i in range(random.randint(50,100))]
list_2 = [random.randint(0, 9999) for i in range(random.randint(50,100))]

list_result = [i for i in list_1 if i in list_2]
print(list_result)