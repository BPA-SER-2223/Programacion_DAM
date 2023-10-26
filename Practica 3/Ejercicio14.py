print("Un ciclista parte de la ciudad A a la B")
print("¿Cuando sale de la ciudad A? Pod: formato hh:mm:ss (digital)")
horas=int(input("Indica las horas: "))
minutos=int(input("Indica los minutos: "))
segundos=int(input("Indica los segundos: "))
print("\n")
print("¿Cuanto tiempo tarda?")
tiempo=int(input("Indicalo en segundos: "))

print("Salio de la ciudad A a las "+str(horas).zfill(2)+":"+str(minutos).zfill(2)+" y "+str(segundos)+" segundos")
segundos=int(segundos+(tiempo%60))
minutos=int(minutos+(tiempo/60))
if minutos>=60:
    minutos=minutos%60

horas=int(horas+(tiempo/3600))
print("Llegará a la ciudad B a las "+str(horas).zfill(2)+":"+str(minutos).zfill(2)+" y "+str(segundos)+" segundos")
