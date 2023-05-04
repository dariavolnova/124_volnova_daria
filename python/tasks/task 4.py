import random

chisla = [random.randint(0,9999) for i in range(random.randint(5,100))]
x = random.randint(1,9999) 

def magic(chisla, x):
    return sum(chisla) % x == 0

#print(x)
#print(chisla)
print(magic(chisla, x))