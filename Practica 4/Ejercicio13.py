i=0
cont=0
num=int(input("Introduce un número.\n"))#Inicializamos una variable que guardará el número introducido por teclado

for i in range(num):#For que comprobará si el número es divisible por otros y que el resto de 0
    if num%(i+1)==0:
        cont=cont+1#Variable que acumulará el número de veces que el resto de la división de 0

if cont>2:#Si el número de veces es superior a 2, es decir, es posible dividirlo con otros números que no sean 1 y el mismo
    print("El número no es primo")#Aparecerá este mensaje
else:
    print("El número es primo")#Si no este