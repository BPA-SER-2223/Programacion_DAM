from logic.People import People
from logic.Course import Course
from logic.Subject import Subject
from logic.Address import Address

class Student(People):
    def __init__(self, dni, name, age, sex, course: Course, subjects: Subject, email: str, address: Address):
        super().__init__(dni, name, age, sex)
        self.__course = course
        self.__subjects = subjects
        self.__email = email
        self.__address = address

    def get_course(self) -> Course:
        return self.__course

    def set_course(self, course):
        self.__course = course

    def get_subjects(self) -> Subject:
        return self.__subjects

    def set_subjects(self, subjects):
        self.__subjects = subjects

    def get_email(self) -> str:
        return self.__email

    def set_email(self, email):
        self.__email = email

    def get_address(self) -> Address:
        return self.__address

    def set_address(self, address):
        self.__address = address