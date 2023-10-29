num1=float(input("Escriba el primer número:\n"))#Inicializamos una variable que guardará el primer número que escribamos
num2=float(input("Escriba el segundo número:\n"))#Inicializamos una variable que guardará el segundo número que escribamos

if num1 > num2:#If que compara las 2 variables en busca del mayor
    print(str(num1)+" es mayor")
else:
    if num1 < num2:
        print(str(num2)+" es mayor")
    else:
        print("Son iguales")#Si no se dan ninguna de las dos situaciones anteriores, serán iguales