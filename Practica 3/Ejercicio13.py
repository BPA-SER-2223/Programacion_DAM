print("Cambio de contenido de variables")
A=int(input("Primer número: "))#Variable que guardará el primer número
B=int(input("Segundo número: "))#Variable que guardará el segundo número
#Cambio de variable para invertir el valor de A y B sin pisar(borrar por otra y perder el contenido de esa variable) una de ellas
C=A
A=B
B=C

print("A=",A, "B=",B)#Mensaje