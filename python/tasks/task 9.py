word = input('enter the nickname: ')

def nickname(word):
    result = ""
    previous_letter = False
    for letter in word:
        if letter.isalpha():
            if previous_letter:
                result += letter.upper()
                previous_letter = False
            else:
                result += letter.lower()
                previous_letter = True
        else:
            result += letter
    return result


print('welcome to the 2007, ', nickname(word),'!')