from Data import Data

class Presentation:
    def inicio(self):
        selection = int(input("Elige una opción:\n\t1.Ejercicio1\n\t2.Ejercicio2\n\t3.Ejercicio3\n\t4.Ejercicio4\n\t5.Ejercicio5\n"))
        a = Data()

        if selection < 1 or selection > 5:
            while selection < 1 or selection > 5:
                selection = int(input("Introduce un número del 1 al 5: "))

        if selection == 1:
            a.ejercicio1()

        if selection == 2:
            a.ejercicio2()

        if selection == 3:
            a.ejercicio3()

        if selection == 4:
            a.ejercicio4()

        if selection == 5:
            a.ejercicio5()