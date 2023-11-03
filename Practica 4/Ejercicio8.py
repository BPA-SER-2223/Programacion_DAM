i=0
days=[1,2,3,4,5,6,7]#Inicializamos un array que contendrá el número de dias que hay en una semana
week=["Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"]#Inicializamos un array que contendrá los dias de la semana

day=int(input("Introduce un número del 1 al 7.\n"))#Inicialiamos una variable que guardará el número que introduzcamos por teclado

if day<1 or day>7:#If que comprobará si el número introducido entra en el rango(numeros del 1 al 7)
    print("Error")#Si está fuera del rango, se mostrará un mensaje de error
else:#Si está dentro del rango, se ejecutará este for
    for i in range(len(days)):#For que se repetirá tanta veces como posiciones tiene el array llamado "days"
        if day==days[i]:#If que comprobará si el número introducido está dentro del array llamado "days"
            print(week[i])#Si está el número, se mostrará en pantalla un mensaje con la el contenido de la posición correspondiente del array llamado "week"
            break