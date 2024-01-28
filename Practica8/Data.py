import sys
from datetime import date
from logic.Address import Address
from logic.People import People
from logic.Adm_Staff import Adm_Staff
from logic.Course import Course
from logic.Department import Department
from logic.Enrollment import Enrollment
from logic.Grade import Grade
from logic.Institute import Institute
from logic.Student import Student
from logic.Subject import Subject
from logic.Teacher import Teacher


#-------------------Peoples-------------------
people1 = People("20343433C",
                 "Ana",
                 12,
                 "Femenino")

list_People = [people1]

#-------------------Courses-------------------
course1 = Course("Primaria",
                 "Primero",
                 "Educación Primaria Obligatoria bilingüe(Inglés)",
                 1298)

course2 = Course("Primaria",
                 "Segundo",
                 "Educación Primaria Obligatoria bilingüe(Inglés)",
                 1299)

course3 = Course("Primaria",
                 "Tercero",
                 "Educación Primaria Obligatoria bilingüe(Inglés)",
                 1300)

course4 = Course("Primaria",
                 "Cuarto",
                 "Educación Primaria Obligatoria bilingüe(Frances)",
                 1301)

course5 = Course("Primaria",
                 "Quinto",
                 "Educación Primaria Obligatoria bilingüe(Frances)",
                 1302)

course6 = Course("Primaria",
                 "Sexto",
                 "Educación Primaria Obligatoria bilingüe(Frances)",
                 1303)

course7 = Course("ESO",
                 "Primero",
                 "Educación Secundaria Obligatoria bilingüe(Inglés)",
                 3443)

course8 = Course("ESO",
                 "Segundo",
                 "Educación Secundaria Obligatoria bilingüe(Inglés)",
                 3444)


list_course = [course1, course2, course3, course4, course5, course6, course7, course8]

#-------------------Departments-------------------
department1 = Department(12345,
                         "Departamento de Mates")

department2 = Department(67890,
                         "Departamento de Deportes")

department3 = Department(23483,
                         "Departamento de Historia")

department4 = Department(10577,
                         "Departamento de Lengua")

list_department = [department1, department2, department3, department4]

#-------------------Subjects-------------------
subject1 = Subject("Mates",
                   109876,
                   "Perteneciente al departamento de Mates",
                   300.0)

subject2 = Subject("Historia",
                   263008,
                   "Perteneciente al departamento de Hitoria",
                   150.0)

subject3 = Subject("Educación Física",
                   333302,
                   "Perteneciente al departamento de Deportes",
                   50.0)

subject4 = Subject("Lengua",
                   204891,
                   "Perteneciente al departamento de Lengua",
                   300.0)

subject5 = Subject("Estadstica",
                   109899,
                   "Perteneciente al departamento de Mates",
                   200.0)

list_subject = [subject1, subject2, subject3, subject4, subject5]

#-------------------Address-------------------"""

address1_student = Address("La soledad",
                           2,
                           41019,
                           "Sevilla",
                           "Sevilla")

address2_student = Address("Aeronáutica",
                           19,
                           41009,
                           "Sevilla",
                           "Sevilla")

address3_student = Address("Flores de la paz",
                           3,
                           41019,
                           "Sevilla",
                           "Sevilla")

list_address_student = [address1_student, address2_student, address3_student]

address1_institute = Address("De las ciencias",
                             1,
                             41020,
                             "Sevilla",
                             "Sevilla")

address2_institute = Address("Ramar Santo",
                             60,
                             41120,
                             "Sevilla",
                             "Sevilla")

address3_institute = Address("Macarena",
                             14,
                             41002,
                             "Sevilla",
                             "Sevilla")


list_address_institute = [address1_institute, address2_institute, address3_institute]

address1_teacher = Address("Perez Marquez",
                           55,
                           41022,
                           "Sevilla",
                           "Sevilla")

address2_teacher = Address("Aserradero",
                           74,
                           41302,
                           "Sevilla",
                           "Sevilla")

address3_teacher = Address("Perro Rojo",
                           5,
                           41072,
                           "Sevilla",
                           "Sevilla")

