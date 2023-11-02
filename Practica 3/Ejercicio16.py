valor=[200,100,50,20,10]#Inicializamos una array con los valores de cada moneda
moneda=["2 euros","1 euro","50 centimos","20 centimos","10 centimos"]#Inicializamos un array para los mensajes para el usuario

i=0
accumulator=0
for i in range(0,len(valor)):#For que pedirá la cantidad de monedas de cada tipo y las multiplicará con su valor correspondiente
    dinero=int(input("¿cuantas monedas de "+moneda[i]+" tines? \n"))
    accumulator=accumulator+(dinero*valor[i])

print("Tienes "+str(int(accumulator/100))+"€ con "+str(accumulator%100)+" centimos")#Mensaje que mostrará la cantidad total el euros y centimos