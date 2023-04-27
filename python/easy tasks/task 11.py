text = input("Введите текст от 5 слов с пробелами: ")
word_count = text.count(" ") 
if text.count(" ") < 4: 
    print("Ты точно умеешь считать?")
else:
    words = text.split()
    print(words)

    the_longest = max(words,key=len)
    print("Самое длинное слово:", the_longest)

    common = max(set(words),key = words.count)
    print("Самое часто повторяющееся слово:",common)

