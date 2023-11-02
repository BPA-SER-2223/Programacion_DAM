i=0

accumuX=0
accumuY=0

while i in range(0,2):#While que pedirá dos veces la posiciones de x e y para después restarlos y saber la distancia entre ellos
    x=int(input(str((i+1))+"º número de x: "))
    accumuX=abs(accumuX-x)
    y=int(input(str((i+1))+"º número de y: "))
    accumuY=abs(accumuY-y)
    i=i+1

print("La distancia entre ello es "+str(accumuX)+"x"+str(accumuY)+"y")#Mensaje con la solución