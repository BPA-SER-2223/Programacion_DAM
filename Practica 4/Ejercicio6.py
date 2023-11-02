year=int(input("Introduce un año: "))

if year%4==0:
    print("Es bisiesto")
elif year%4==0 and year%100==0:
    print("No es bisiesto")
elif year%4==0 and year%100!=0:
    print("Es bisiesto")
elif year%4==0 and year%100!=0 and year%400==0:
    print("Es bisiesto")
else:
    print("No es bisiesto")