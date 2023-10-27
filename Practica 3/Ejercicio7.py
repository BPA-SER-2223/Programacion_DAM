tiempo=int(input("Introduce la cantidad de minutos:\n"))#Inicializamos una variable de tipo número entero
horas=int(tiempo/60)#Inicializamos una variable que almacenará las horas
minutos=tiempo-(horas*60)#Inicializamos una variable que almacenará los minutos sobrantes

print(str(horas)+" hora/s y "+str(minutos)+" minuto/s")#Mensaje