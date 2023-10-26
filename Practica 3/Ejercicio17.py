num1=float(input("Escriba el primer número:\n"))
num2=float(input("Escriba el segundo número:\n"))

if num1 > num2:
    print(str(num1)+" es mayor")
else:
    if num1 < num2:
        print(str(num2)+" es mayor")
    else:
        print("Son iguales")