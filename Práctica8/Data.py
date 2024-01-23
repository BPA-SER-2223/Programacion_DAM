from logic import People, Department, Teacher, Subject, Institute, Course, Administration_Staff, Student,Address, Enrollment, Grade

#-------------------Peoples-------------------
people1 = People.People("20343433C",
                        "Ana",
                        12,
                        "Femenino")

list_People = [people1]

#-------------------Administration Staff-------------------
adm1 = Administration_Staff. Administration_Staff("Sandra",
                                                  "30278765L",
                                                  40,
                                                  "Femenino",
                                                  "Gestionar el calendario administrativo",
                                                  1500.45,
                                                  2012-1-2)

adm2 = Administration_Staff.Administration_Staff("Raúl",
                                                 "29750403K",
                                                 25,
                                                 "Masculino",
                                                 "Realizar gestiones asociadas a la compra y a la venta",
                                                 1500.0,
                                                 1997-4-22)

list_adm = [adm1, adm2]

#-------------------Courses-------------------
course1 = Course.Course("Primaria",
                        "Primero",
                        "Educación Primaria Obligatoria bilingüe(Inglés)",
                        1298)

course2 = Course.Course("Primaria",
                        "Segundo",
                        "Educación Primaria Obligatoria bilingüe(Inglés)",
                        1299)

course3 = Course.Course("Primaria",
                        "Tercero",
                        "Educación Primaria Obligatoria bilingüe(Inglés)",
                        1300)

course4 = Course.Course("Primaria",
                        "Cuarto",
                        "Educación Primaria Obligatoria bilingüe(Frances)",
                        1301)

course5 = Course.Course("Primaria",
                        "Quinto",
                        "Educación Primaria Obligatoria bilingüe(Frances)",
                        1302)

course6 = Course.Course("Primaria",
                        "Sexto",
                        "Educación Primaria Obligatoria bilingüe(Frances)",
                        1303)

course7 = Course.Course("ESO",
                        "Primero",
                        "Educación Secundaria Obligatoria bilingüe(Inglés)",
                        3443)

course8 = Course.Course("ESO",
                        "Segundo",
                        "Educación Secundaria Obligatoria bilingüe(Inglés)",
                        3444)

course9 = Course.Course("ESO",
                        "Tercero",
                        "Educación Secundaria Obligatoria bilingüe(Frances)",
                        3445)

course10 = Course.Course("ESO",
                        "Cuarto",
                        "Educación Secundaria Obligatoria bilingüe(Frances)",
                        3447)

course11 = Course.Course("Bachillerato",
                        "Primero",
                        "Bachillerato de ciencias",
                        6030)

course12 = Course.Course("Bachillerato",
                        "Primero",
                        "Bachillerato de humanidades",
                        6031)

list_course = [course1, course2, course3, course4, course5, course6, course7, course8, course9, course10, course11, course12]

#-------------------Departments-------------------
department1 = Department.Department(12345,
                                    "Departamento de Mates")

department2 = Department.Department(67890,
                                    "Departamento de Deportes")

department3 = Department.Department(23483,
                                    "Departamento de Historia")

department4 = Department.Department(10577,
                                    "Departamento de Lengua")

list_departament = [department1, department2, department3, department4]

#-------------------Subjects-------------------
subject1 = Subject.Subject("Mates",
                           109876,
                           "Perteneciente al departamento de Mates",
                           300.0)

subject2 = Subject.Subject("Historia",
                           263008,
                           "Perteneciente al departamento de Hitoria",
                           150.0)

subject3 = Subject.Subject("Educación Física",
                           333302,
                           "Perteneciente al departamento de Deportes",
                           50.0)

subject4 = Subject.Subject("Lengua",
                           204891,
                           "Perteneciente al departamento de Lengua",
                           300.0)

subject5 = Subject.Subject("Estadstica",
                           109899,
                           "Perteneciente al departamento de Mates",
                           200.0)

