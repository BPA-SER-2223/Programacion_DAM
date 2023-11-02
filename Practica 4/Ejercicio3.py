grade=float(input("Introduce tu nota: "))#Inicializamos una variable de tipo número decimal
age=int(input("Introduce tu edad: "))#Inicializamos una variable de tipo número entero
sex=input("Introduce tu sexo: ")#Inicializamos una variable de tipo palabra

if grade>=5 and age>=18 and sex.lower()=="f":#If que comparará el contenido de la variable anteriores con algunas especificaciones
    print("ACEPTADA")
elif grade>=5 and age>=18 and sex.lower()=="m":
    print("POSIBLE")
else:
    print("NO ACEPTADA")