import math

num=int(input("Indica un número: "))

cuad=math.sqrt(num)
"""cub=math.cbrt(num)"""
cub=num**(1/3)

print("Su raiz cuadrada es:" ,cuad, "\nSu raiz cúbica es:",cub)