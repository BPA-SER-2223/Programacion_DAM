greater=0
less =0
cero=0

num=int(input("¿Cuantos números quieres?\n"))#Inicializamos una variable que guardará el número de números que queremos

for i in range(num):#For que se repetirá tanta veces como indique la variable "num"
    num_2=int(input("Escribe el "+str(i+1)+"º número: "))#Variable que pedirá umn número

    if num_2>0:#If que determinará si el número introducido es menor, mayor o igual a 0
        greater=greater+1
    elif num_2<0:
        less =less +1
    else:
        cero=cero+1

print("\nHay "+str(greater)+" números mayores a 0.")#Mensaje que indicará cuantos números de los introducidos son mayores a 0
print("Hay "+str(less )+" números menores a 0.")#Mensaje que indicará cuantos números de los introducidos son menores a 0
print("Hay "+str(cero)+" números iguales a 0.")#Mensaje que indicará cuantos números de los introducidos son iguales a 0