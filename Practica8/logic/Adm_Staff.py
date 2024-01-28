from logic.People import People
from datetime import datetime
from logic.Address import Address

class Adm_Staff(People):
    def __init__(self, name, dni, age, sex, functions: str, salary: float, start_date: datetime.date, address: Address):
        super().__init__(name, dni, age, sex)
        self.__functions = functions
        self.__salary = salary
        self.__start_date = start_date
        self.__address = address

    def get_functions(self) -> str:
        return self.__functions

    def set_functions(self, functions):
        self.__functions = functions

    def get_salary(self) -> float:
        return self.__salary

    def set_salary(self, salary):
        self.__salary = salary

    def get_start_date(self) -> datetime.date:
        return self.__start_date

    def set_start_date(self, start_date):
        self.__start_date = start_date

    def get_address(self) -> Address:
        return self.__address

    def set_address(self, address):
        self.__address = address

    def get_Net_Income(self) -> str:
        annual_salary = self.__salary * 12
        net_income = 0.0

        if annual_salary <= 12449:
            net_income = (self.__salary - (self.__salary * 9.5 / 100))

        if 12450 <= annual_salary <= 20199:
            net_income = (self.__salary - (self.__salary * 12 / 100))

        if 20200 <= annual_salary <= 35199:
            net_income = (self.__salary - (self.__salary * 15 / 100))

        if 35200 <= annual_salary <= 59999:
            net_income = (self.__salary - (self.__salary * 18.5 / 100))

        if 60000 <= annual_salary <= 299999:
            net_income = (self.__salary - (self.__salary * 22.5 / 100))

        if annual_salary >= 300000:
            net_income = (self.__salary - (self.__salary * 24.5 / 100))

        return str(net_income) + "€"

    def get_antiquity(self):
        return datetime.now().year - self.__start_date.year
