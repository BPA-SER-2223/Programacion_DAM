import random#Importamos la opción de generar números aleatorios con la opción random
import statistics#Importamos la opción de las operaciones que realizaremos más adelante

lista=[]#Crearemos una lista para guardar los 50 números
for i in range(50):#For que se repetirá 50 veces
    lista.append(random.randint(100,199))#Generamos el número random
    i+=1#Aunmentamos 1 al contador del bucle
print(lista)#Mensaje con la
print("El maximo es "+str(max(lista)))#Mensaje con el máximo
print("El minimo es " +str(min(lista)))#Mensaje con el mínimo
print("La moda es "+str(statistics.mode(lista)))#Mensaje con la moda
print("La media es "+str(statistics.mean(lista)))#Mensaje con la media
print("La mediana es "+str(statistics.median(lista)))#Mensaje con la mediana
print("La desviación típica es "+str(statistics.stdev(lista)))#Mensaje con la desviación típica