from logic.Subject import Subject
from logic.Student import Student
class Grade():
    def __init__(self, subject: Subject, student: Student, grade: int):
        self.__subject = subject
        self.__student = student
        self.__grade = grade

    def get_subject(self) -> Subject:
        return self.__subject

    def set_subject(self, subject):
        self.__subject = subject

    def get_student(self) -> Student:
        return self.__student

    def set_student(self, student):
        self.__student = student

    def get_grade(self) -> int:
        return self.__grade

    def set_grade(self, grade):
        self.__grade = grade

def get_grades(list_grades, list_student):#No puedo importar la lista de notas directamente aqui, por lo tanto lo importo en el archivo donde voy a ejecutar el método y almaceno en una variable inicializada en el parentesis de llamada
    print("¿De que alumno quieres saber sus notas?")
    for i in range(len(list_grades)):
        print(str(i + 1) + ". " + list_grades[i][0].get_student().get_name())
    selection = int(input("\n"))

    if selection<1 or selection>len(list_student):
        while selection<1 or selection>len(list_student):
            selection = int(input("Introduce un número del 1 al " + str(len(list_student)) + ": "))

    print("-------------------\nNotas de "+list_grades[selection-1][0].get_student().get_name()+"\n-------------------")
    for i in range(len(list_grades[selection - 1])):
        print(list_grades[selection - 1][i].get_subject().get_name() + ": " + str(
            list_grades[selection - 1][i].get_grade()))