list_address_teacher = [address1_teacher, address2_teacher, address3_teacher]

address1_adm = Address("Vidal Montañez",
                           90,
                           41202,
                           "Sevilla",
                           "Sevilla")

address2_adm = Address("Persan",
                           74,
                           41002,
                           "Sevilla",
                           "Sevilla")

address3_adm = Address("Funte del Valle",
                           27,
                           41066,
                           "Sevilla",
                           "Sevilla")

list_address_adm = [address1_adm, address2_adm, address3_adm]

#-------------------Institutes-------------------

institute1 = Institute("I.E.S. San Marcos",
                       "T382293Y",
                       address1_institute,
                       course1)

institute2 = Institute("I.E.S. Las delicias",
                       "P775323R",
                       address2_institute,
                       course2)

institute3 = Institute("I.E.S. Ciudad María",
                       "A436767D",
                       address3_institute,
                       course1)

list_institute = [institute1, institute2, institute3]

#-------------------Students-------------------

student1 = Student("28475942D",
                   "Mario",
                   15,
                   "Masculino",
                   course8,
                   list_subject,
                   "marioperez@gmail.com",
                   address1_student)

student2 = Student("30024637J",
                   "Carmen",
                   10,
                   "Femenino",
                   course4,
                   list_subject,
                   "carmenlopez@gmail.com",
                   address2_student)

student3 = Student("28475942D",
                   "Luís",
                   12,
                   "Masculino",
                   course7,
                   list_subject,
                   "luismartin@gmail.com",
                   address3_student)

list_student = [student1, student2, student3]

#-------------------Administration Staff-------------------
adm1 = Adm_Staff("Sandra",
                 "30278765L",
                 40,
                 "Femenino",
                 "Gestionar el calendario administrativo",
                 1500.45,
                 date(2000, 2, 3),
                 address1_adm)

adm2 = Adm_Staff("Raúl",
                 "29750403K",
                 25,
                 "Masculino",
                 "Realizar gestiones asociadas a la compra y a la venta",
                 1500.0,
                 date(1997, 4, 22),
                 address2_adm)

list_adm = [adm1, adm2]

#-------------------Grades-------------------

#Student1
grade_student1_subject1 = Grade(subject1, student1, 8)
grade_student1_subject2 = Grade(subject2, student1, 7)
grade_student1_subject3 = Grade(subject3, student1, 9)
grade_student1_subject4 = Grade(subject4, student1, 7)
grade_student1_subject5 = Grade(subject5, student1, 8)

#Student2
grade_student2_subject1 = Grade(subject1, student2, 5)
grade_student2_subject2 = Grade(subject2, student2, 6)
grade_student2_subject3 = Grade(subject3, student2, 6)
grade_student2_subject4 = Grade(subject4, student2, 7)
grade_student2_subject5 = Grade(subject5, student2, 5)

#Student3
grade_student3_subject1 = Grade(subject1, student3, 10)
grade_student3_subject2 = Grade(subject2, student3, 8)
grade_student3_subject3 = Grade(subject3, student3, 9)
grade_student3_subject4 = Grade(subject4, student3, 7)
grade_student3_subject5 = Grade(subject5, student3, 8)

#List of students subjects

list_student1 = [grade_student1_subject1, grade_student1_subject2, grade_student1_subject3, grade_student1_subject4, grade_student1_subject5]

list_student2 = [grade_student2_subject1, grade_student2_subject2, grade_student2_subject3, grade_student2_subject4, grade_student2_subject5]

list_student3 = [grade_student3_subject1, grade_student3_subject2, grade_student3_subject3, grade_student3_subject4, grade_student3_subject5]

list_grades = [list_student1, list_student2, list_student3]

#-------------------Enrollments-------------------

enrollment1 = Enrollment(student1,
                         list_subject,
                         course8)

enrollment2 = Enrollment(student2,
                         list_subject,
                         course4)

enrollment3 = Enrollment(student3,
                         list_subject,
                         course7)

list_enrollment = [enrollment1, enrollment2, enrollment3]

