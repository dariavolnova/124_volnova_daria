import math
m1 = 5.97600 * math.pow(10, 24)
g = 6.6743 * math.pow(10, -11)
ms2 = float(input("Введите массу планеты в килограммах без степени десяти"))
s2 = float(input("Введите степень десяти"))
m2 = ms2 * math.pow(10, s2)
sr = float(input("Введите расстояние между планетами в метрах без степени десяти"))
s1 = float(input("Введите степень десяти"))
r = sr * math.pow(10, s1)
def formula(g, m1, m2, r):
    return (g * m1 * m2 / math.pow(r, 2))

f = formula(g, m1, m2, r)
print("Сила гравитцации равна", f,"H")