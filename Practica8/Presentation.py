from Data import *
from logic.Grade import get_grades
def inicio():
    infinity = 0
    while infinity != 2:
        selection = int(input("Elige una opción:\n\n\t1. Registro\n\t2. Información\n\t3. Boletín de notas de Alumnos\n\t4. Salir\n"))

        if selection == 1:
            selection2 = int(input("Elige la entidad a registrar.\n\n\t1. Dirección.\n\t2. Personal de Administración\n\t3. Curso\n\t4. Departamento\n\t5. Matrícula\n\t6. Nota\n\t7. Instituto\n\t8. Persona\n\t9. Estudiante\n\t10. Asignatura\n\t11. Profesor\n\n"))
            if selection2 == 1:
                Address_registration()
            if selection2 == 2:
                Adm_Staff_registration()
            if selection2 == 3:


        if selection == 2:
            selection2 = int(input("¿Que quieres saber?\n\n\t1. Dirección.\n\t2. Personal de Administración\n\t3. Curso\n\t4. Departamento\n\t5. Matrícula\n\t6. Nota\n\t7. Instituto\n\t8. Persona\n\t9. Estudiante\n\t10. Asignatura\n\t11. Profesor\n\n"))

        if selection == 3:
            get_grades(list_grades=list_grades)
            next = input("\nPresione enter para continuar...")
            print("\n")

        #get_grades(list_grades=list_grades)