#-------------------Teachers-------------------
teacher1 = Teacher("28960214T",
                   "Pedro",
                   29,
                   "Masculino",
                   2000.0,
                   date(2020, 12, 12),
                   subject1,
                   department1,
                   address1_teacher)

teacher2 = Teacher("30909027H",
                   "Maria",
                   28,
                   "Femenino",
                   1800.0,
                   date(2015, 11, 9),
                   subject5,
                   department1,
                   address2_teacher)

teacher3 = Teacher("28664302",
                   "Sergio",
                   46,
                   "Masculino",
                   1900.8,
                   date(2000, 5, 18),
                   subject2,
                   department3,
                   address3_teacher)

list_teacher = [teacher1, teacher2, teacher3]

def Address_registration():
    street = str(input("Introduce la calle de la dirección: "))
    number = int(input("Introduce el número de la calle: "))
    postal_code = int(input("Introduce el código portal de la dirección: "))
    location = str(input("Introduce la localidad de la dirección: "))
    province = str(input("Introduce la provincia de la dirección: "))

    new_address = Address(street, number, postal_code, location, province)

    selection = int(input("\n¿Que tipo de dirección es?\n\n\t1. Dirección de profesor\n\t2. Dirección de instituto\n\t3. Dirección de estudiante\n\t4. Dirección del personal de administración\n"))

    if selection == 1:
        list_address_teacher.append(new_address)
        print("¡Dirección creada!\n")

    if selection == 2:
        list_address_institute.append(new_address)
        print("¡Dirección creada!\n")

    if selection == 3:
        list_address_student.append(new_address)
        print("¡Dirección creada!\n")

    if selection == 4:
        list_address_adm.append(new_address)
        print("¡Dirección creada!\n")

def Adm_Staff_registration():

    name = str(input("Introduce el nombre de la nueva incorporación de Administración: "))
    dni = str(input("Introduce el dni de la nueva incorporación de Administración: "))
    age = int(input("Introduce los años de la nueva incorporación de Administración: "))
    sex = str(input("Introduce el sexo de la nueva incorporación de Administración: "))
    functions = str(input("Introduce la función de la nueva incorporación de Administración: "))
    salary = float(input("Introduce el salario de la nueva incorporación de Administración(formato=0.0): "))
    print("Introduce la fecha de inicio de labor.")
    year = int(input("Año: "))
    mounth = int(input(" Mes(escribe el mes por su número): "))
    day = int(input("Día: "))

    print("Introduce la dirección de la nueva incorporación de Administración(recuerda que si no aparece es por que hay que crear primero la dirección asociada)")
    for i in range(len(list_address_adm)):
        print("\t" + str(i + 1) + ". " + list_adm[i].get_address().get_street())
    selection = int(input())

    new_adm_staff = Adm_Staff(name, dni, age, sex, functions, salary, date(year, mounth, day), list_address_adm[selection-1])

    list_adm.append(new_adm_staff)
    print("\n¡Nueva incorporación creada!\n")

def Course_registration():
    print("¿En que vas a cursar?\nCursos existetes:")
    for i in range(len(list_course)):
        print("\t-"+list_course[i].get_type()+"-"+list_course[i].get_level())

    type = str(input("\n"))
    level = str(input("Introduce el nivel de estudio. Por ejemplo: primero, segundo, tercero,...: "))
    description = str(input("Introduce una descripción: "))
    code = int(input("Introduce su código: "))

    new_course = Course(type, level, description, code)

    list_course.append(new_course)
    print("¡Curso creado!\n")
def Department_registration():
    identifier = int(input("Introduce el identificador del departamento: "))
    name = str(input("Introduce el nombre del departamento: "))

    new_department = Department(identifier, name)

    list_department.append(new_department)
    print("¡Departamento creado!\n")

