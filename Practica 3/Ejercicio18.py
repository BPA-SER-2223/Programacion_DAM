num=float(input("Escribe un número: "))#Inicializamos una variable que guardará el número introducido por teclado

if num>0:#If que averigurá si es positivo, negativo o 0
    print("Es positivo")
else:
    if num<0:
        print("Es negativo")
    else:
        print("Es igual a 0")