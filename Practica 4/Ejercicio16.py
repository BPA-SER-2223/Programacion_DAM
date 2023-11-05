error=1
accumulator=""
numbers=["0","1","2","3","4","5","6","7","8","9"]#Inicializamos un array con lo no permitido en la frase
phrase=input("Escribe una frase.\n")#Inicializamos un variable que guarde que guardará la frase que introduzca por teclado
caracter_1=input("Escribe el primer caracter: ")#Inicializamos un variables que guardara el primer carater
while error>0:#While que se repetirá hasta que no se produzca ningun error relacionado con los caracteres
    error=0#La variable de error masca 0 al principio de la comprobación
    for i in range(len(caracter_1)):#For que se repetirá tantas veces como caracteres tenga la variable "caracter_1"
        for j in range(len(numbers)):#For que se repetirá tantas veces como podiciones tenga el array "numbers"
            if caracter_1[i]==numbers[j] or len(caracter_1)>1:#Si la posición de la variable "caracter_1" coincide con alguna posición del array "numbers", se producirá un error
                error=error+1#Entonces el contador de errores incrementa en 1

    if error>0:#Si a habido algún error en la comprobación, aparecerá este mensaje y se pedirá otra vez el caracter
        caracter_1=input("El caracter no puede contener números o tener más de 1 caracter, intentalo otra vez: ")

error=1#Inicializamos la variable "error" para que el while que sucede a continuación de lugar
caracter_2=input("Escribe el segundo caracter: ")#Inicializamos un variables que guardara el segundo carater
while error>0:#While que se repetirá hasta que no se produzca ningun error relacionado con los caracteres
    error=0#La variable de error masca 0 al principio de la comprobación
    for i in range(len(caracter_2)):#For que se repetirá tantas veces como caracteres tenga la variable "caracter_2"
        for j in range(len(numbers)):#For que se repetirá tantas veces como podiciones tenga el array "numbers"
            if caracter_2[i]==numbers[j] or len(caracter_2)>1:#Si la posición de la variable "caracter_2" coincide con alguna posición del array "numbers", se producirá un error
                error=error+1#Entonces el contador de errores incrementa en 1

    if error>0:#Si a habido algún error en la comprobación, aparecerá este mensaje y se pedirá otra vez el caracter
        caracter_2=input("El caracter no puede contener números o tener más de 1 caracter, intentalo otra vez: ")

phrase=list(phrase)#Convertimos la frase en una lista
for i in range(len(phrase)):#For que se repetirá tantas veces como posiciones tiene las lista "phrase"
    if phrase[i]==caracter_1:#Si la posición de la lista coincide con el contenido de la variable "caracter_1", será sustituido por el contenido de la variable "caracter_2"
        phrase[i]=caracter_2

for i in range(len(phrase)):#For que se repetirá tantas veces como posiciones tiene las lista "phrase"
    accumulator=accumulator+phrase[i]#Para que al final la frase no aparezca como una lista, acumularemos su contenido en una variable llamada "accumulator"

print("El primer caracter se cambiará por el segundo caracter.\n"+accumulator)#Mensaje