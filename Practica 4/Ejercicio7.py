dice=[6,5,4,3,2,1]#Inicializamos una array el cual contendrá los posibles números del dado
contrary=["uno","dos","tres","cuatro","cinco","seis"]#Inicializamos un array que contendrá los contrarios del array llamado "dice" pero en palabras

num=int(input("Introduce una cara de un dado(1-6).\n"))#Variable que guardará la cara del dado que introduzcamos por teclado

if num<1 or num>6:#if que comprobará si el número introducido es menor a 1 o mayor a 6
    print("ERROR: número incorrecto")#Si se cumple la condición del if, saltará este mensaje

for i in range(len(dice)):#For que comprobará si el número introducido está en el array llamado "dice"
    if num==dice[i]:
        print("Su contrario es el "+contrary[i])#Si está, saltará este mensaje el cual contiene el contrario
        break