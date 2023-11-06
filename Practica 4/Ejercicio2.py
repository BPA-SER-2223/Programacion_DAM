letter=input("Introduce una letra: ")#Inicializamos una variable de tipo letra

if len(letter)>1 or len(letter)==0:#If que comparará el contenido de la variable letra con la condición impuesta(que le contenido de la variable sea los de uncaracter)
    while len(letter)>1 or len(letter)==0:#While que pedirá el contenido de la variable "letra" hasta que sea de un caracter
        letter=input("Introduce una letra: ")

if letter==letter.upper():#If que comparará el contenido final de "letra" para saber si en mayúscula o minúscula
    print("Es una letra mayúscula")
else:
    print("Es una letra minúscula")