def Enrollment_registration():
    print("Elige el alumno asociado a esta matrícula:")
    for i in range(len(list_student)):
        print("\t"+str(i+1)+". "+list_student[i].get_name())
    selection = int(input())

    print("Elige la asignatura asociada a esta matrícula:")
    for i in range(len(list_subject)):
        print(list_subject[i].get_name())
    selection2 = int(input())

    print("Elige el curso asocido a esta matricula:")
    for i in range(len(list_course)):
        print(list_course[i].get_type()+"-"+list_course[i].get_level())
    selection3 = int(input())

    new_enrollment = Enrollment(list_student[selection-1], list_subject[selection2-1], list_course[selection3-1])

    list_enrollment.append(new_enrollment)
    print("¡Matrícula creada!\n")

def Grade_registration():

    print("Elige el alumno asociado a esta nota:")
    for i in range(len(list_student)):
        print("\t" + str(i + 1) + ". " + list_student[i].get_name())

    selection = int(input())
    list_new_grades = []

    print("Indica la nota de cada una de las asignaturas.")

    for i in range(len(list_subject)):
       grades = int(input(list_subject[i].get_name()+": "))
       new_grade = Grade(list_subject[i], list_student[selection - 1], grades)
       list_new_grades.append(new_grade)

    list_grades.append(list_new_grades)
    print("¡Nota creada!\n")

def Institute_registration():
    name = str(input("Introduce el nombre del instituto: "))
    cif = str(input("Introduce el cif del intituto: "))
    print("Indica la dirección del intituto.(Si la dirección no aparece recuerda que tienes que crearla antes de crear el intituto.)")
    for i in range(len(list_address_institute)):
        print("\t"+str(i+1)+". "+list_address_institute[i].get_street())
    selection = int(input())

    print("Indica el curso del intituto.(Si el cursi no aparece recuerda que tienes que crearlo antes de crear el intituto.)")
    for i in range(len(list_course)):
        print("\t" + str(i + 1) + ". " + list_course[i].get_type()+"-"+list_course[i].get_level())
    selection2 = int(input())

    new_institute = Institute(name, cif, list_address_institute[selection-1], list_course[selection2-1])

    list_institute.append(new_institute)
    print("¡Instituto creado!\n")

def People_registration():
    dni = str(input("Introduce el dni de la persona: "))
    name = str(input("Introduce el nomebre de la persona: "))
    age = int(input("Introduce la edad de la persona: "))
    sex = str(input("Introduce el sexo de la persona: "))

    new_people = People(dni, name, age, sex)

    list_People.append(new_people)
    print("¡Persona crada!\n")

def Student_registration():
    dni = str(input("Introduce el dni de la persona: "))
    name = str(input("Introduce el nomebre de la persona: "))
    age = int(input("Introduce la edad de la persona: "))
    sex = str(input("Introduce el sexo de la persona: "))
    print("Indica el cuerso del alumno:")
    for i in range(len(list_course)):
        print("\t" + str(i + 1) + ". " + list_course[i].get_type()+"-"+list_course[i].get_level())
    selection = int(input())
    email = str(input("Introduce el email del alumno: "))

    print("Introduce la dirección del alumno(recuerda que si no aparece es por que hay que crear primero la dirección asociada)")
    for i in range(len(list_address_student)):
        print("\t"+str(i+1)+". "+list_student[i].get_address().get_street())
    selection2 = int(input())

    new_student = Student(dni, name, age, sex, list_course[selection-1], list_subject, email, list_address_student[selection2-1])

    list_student.append(new_student)
    print("¡Alumno creado!\n")

def Subject_registration():
    name = str(input("Introduce el nombre de la asignatura: "))
    identifier = int(input("Introduce el identificador de la asignatura: "))
    description = str(input("Introduce una descripción para la asignatura: "))
    credits = float(input("Introduce los creditos de las asignaturas(formato de los creditos: 0,0)"))

    new_subject = Subject(name, identifier, description, credits)

    list_subject.append(new_subject)
    print("¡Asignatura creada!\n")

