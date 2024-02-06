from logic.GestorListas import *
from logic.OperadorTuplas import *
from logic.GestorDiccionarios import *
from logic.OperadorConjuntos import *
from logic.GestorMixto import *

class Data:
    def ejercicio1(self):

        infinite = 0
        ej1 = GestorListas([1, 2, 3])

        while infinite == 0:

            selection = int(input("\nEliger una opción:\n\t1.Agregar a la lista\n\t2.Actualizar lista\n\t3.Eliminar algo de la lista\n\t4.Mostrar lista\n\t5.Salir\n"))

            if selection < 1 or selection > 5:
                while selection < 1 or selection > 5:
                    selection = int(input("Introduce un número del 1 al 5: "))

            if selection == 1:
                num = int(input())
                ej1.add_to_the_list(num)

            if selection == 2:
                for i in range(len(ej1.get_list())):
                    print("- " + str(ej1.get_list()[i]))

                num = int(input("Elige que número quieres reemplazar: "))
                num2 = int(input("Introduce el nuevo numero: "))
                ej1.update_the_list(num, num2)

            if selection == 3:
                position = int(input("Elige la posición del número quieres eliminar: "))
                ej1.eliminate_something_of_the_list(position)

            if selection == 4:
                print(ej1.get_list())

            if selection == 5:
                break

    def ejercicio2(self):

        infinite = 0
        res = []

        ej2 = OperadorTuplas((1,2,3,4))


        while infinite == 0:

            selection = int(input(
                "\nEliger una opción:\n\t1.Mostrar tupla\n\t2.Crear subtupla\n\t3.Salir\n"))

            if selection < 1 or selection > 3:
                while selection < 1 or selection > 3:
                    selection = int(input("Introduce un número del 1 al 3: "))

            if selection == 1:
                print(ej2.get_tupla())

            if selection == 2:
                ej2.create_subtupla()

            if selection == 3:
                break

    def ejercicio3(self):
        infinite = 0
        ej3 = GestorDiccionarios({"Ana":"Amiga", "Pedro":"Amigo"})

        while infinite == 0:

            selection = int(input(
                "\nEliger una opción:\n\t1.Agregar al diccionario\n\t2.Actualizar el diccionario\n\t3.Eliminar algo del diccionario\n\t4.Mostrar aldo del diccionario\n\t5.Salir\n"))

            if selection < 1 or selection > 5:
                while selection < 1 or selection > 5:
                    selection = int(input("Introduce un número del 1 al 5: "))

            if selection == 1:
                word = str(input("Introduce una nueva palabra: "))
                mean = str(input("Introduce su significado: "))
                ej3.add_to_dicc(word, mean)

            if selection == 2:
                selection=int(input("\n1.Actualizar keys\n2.Actualizar valores"))

                if selection < 1 or selection > 2:
                    while selection < 1 or selection > 2:
                        selection = int(str("Introduce un 1 o un 2: "))

                if selection == 1:
                    print("Elige que key vas a cambiar:\n\n" + str(ej3.get_dicc().keys()))
                    old_key = str(input("Key actual: "))
                    new_key = str(input("Nueva key: "))
                    ej3.change_key(old_key, new_key)

                if selection == 2:
                    print(ej3.get_dicc().items())
                    word = str(input("Introduce la key del valor a cambiar: "))
                    mean = str(input("Introduce el nuevo valor de la key anterior: "))

                    ej3.add_to_dicc(word, mean)
                    print("\n¡Valor cambiado!")

            if selection == 3:
                key = str(input("Introduce la key del valor a eliminar: "))
                ej3.deleter_something(key)

            if selection == 4:
                key = str(input("Introduce la key del valor a buscar: "))
                ej3.seach_something(key)

            if selection == 5:
                break

    def ejercicio4(self):

        infinite = 0
        ej4 = OperadorConjunto({1,2,3,4})

        while infinite == 0:

            selection = int(input(
                "\nEliger una opción:\n\t1.Agregar al conjunto\n\t2.Actualizar conjunto\n\t3.Eliminar algo del conjunto\n\t4.Mostrar conjunto\n\t5.Unión de conjuntos\n\t6.Salir\n"))

            if selection < 1 or selection > 6:
                while selection < 1 or selection > 6:
                    selection = int(input("Introduce un número del 1 al 6: "))

            if selection == 1:
                num = int(input())
                ej4.add_set(num)
                print("\n¡Número añadido!")

            if selection == 2:
                print(ej4.get_conj())

                num = int(input("Elige que número quieres reemplazar: "))
                num2 = int(input("Introduce el nuevo numero: "))
                ej4.update_set(num, num2)

            if selection == 3:
                print(ej4.get_conj())
                dele = int(input("Introduce el número a eliminar: "))
                ej4.deleter_conj(dele)

            if selection == 4:
                print(ej4.get_conj())

            if selection == 5:
                new_conj = {10,11,12}
                ej4.union_conj(new_conj)

            if selection == 6:
                break

    def ejercicio5(self):

        infinite = 0
        ej5 = GestorMixto([1,2,3])

        while infinite == 0:

            selection = int(input(
                "\nEliger una opción:\n\t1.Agregar a la lista\n\t2.Agregar al diccionario\n\t3.Lista del diccionario\n\t4.Salir\n"))

            if selection < 1 or selection > 5:
                while selection < 1 or selection > 5:
                    selection = int(input("Introduce un número del 1 al 5: "))

            if selection == 1:
                num = int(input())
                ej5.add_to_the_list(num)

            if selection == 2:
                print("No")

            if selection == 3:
                print("No")

            if selection == 4:
                break