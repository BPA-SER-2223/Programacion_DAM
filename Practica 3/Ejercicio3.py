import math

catetoA=int(input("Indica el cateto A del triángulo rectangulo: "))
catetoB=int(input("Indica el cateto B del triángulo rectangulo: "))

raiz=math.sqrt((pow(catetoA,2)+pow(catetoB,2)))#pow= elevar una valor al número indicado seguidamente sepado por una coma
print(raiz)