nombre=input("Introduce tu nombre completo: ")
palabras=nombre.split()
accumulator=""
i=0
for i in range(0,len(palabras)):
    accumulator=accumulator+palabras[i][0]
    i=i+1
print("Tus iniciales son "+str(accumulator.upper()))