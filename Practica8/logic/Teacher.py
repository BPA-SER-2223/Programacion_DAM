from datetime import datetime
from logic.People import People
from logic.Department import Department
from logic.Subject import Subject
from logic.Address import Address
class Teacher(People):
    def __init__(self, dni, name, age, sex, salary: float, start_date: datetime.date, subjects: Subject, departament: Department, address: Address):
        super().__init__(dni, name, age, sex)
        self.__salary = salary
        self.__start_date = start_date
        self.__subjects = subjects
        self.__departament = departament
        self.__address = address

    def get_salary(self) -> float:
        return self.__salary

    def set_salary(self, salary):
        self.__salary = salary

    def get_start_date(self) -> datetime.date:
        return self.__start_date

    def set_start_date(self, start_date):
        self.__start_date = start_date

    def get_subjects(self) -> Subject:
        return self.__subjects

    def set_subjects(self, subjects):
        self.__subjects = subjects

    def get_departament(self) -> Department:
        return self.__departament

    def set_departament(self, departament):
        self.__departament = departament

    def get_address(self) -> Address:
        return self.__address

    def set_address(self, address):
        self.__address = address

    def get_Net_Income(self) -> str:
        Annual_Salary = self.__salary * 12
        Net_Income = 0.0

        if Annual_Salary <= 12449:
            Net_Income = (self.__salary - (self.__salary * 9.5 / 100))

        if Annual_Salary >= 12450 and Annual_Salary <= 20199:
            Net_Income = (self.__salary - (self.__salary * 12 / 100))

        if Annual_Salary >= 20200 and Annual_Salary <= 35199:
            Net_Income = (self.__salary - (self.__salary * 15 / 100))

        if Annual_Salary >= 35200 and Annual_Salary <= 59999:
            Net_Income = (self.__salary - (self.__salary * 18.5 / 100))

        if Annual_Salary >= 60000 and Annual_Salary <= 299999:
            Net_Income = (self.__salary - (self.__salary * 22.5 / 100))

        if Annual_Salary >= 300000:
            Net_Income = (self.__salary - (self.__salary * 24.5 / 100))

        return str(Net_Income)+"€"

    def get_antiquity(self):
        return datetime.now().year - self.__start_date.year