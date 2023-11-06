import random#Importamos la opción random para poder generar números aleatorios
accumulator=0#Inicializamos una variable que usaremos para contar cuanto números se generan antes de que salga el número 24
i=0

while i!=24:#While que se repetirá hasta que la condición sea falsa, es decir, hasta que la variable "i" sea 24
    i=random.randint(0,50)*2#Guardamos un número rando del 0 al 50 multiplicado por 2, así teniendo números del 0 al 100 unicamente pares
    print(i)#Imprimimos en pantalla el contenido de la variable "i"
    accumulator=accumulator+1#Sumamos uno al contador de números

print("Se han generado "+str(accumulator)+" números")#Mensaje con el número total de números aleatorios pares generados