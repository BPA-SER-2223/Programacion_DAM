porcentaje=[0.6,0.3,0.1]
actividades=["practicas","examenes","actitud"]
i=0
acumulator=0

while i in range(0,3):
    nota=float(input("Nota "+actividades[i]+": "))
    acumulator=acumulator+(nota*porcentaje[i])
    i=i+1

print("Tu calificación totale es: "+str(acumulator))

