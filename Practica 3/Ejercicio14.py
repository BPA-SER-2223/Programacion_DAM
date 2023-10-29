print("Un ciclista parte de la ciudad A a la B")#Mensaje
print("¿Cuando sale de la ciudad A? Pod: formato hh:mm:ss (digital)")#Mensaje
horas=int(input("Indica las horas: "))#Variable que guardará la hora de la salida
minutos=int(input("Indica los minutos: "))##Variable que guardará los minutos de la salida
segundos=int(input("Indica los segundos: "))#Variable que guardará los segundos de la salida
print("\n")#Intro
print("¿Cuanto tiempo tarda?")#Mensaje
tiempo=int(input("Indicalo en segundos: "))#Inicializamos una variable que guardará el tiempo que tardará el ciclista en llegar a la ciudad B en segundos

print("Salio de la ciudad A a las "+str(horas).zfill(2)+":"+str(minutos).zfill(2)+" y "+str(segundos)+" segundos")#Mensaje con la hora de salida
segundos=int(segundos+(tiempo%60))#Calculamos los segundo restantes al pasarlos a minutos
minutos=int(minutos+(tiempo/60))#Calculamos los minutos
if minutos>=60:
    minutos=minutos%60

horas=int(horas+(tiempo/3600))#Calculamos las horas
print("Llegará a la ciudad B a las "+str(horas).zfill(2)+":"+str(minutos).zfill(2)+" y "+str(segundos)+" segundos")#Mensaje con la hora de llegada
