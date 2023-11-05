accumulator=""
word=input("Escribe una palabra.\n")#Inicializamos una variable que guardará la palabra metida por teclado
list=list(word)#Convierto la variable "word" en lista

for i in range(len(word)):#For que se repetirá tantas veces como caracteres tiene la variable "word"
    accumulator=list[i]+accumulator#Variable que guardará la palabra en orden inverso

if accumulator.lower()==word.lower():#Si la variable con la palabra normal y la variable con la palabra
    print("Es una palabra palídroma")#Se imprimirá en pantalla este mensaje
else:
    print("No es una palabra palídroma")#Si no, aparecerá este