text = input("Введите текст от 5 слов с пробелами: ")
if text.count(" ") < 4: 
    print("Ты точно умеешь считать?")
else:
    words = text.split()
    # print(words)

    the_longest = max(words,key=len)
    print("Самое длинное слово:", the_longest)

    common = max(set(words),key = words.count)
    if len(set([len(word) for word in words])) == 1:
        print("Самое часто повторяющееся слово:", words[0])
    else:
        print("Самое часто повторяющееся слово:",common)

