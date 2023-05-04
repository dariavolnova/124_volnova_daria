import random
number = random.randint(1, 100)
count = 0
name = input('enter your name buddy: ')
while True:
    x = int(input('i picked a number! try to guess: '))
    count += 1 
    if x > number:
        print('try less')
        
    elif x < number:
        print('try more')
        
    if x == number:
        print('you are right! congradulations!')
        break

with open("game.txt", "a", encoding = 'utf-8') as f:
    f.write("{} - {} attempts\n".format(name, count))