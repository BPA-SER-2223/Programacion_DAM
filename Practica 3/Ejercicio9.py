porcentaje=[0.6,0.3,0.1]#Inicializamos un array con los porcentajes
actividades=["practicas","examenes","actitud"]#Inicializamos un array con los nombres de lo que se puntualizará
i=0
acumulator=0

while i in range(0,3):#While que pedirá la nota de cada posición del array "actividades" y lo acumulará multiplicado por el porcentaje correspondiente
    nota=float(input("Nota "+actividades[i]+": "))
    acumulator=acumulator+(nota*porcentaje[i])
    i=i+1

print("Tu calificación total es: "+str(acumulator))#Mensaje