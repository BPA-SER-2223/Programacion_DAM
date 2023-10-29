nombre=input("Introduce tu nombre completo: ")#Inicializamos una variable de tipo palabra
palabras=nombre.split()#Convertimos la varianle "nombre" en un array llamado palabras
accumulator=""
i=0
for i in range(0,len(palabras)):#For que guardará las iniciales 
    accumulator=accumulator+palabras[i][0]
    i=i+1
print("Tus iniciales son "+str(accumulator.upper()))#Mensaje con las iniciales