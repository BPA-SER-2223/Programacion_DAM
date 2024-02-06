from logic.GestorListas import GestorListas
class Data:
    def ejercicio1(self):

        ej1 = GestorListas([1,2,3])

        selection = int(input("Eliger una opción:\n\t1.Agregar a la lista\n\t2.Actualizar lista\n\t3.Eliminar algo de la lista\n\t4.Mostrar lista\n\t5.Salir\n"))

        if selection < 0 or selection > 5:
            while selection <0 or selection > 5:
                selection = int(input("Introduce un número del 1 al 5: "))

        if selection == 1:
            num = int(input())
            ej1.add_to_the_list(num)

        if selection == 2:
            for i in range(len(ej1.get_list())):
                print(str(i + 1) + ". " + str(ej1.get_list()[i]))

            position = int(input("Elige que número quieres reemplazar: "))
            num = int(input("Introduce el nuevo numero: "))
            ej1.update_the_list(position-1, num)

        if selection == 3:
            position = int(input("Elige la posición del número quieres reemplazar: "))
            ej1.eliminate_something_of_the_list(position)