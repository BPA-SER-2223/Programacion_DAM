i=0
number=[1,2,3,4,5,6,7,8,9,10,11,12]#Inicializamos un array con el numero de meses que tiene un año
month=["Enero tiene 31 días","Febrero tiene 28 días","Marzo tiene 31 días","Abril tiene 30 días","Mayo tiene 31 días","Junio tiene 30 días","Julio tiene 31 días","Agosto tiene 31 días","Septiembre tiene 30 días","Octubre tiene 31 días","Noviembre tiene 30 días","Diciembre tiene 31 días"]#Inicializamos un array con los dias que tiene cada mes de un año

num=int(input("Introduce un número del 1 al 12.\n"))#Variable que guardará el número que introduzcamos por teclado

if num<1 or num>12:#If que comprobará si el número introducido está entre 1 y 12
    print("Error")#Si no está, aparecerá este mensaje de error

for i in range(len(number)):#For que se repetira tanta veces como posiciones tiene el array llamado "number"
    if num==number[i]:#If que buscará el número introducido en el array llamado "number"
        print(month[i])#Si lo encuentra, aparecerá este mensaje el cual contiene el contenido de la posición indicada por "i" de array llamado "month"
        break