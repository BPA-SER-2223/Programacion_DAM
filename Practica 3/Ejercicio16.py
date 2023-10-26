valor=[200,100,50,20,10]
moneda=["2 euros","1 euro","50 centimos","20 centimos","10 centimos"]

i=0
accumulator=0
for i in range(0,len(valor)):
    dinero=int(input("¿cuantas monedas de "+moneda[i]+" tines? \n"))
    accumulator=accumulator+(dinero*valor[i])

print("Tienes "+str(int(accumulator/100))+"€ con "+str(accumulator%100)+" centimos")