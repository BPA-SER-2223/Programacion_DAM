side_A=int(input("Introduce el lado A del triángulo: "))#Inicializamos un variable la cual guardará el lado A del triángulo introducido por teclado
side_B=int(input("Introduce el lado B del triángulo: "))#Inicializamos un variable la cual guardará el lado B del triángulo introducido por teclado
side_C=int(input("Introduce el lado C del triángulo: "))#Inicializamos un variable la cual guardará el lado C del triángulo introducido por teclado

if side_C==((side_A*side_A)+(side_B*side_B)):#If que realizará el teorema de pitágoras para saber si el triángulo es rectangulo
    print("Es un triángulo rectangulo")
elif side_A == side_B == side_C:#If que comparará los 3 lados entre si para saber si son iguales
    print("Es un triángulo equilátero")
elif side_A==side_B or side_A==side_C or side_B==side_C:#If que buscará dos lados iguales 
    print("Es un triángulo isósceles")
else:
    print("Es un triángulo escaleno")