list_subject = [subject1, subject2, subject3, subject4, subject5]

#-------------------Teachers-------------------
teacher1 = Teacher.Teacher("28960214T",
                           "Pedro",
                           29,
                           "Masculino",
                           2000.0,
                           2020-12-12,
                           subject1,
                           department1)

teacher2 = Teacher.Teacher("30909027H",
                           "Maria",
                           28,
                           "Femenino",
                           1800.0,
                           2015-11-9,
                           subject5,
                           department1)

teacher3 = Teacher.Teacher("28664302",
                           "Sergio",
                           46,
                           "Masculino",
                           1900.8,
                           2000-5-18,
                           subject2,
                           department3)

list_teacher = [teacher1, teacher2, teacher3]

#-------------------Address-------------------

address1 = Address.Address("La soledad",
                           2,
                           41019,
                           "Sevilla",
                           "Sevilla")

address2 = Address.Address("Aeronáutica",
                           19,
                           41009,
                           "Sevilla",
                           "Sevilla")

address3 = Address.Address("Flores de la paz",
                           3,
                           41019,
                           "Sevilla",
                           "Sevilla")

list_address = [address1, address2, address3]

#-------------------Institutes-------------------

#Institutes's courses
list_courses_institute1 = [subject1, subject2]

list_courses_institute2 = [subject1, subject2, subject3]

list_courses_institute3 = [subject2, subject4]

list_list_courses_institute = [list_courses_institute1, list_courses_institute2, list_courses_institute3]

#Institutes

institute1 = Institute.Institute("I.E.S. San Marcos",
                                 "T382293Y",
                                 address1,
                                 course1)

institute2 = Institute.Institute("I.E.S. Las delicias",
                                 "P775323R",
                                 address2,
                                 course2)

institute3 = Institute.Institute("I.E.S. Ciudad María",
                                 "A436767D",
                                 address3,
                                 course1)

list_institute = [institute1, institute2, institute3]

#-------------------Students-------------------

student1 = Student.Student("28475942D",
                           "Mario",
                           15,
                           "Masculino",
                           course9,
                           list_courses_institute2,
                           "marioperez@gmail.com")

student2 = Student.Student("30024637J",
                           "Carmen",
                           17,
                           "Femenino",
                           course12,
                           list_courses_institute1,
                           "carmenlopez@gmail.com")

student3 = Student.Student("28475942D",
                           "Luís",
                           16,
                           "Masculino",
                           course10,
                           list_courses_institute1,
                           "luismartin@gmail.com")

list_student = [student1, student2, student3]

#-------------------Enrollments-------------------

enrollment1 = Enrollment.Enrollment(student1,
                                    list_courses_institute2,
                                    course9)

enrollment2 = Enrollment.Enrollment(student2,
                                    list_courses_institute1,
                                    course12)

enrollment3 = Enrollment.Enrollment(student3,
                                    list_courses_institute1,
                                    course10)

list_enrollment = [enrollment1, enrollment2, enrollment3]

#-------------------Grades-------------------

grade_student1_subject1 = Grade.Grade(subject1,
                                      student1,
                                      8)

grade_student1_subject2 = Grade.Grade(subject2,
                                      student1,
                                      7)

grade_student1_subject3 = Grade.Grade(subject3,
                                      student1,
                                      9)

grade_student2_subject1 = Grade.Grade(subject1,
                                      student2,
                                      5)

grade_student2_subject2 = Grade.Grade(subject2,
                                      student2,
                                      6)

grade_student3_subject2 = Grade.Grade(subject1,
                                      student3,
                                      8)

grade_student3_subject4 = Grade.Grade(subject2,
                                      student3,
                                      7)

list_grade = [grade_student1_subject1, grade_student1_subject2, grade_student1_subject3, grade_student2_subject1, grade_student2_subject2, grade_student3_subject2, grade_student3_subject4]