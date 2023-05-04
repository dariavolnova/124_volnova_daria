def search_substr(subst, st):
    if subst.lower() in st.lower():
        print ("Есть контакт!")
    else:
        print ("Мимо!")
st= input("enter the string: ")
subst = input("enter the substring: ")
search_substr(subst, st)