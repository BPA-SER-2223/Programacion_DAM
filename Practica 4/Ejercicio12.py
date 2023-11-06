result=1#inicializamos un variable de tipo número que más adelante guardará el resultado de la operación

base=int(input("Escribe la base de la operación: "))#Variable en la cual se guardará la base de la operación
exponent=int(input("Escribe el exponente de la operanción: "))#Variable en la cual se guardará el exponente de la operación

for i in range(exponent):#For que se repetirá tanta veces como la variable "expont" lo inique
    result=result*base

print(str(base)+" elevado a "+str(exponent)+" es "+str(result))#Mensaje con el resultado de la operación