word=0#Inicializamos una variable que la usaremos más adelante para contar las palabras de la frase
phrase=input("Escribe una frase.\n")#Inicializamos una variable que guardará la frase introducida por teclado
words=phrase.split()#Convertimos la variable "phrase" en un array llamado "words"

for i in range(len(words)):#For que se repetirá tantas veces como posiciones tiene el array "words"
    word=word+1#En cada vuelta, sumamos 1 a la variable "word" así contando cuantas palanbras tiene la frase

if word>1:#If que decidirá que mensaje imprimir en pantalla dependiendo si hay mas de una palabras o no
    print("La frase tiene",str(word)+" palabras")
else:
    print("La frase tiene",str(word)+" palabra")