import math

catetoA=int(input("Indica el cateto A del triángulo rectangulo: "))#Inicializamos una variable de tipo número entero
catetoB=int(input("Indica el cateto B del triángulo rectangulo: "))#Inicializamos una variable de tipo número entero

raiz=math.sqrt((pow(catetoA,2)+pow(catetoB,2)))#pow= elevar una valor al número indicado seguidamente sepado por una coma
print(raiz)#Mensaje con la raiz ya calculada