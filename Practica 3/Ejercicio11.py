import math

num=int(input("Indica un número: "))#Inicializamos una variable de tipo número entero
cuad=math.sqrt(num)#Inicializamos un variable llamada "cuad" que guardará el cuadrado de la variable "num"
"""cub=math.cbrt(num)"""
cub=num**(1/3)#Inicializamos un variable llamada "cub" que guardará el cubo de la variable "num"

print("Su raiz cuadrada es:" ,cuad, "\nSu raiz cúbica es:",cub)#Mensaje