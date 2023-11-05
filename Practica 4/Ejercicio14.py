error=0#Inicializamos una variable que usaremos más adelante para contar los fayos(números en la palabra/frase)
search=0#Inicializamos una variable que usaremos más adeñante para contar el resultado de la busqueda
num=["0","1","2","3","4","5","6","7","8","9"]#Creamos una variable con lo no permitido en la palabra/frase
word=input("Introduce una palabras/frase.\n")#Variable que guardará la palabra/frase
caracter=input("Introduce el caracater que quieras buscar.\n")#Variable que guardará el caracter a buscar

for i in range(len(word)):#For que se repetirá tantas veces como caracteres tenga la el contenido de la variable llamada "word"
    if word[i] == caracter:#Si el caracter de la palabra es igual al caracter guardado en la variable "caracter", se sumará uno a la variable "seach"
        search = search + 1

    for j in range(len(num)):#For que se repetirá tantas veces como posiciones tenga el array llamado "num"
        if word[i]==num[j] or caracter==num[j]:#Si el caracter al que apunta la variable "i" coincide con algunas de las posiciones del array llamado "num", se sumará 1 a la variable "error"
            error=error+1
if error>0:#Si la variable "error" es mayor a 0, saltará un mensaje de error
    print("Error, no se puede introducir o contener números.")
else:#Si no, se imprimirá en pantalla el resultado de la busqueda
    print("Hay un total de "+str(search)+" caracteres de la busqueda.")