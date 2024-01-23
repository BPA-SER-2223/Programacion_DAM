import People
import datetime
class Administration_Staff(People):
    def __init__(self, name, dni, age, sex, functions: str, salary: float, start_date: datetime):
        super().__init__(name, dni, age, sex)
        self.__functions = functions
        self.__salary = salary
        self.__start_date = start_date

    def get_functions(self) -> str:
        return self.__functions

    def set_functions(self, functions):
        self.__functions = functions

    def get_salary(self) -> float:
        return self.__salary

    def set_salary(self, salary):
        self.__salary = salary

    def get_start_date(self) -> datetime:
        return self.__start_date

    def set_start_date(self, start_date):
        self.__start_date = start_date

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