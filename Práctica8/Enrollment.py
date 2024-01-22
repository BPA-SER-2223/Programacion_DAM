import Student
import Subject
class Enrollment:
    def __int__(self, student: Student, subject: Subject, course: str):
        self.__student = student
        self.__subject = subject
        self.__course = course

    def get_student(self) -> Student:
        return self.__student

    def set_student(self, student):
        self.__student = student

    def get_subject(self) -> Subject:
        return self.__subject

    def set_subject(self, subject):
        self.__subject = subject

    def get_course(self) -> str:
        return self.__course

    def set_course(self, course):
        self.__course = course