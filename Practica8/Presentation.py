from Data import *
from logic.Grade import get_grades
def inicio():
    infinity = 0
    while infinity != 2:
        selection = int(input("Elige una opción:\n\n\t1. Registro\n\t2. Información\n\t3. Boletín de notas de Alumnos\n\t4. Salir\n"))

        if selection < 1 or selection > 4:
            while selection < 1 or selection > 4:
                selection = int(input("Introduce un número del 1 al 4: "))

        if selection == 1:
            selection2 = int(input("Elige la entidad a registrar.\n\n\t1. Dirección.\n\t2. Personal de Administración\n\t3. Curso\n\t4. Departamento\n\t5. Matrícula\n\t6. Nota\n\t7. Instituto\n\t8. Persona\n\t9. Estudiante\n\t10. Asignatura\n\t11. Profesor\n\n"))

            if selection2 < 1 or selection2 > 11:
                while selection2 < 1 or selection > 11:
                    selection = int(input("Introduce un número del 1 al 11: "))

            if selection2 == 1:
                Address_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 2:
                Adm_Staff_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 3:
                Course_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 4:
                Department_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 5:
                Enrollment_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 6:
                Grade_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 7:
                Institute_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 8:
                People_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 9:
                Student_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 10:
                Subject_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 11:
                Teacher_registration()
                next = input("\nPresione enter para continuar...")
                print("\n")

        if selection == 2:
            selection2 = int(input("¿Que quieres saber?\n\n\t1. Dirección.\n\t2. Personal de Administración\n\t3. Curso\n\t4. Departamento\n\t5. Matrícula\n\t6. Instituto\n\t7. Persona\n\t8. Estudiante\n\t9. Asignatura\n\t10. Profesor\n\n"))

            if selection2 < 1 or selection > 10:
                while selection < 1 or selection > 10:
                    selection = int(input("Introduce un número del 1 al 10: "))

            if selection2 == 1:
                get_information_address()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 2:
                get_information_Adm_Staff()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 3:
                get_information_Course()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 4:
                get_information_Department()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 5:
                get_information_Enrollmento()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 6:
                get_information_Institute()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 7:
                get_information_People()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 8:
                get_information_Student()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 9:
                get_information_Subject()
                next = input("\nPresione enter para continuar...")
                print("\n")
            if selection2 == 10:
                get_information_Teacher()
                next = input("\nPresione enter para continuar...")
                print("\n")

        if selection == 3:
            get_grades(list_grades=list_grades, list_student=list_student)
            next = input("\nPresione enter para continuar...")
            print("\n")

        if selection == 4:
            break