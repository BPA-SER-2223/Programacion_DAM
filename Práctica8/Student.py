import People
class Student:
    def __int__(self, dni, name, age, sex, course: str, subjects: str, email: str):
        super().__init__(dni, name, age, sex)
        self.__course = course
        self.__subjects = subjects
        self.__email = email

    def get_course(self) -> str:
        return self.__course

    def set_course(self, course):
        self.__course = course

    def get_subjects(self) -> str:
        return self.__subjects

    def set_subjects(self, subjects):
        self.__subjects = subjects

    def get_email(self) -> str:
        return self.__subjects

    def set_email(self, email):
        self.__email = email