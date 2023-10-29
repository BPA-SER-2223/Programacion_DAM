num1=float(input("Indica el dividendo: "))#Inicializamos una variable que guardará el primer número que escribamos
num2=float(input("Indica el divisor: "))#Inicializamos una variable que guardará el segundo número que escribamos

if num2!=0:#If que permitirá la realización de la división si el divisor es diferente a 0
    print(num1/num2)
else:
    print("Indica un divisor diferente a 0")