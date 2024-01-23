from logic import People, Department, Teacher, Subject, Institute, Course, Administration_Staff, Address

#-------------------Peoples-------------------
people1 = People.People("20343433C",
                        "Ana",
                        12,
                        "Femenino")

#-------------------Administration Staff-------------------
adm1 = Administration_Staff. Administration_Staff("Sandra",
                                                  "30278765L",
                                                  40,
                                                  "Femenino",
                                                  "Gestionar el calendario administrativo",
                                                  1500.45,
                                                  2012-4-2)

adm2 = Administration_Staff.Administration_Staff("Raúl",
                                                 "29750403K",
                                                 25,
                                                 "Masculino",
                                                 "Realizar gestiones asociadas a la compra y a la venta",
                                                 1500.0,
                                                 1997-4-22)




#-------------------Courses-------------------
course1 = Course.Course("Bachillerato",
                        "Primero",
                        "Bachillerato de ciencias",
                        1298)

course2 = Course.Course("ESO",
                        "Tercero",
                        "Educación Secundaria Obligatoria bilingüe(Inglés)",
                        3443)



#-------------------Departments-------------------
department1 = Department.Department(12345,
                                    "Departamento de Mates")

department2 = Department.Department(67890,
                                    "Departamento de Deportes")

#-------------------Subjects-------------------
subject1 = Subject.Subject("Mates",
                           109876,
                           "Perteneciente al departamento de mates",
                           300.0)

#-------------------Teachers-------------------
teacher1 = Teacher.Teacher("28960214T",
                           "Pedro",
                           29,
                           "Masculino",
                           2000.0,
                           2000-12-12,
                           subject1,
                           department1)

#-------------------Institutes-------------------

#Institutes's courses
list_institute1 = []

institute1 = Institute.Institute()

