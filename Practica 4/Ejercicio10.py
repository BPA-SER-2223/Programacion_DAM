import random

i=0
random=random.randint(1,100)#Inicializamos una variable que guardará un número aleatorio del 1 al 100
trys=0#Inicializamos una variable que se utilizará par contar los intentos del usuario para adivinar el número aleatorio
print("Hay que adivinar un número del 1 al 100. Tienes 10 intentos.")#Mensaje

for i in range(10):#For que se repetirá como máximo 10 veces que será los intentos que tendrá el usuario
    trys=trys+1#Contador de intentos
    number=int(input(""))#Inicializamos una variable que guardará los número que introducirá el usuario para intentar adivinar ek número random

    if number<random:#If que indicara si el intento es mayor,menor o igual al número random
        print("El número es mayor")#Aparecerá este mensaje si el intento es mayor
    elif number>random:
        print("El número es menor")#Aparecerá este mensaje si el intento es menor
    else:
        print("¡Correcto!\nNúmero de intentos: "+str(trys))#Aparecerá este mensaje si el intento es igual
        break

if trys==10:#Si se le acaban los intentos aparecerá este mensaje que informará de ello y el número random
    print("\nSe acabo. El número era "+str(random))