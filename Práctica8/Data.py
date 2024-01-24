from datetime import datetime
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

#-------------------Administration Staff-------------------
adm1 = Adm_Staff("Sandra",
                 "30278765L",
                 40,
                 "Femenino",
                 "Gestionar el calendario administrativo",
                 1500.45,
                 datetime(2000, 2, 3))

adm2 = Adm_Staff("Raúl",
                 "29750403K",
                 25,
                 "Masculino",
                 "Realizar gestiones asociadas a la compra y a la venta",
                 1500.0,
                 datetime(1997, 4, 22))

list_adm = [adm1, adm2]

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

course9 = Course("ESO",
                 "Tercero",
                 "Educación Secundaria Obligatoria bilingüe(Frances)",
                 3445)

course10 = Course("ESO",
                  "Cuarto",
                  "Educación Secundaria Obligatoria bilingüe(Frances)",
                  3447)

course11 = Course("Bachillerato",
                  "Primero",
                  "Bachillerato de ciencias",
                  6030)

course12 = Course("Bachillerato",
                  "Primero",
                  "Bachillerato de humanidades",
                  6031)

list_course = [course1, course2, course3, course4, course5, course6, course7, course8, course9, course10, course11, course12]

#-------------------Departments-------------------
department1 = Department(12345,
                         "Departamento de Mates")

department2 = Department(67890,
                         "Departamento de Deportes")

department3 = Department(23483,
                         "Departamento de Historia")

department4 = Department(10577,
                         "Departamento de Lengua")

list_departament = [department1, department2, department3, department4]

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

#-------------------Teachers-------------------
teacher1 = Teacher("28960214T",
                   "Pedro",
                   29,
                   "Masculino",
                   2000.0,
                   datetime(2020,12,12),
                   subject1,
                   department1)

teacher2 = Teacher("30909027H",
                   "Maria",
                   28,
                   "Femenino",
                   1800.0,
                   datetime(2015,11,9),
                   subject5,
                   department1)

teacher3 = Teacher("28664302",
                   "Sergio",
                   46,
                   "Masculino",
                   1900.8,
                   datetime(2000,5,18),
                   subject2,
                   department3)

list_teacher = [teacher1, teacher2, teacher3]

#-------------------Address-------------------"""

address1 = Address("La soledad",
                   2,
                   41019,
                   "Sevilla",
                   "Sevilla")

address2 = Address("Aeronáutica",
                   19,
                   41009,
                   "Sevilla",
                   "Sevilla")

address3 = Address("Flores de la paz",
                   3,
                   41019,
                   "Sevilla",
                   "Sevilla")

list_address = [address1, address2, address3]

print(adm1.get_salary())

#-------------------Institutes-------------------

#Institutes's courses
list_courses_institute1 = [subject1, subject2]

list_courses_institute2 = [subject1, subject2, subject3]

list_courses_institute3 = [subject2, subject4]

list_list_courses_institute = [list_courses_institute1, list_courses_institute2, list_courses_institute3]

#Institutes

institute1 = Institute("I.E.S. San Marcos",
                       "T382293Y",
                       address1,
                       course1)

institute2 = Institute("I.E.S. Las delicias",
                       "P775323R",
                       address2,
                       course2)

institute3 = Institute("I.E.S. Ciudad María",
                       "A436767D",
                       address3,
                       course1)

list_institute = [institute1, institute2, institute3]

#-------------------Students-------------------

student1 = Student("28475942D",
                   "Mario",
                   15,
                   "Masculino",
                   course9,
                   list_courses_institute2,
                   "marioperez@gmail.com")

student2 = Student("30024637J",
                   "Carmen",
                   17,
                   "Femenino",
                   course12,
                   list_courses_institute1,
                   "carmenlopez@gmail.com")

student3 = Student("28475942D",
                   "Luís",
                   16,
                   "Masculino",
                   course10,
                   list_courses_institute1,
                   "luismartin@gmail.com")

list_student = [student1, student2, student3]

#-------------------Grades-------------------

grade_student1_subject1 = Grade(subject1,
                                student1,
                                8)

grade_student1_subject2 = Grade(subject2,
                                student1,
                                7)

grade_student1_subject3 = Grade(subject3,
                                student1,
                                9)

grade_student2_subject1 = Grade(subject1,
                                student2,
                                5)

grade_student2_subject2 = Grade(subject2,
                                student2,
                                6)

grade_student3_subject2 = Grade(subject1,
                                student3,
                                8)

grade_student3_subject4 = Grade(subject2,
                                student3,
                                7)

#List of students subjects

list_student1 = [grade_student1_subject1, grade_student1_subject2, grade_student1_subject3]

list_student2 = [grade_student2_subject1, grade_student2_subject2]

list_student3 = [grade_student3_subject2, grade_student3_subject4]

list_grades = [list_student1, list_student2, list_student3]

#-------------------Enrollments-------------------

enrollment1 = Enrollment(student1,
                         list_courses_institute2,
                         course9)

enrollment2 = Enrollment(student2,
                         list_courses_institute1,
                         course12)

enrollment3 = Enrollment(student3,
                         list_courses_institute1,
                         course10)

list_enrollment = [enrollment1, enrollment2, enrollment3]

def get_grades():
    print("¿De que alumno quieres saber sus notas?")
    for i in range(len(list_grades)):
        print(str(i+1)+". "+list_grades[i][0].get_student().get_name())

    selection = int(input("\n"))

    for i in range(len(list_grades[selection-1])):
        print(list_grades[selection-1][i].get_subject().get_name()+": "+str(list_grades[selection-1][i].get_grade()))


