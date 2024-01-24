from logic.Subject import Subject
from logic.Student import Student
class Grade:
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
