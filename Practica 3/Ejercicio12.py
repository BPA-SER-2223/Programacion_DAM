i=0

accumuX=0
accumuY=0

while i in range(0,2):
    x=int(input(str((i+1))+"º número de x: "))
    accumuX=abs(accumuX-x)
    y=int(input(str((i+1))+"º número de y: "))
    accumuY=abs(accumuY-y)
    i=i+1

print("La distancia entre ello es "+str(accumuX)+"x"+str(accumuY)+"y")