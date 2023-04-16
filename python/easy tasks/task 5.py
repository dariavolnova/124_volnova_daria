a = float(input("enter a number between 1000 and 99999: "))
b = float(input("enter a second number between 1000 and 99999: "))
c = a + b

def eqv(a, b, c):
    eps = 0.0001 * max(a, b)
    return (c - a - b) < eps

print(eqv(a, b, c)) 
