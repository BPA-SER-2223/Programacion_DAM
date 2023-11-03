year=int(input("Introduce un año: "))#Inicializamos una variable que guardarà el año que introduzcamos por teclado

if year%4==0:#Si el año introducido al dividirse por 4 el resto es 0, el año será bisiesto
    print("Es bisiesto")
elif year%4==0 and year%100==0:#Si el año introducido al dividirse por 4 y 100 el resto es 0, el año no será bisiesto
    print("No es bisiesto")
elif year%4==0 and year%100!=0:#Si el año introducido al dividirse por 4 el resto es 0 pero al dividirlo por 100 el resto no es 0, el año será bisiesto
    print("Es bisiesto")
elif year%4==0 and year%100!=0 and year%400==0:#Si el año introducido al dividirse por 4 el resto es 0, al dividirlo por 100 el resto no es 0 y al dividirlo por 400 el resto es 0, el año será bisiesto
    print("Es bisiesto")
else:#Si no es nada de lo anterior, el año no será bisiesto
    print("No es bisiesto")