def Teacher_registration():
    dni = str(input("Introduce el dni de la persona: "))
    name = str(input("Introduce el nombre de la persona: "))
    age = int(input("Introduce la edad de la persona: "))
    sex = str(input("Introduce el sexo de la persona: "))
    salary = float(input("Introduce el salario del profesor(formato: 0,0): "))

    print("Introduce la fecha de inicio de labor.")
    year = int(input("Año: "))
    mounth = int(input(" Mes(escribe el mes por su número): "))
    day = int(input("Día: "))

    print("Elige la asignatura que imparte el profesor:")
    for i in range(len(list_subject)):
        print("\t" + str(i + 1) + ". " + list_subject[i].get_name())
    selection = int(input())

    print("Introduce el departamente al que pertenece el profesor:")
    for i in range(len(list_department)):
        print("\t" + str(i + 1) + ". " + list_department[i].get_name())
    selection2 = int(input())

    print("Introduce la dirección del profesor(recuerda que si no aparece es por que hay que crear primero la dirección asociada)")
    for i in range(len(list_address_teacher)):
        print("\t"+str(i+1) + ". " + list_address_teacher[i].get_street())
    selection3 = int(input())

    new_teacher = Teacher(dni, name, age, sex, salary, date(year, mounth, day), list_subject[selection-1], list_department[selection2-1],list_address_teacher[selection3-1])

    list_teacher.append(new_teacher)
    print("¡Profesor creado!\n")

def get_information_address():
    print("Elige el tipo de dirección\n\t1. Dirección de profesor\n\t2. Dirección de instituto\n\t3. Dirección de estudiante\n\t4. Dirección del personal de administración\n")

    selection = int(input())

    if selection<1 or selection>4:
        while selection<1 or selection>4:
            selection = int(input("Introduce un número del 1 al 4: "))

    if selection == 1:
        print("-------------------\nDirecciones de profesores\n-------------------")
        for i in range(len(list_address_teacher)):
            print("···Dirección " + str(i+1)+"\nCalle: " + list_address_teacher[i].get_street() +
                  "\nNúmero: " + str(list_address_teacher[i].get_number()) +
                  "\nLocalidad: " + list_address_teacher[i].get_location() +
                  "\nProvincia: " + list_address_teacher[i].get_province() +
                  "\nCódigo postal: " + str(list_address_teacher[i].get_postal_code()) + "\n")

    if selection == 2:
        print("-------------------\nDirecciones de instituto\n-------------------")
        for i in range(len(list_address_institute)):
            print("···Dirección " + str(i + 1) + "\nCalle: " + list_address_institute[i].get_street() +
                  "\nNúmero: " + str(list_address_institute[i].get_number()) +
                  "\nLocalidad: " + list_address_institute[i].get_location() +
                  "\nProvincia: " + list_address_institute[i].get_province() +
                  "\nCódigo postal: " + str(list_address_institute[i].get_postal_code()) + "\n")

    if selection == 3:
        print("-------------------\nDirecciones de estudiante\n-------------------")
        for i in range(len(list_address_student)):
            print("···Dirección " + str(i + 1) + "\nCalle: " + list_address_student[i].get_street() +
                  "\nNúmero: " + str(list_address_student[i].get_number()) +
                  "\nLocalidad: " + list_address_student[i].get_location() +
                  "\nProvincia: " + list_address_student[i].get_province() +
                  "\nCódigo postal: " + str(list_address_student[i].get_postal_code()) + "\n")

    if selection == 4:
        print("-------------------\nDirecciones del personal de administración\n-------------------")
        for i in range(len(list_address_adm)):
            print("···Dirección " + str(i + 1) + "\nCalle: " + list_address_adm[i].get_street() +
                  "\nNúmero: " + str(list_address_adm[i].get_number()) +
                  "\nLocalidad: " + list_address_adm[i].get_location() +
                  "\nProvincia: " + list_address_adm[i].get_province() +
                  "\nCódigo postal: " + str(list_address_adm[i].get_postal_code()) + "\n")

def get_information_Adm_Staff():
    for i in range(len(list_adm)):
        print("···Personal de Administración " + str(i+1) +
              "\nNombre: " + list_adm[i].get_name() +
              "\nDNI: " + list_adm[i].get_dni() +
              "\nAños: " + str(list_adm[i].get_age()) +
              "\nSexo: " + list_adm[i].get_sex() +
              "\nFunciones: " + list_adm[i].get_functions() +
              "\nSalario: " + str(list_adm[i].get_salary()) + "€" +
              "\nFecha de inicio: " + str(list_adm[i].get_start_date()) +
              "\nSalario neto: " + str(list_adm[i].get_Net_Income()) +
              "\nAntigüedad: " + str(list_adm[i].get_antiquity()) + " años\n")

def get_information_Course():
    for i in range(len(list_course)):
        print("···Curso " + str(i+1) +
              "\nTipo: " + list_course[i].get_type() +
              "\nNivel: " + list_course[i].get_level() +
              "\nDescripción: " + list_course[i].get_description() +
              "\nCódigo: " + str(list_course[i].get_code()) + "\n")

def get_information_Department():
    for i in range(len(list_department)):
        print("···Departamento " + str(i+1) +
              "\nNombre: " + list_department[i].get_name() +
              "\nIdentificador: " + str(list_department[i].get_identifier()) + "\n")

def get_information_Enrollmento():
    for i in range(len(list_enrollment)):
        print("···Matricula " + str(i+1) +
              "\nNombre del alumno: " + list_enrollment[i].get_student().get_name() +
              "\nCurso: " + list_enrollment[i].get_course().get_type() + "-" + list_enrollment[i].get_course().get_level())

        sys.stdout.write("Asignaturas: ")
        for i in range(len(list_subject)):
            sys.stdout.write(list_subject[i].get_name() + " ,")
        print("\n")

def get_information_Institute():
    for i in range(len(list_institute)):
        print("···Instituto " + str(i+1) +
              "\nNombre: " + list_institute[i].get_name() +
              "\nCIF: " + list_institute[i].get_cif() +
              "\nDirección: " + list_institute[i].get_address().get_street() +
              "\nCursos: " + list_institute[i].get_courses().get_type() + "-" + list_institute[i].get_courses().get_level() + "\n")

def get_information_People():
    for i in range(len(list_People)):
        print("···Persona " + str(i+1) +
              "\nDNI: " + list_People[i].get_dni() +
              "\nNombre: " + list_People[i].get_name() +
              "\nAños: " + str(list_People[i].get_age()) +
              "\nSexo: " + list_People[i].get_sex() + "\n")

def get_information_Student():
    for i in range(len(list_student)):
        print("···Alumno " + str(i+1) +
              "\nDNI: " + list_student[i].get_dni() +
              "\nNombre: " + list_student[i].get_name() +
              "\nAños: " + str(list_student[i].get_age()) +
              "\nSexo: " + list_student[i].get_sex() +
              "\nCurso: " + list_student[i].get_course().get_type() + "-" + list_student[i].get_course().get_level() +
              "\nEmail: " + list_student[i].get_email() +
              "\nDirección: " + list_student[i].get_address().get_street())

        sys.stdout.write("Asignaturas: ")
        for i in range(len(list_subject)):
            sys.stdout.write(list_subject[i].get_name() + " ,")
        print("\n")

def get_information_Subject():
    for i in range(len(list_subject)):
        print("···Asignatura " + str(i+1) +
              "\nNombre: " + list_subject[i].get_name() +
              "\nIdentificador: " + str(list_subject[i].get_identifier()) +
              "\nDescripción: " + list_subject[i].get_description() +
              "\nCréditos: " + str(list_subject[i].get_credits()) + "\n")

def get_information_Teacher():
    for i in range(len(list_teacher)):
        print("···Profesor " + str(i+1) +
              "\nDNI: " + list_teacher[i].get_dni() +
              "\nNombre: " + list_teacher[i].get_name() +
              "\nAños: " + str(list_teacher[i].get_age()) +
              "\nSexo: " + list_teacher[i].get_sex() +
              "\nSalario: " + str(list_teacher[i].get_salary()) + "€" +
              "\nFecha de inicio: " + str(list_teacher[i].get_start_date()) +
              "\nAsignatura: " + list_teacher[i].get_subjects().get_name() +
              "\nSalario neto: " + str(list_teacher[i].get_Net_Income()) +
              "\nDirección: " + list_teacher[i].get_address().get_street() +
              "\nAntigüedad: " + str(list_teacher[i].get_antiquity()) + " años\n")

