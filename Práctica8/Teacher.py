import datetime
import People
import Departament
class Teacher(People):
    def __int__(self, dni, name, age, sex, salary: float, start_date: datetime, subjects: str, departament: Departament):
        super().__init__(dni, name, age, sex)
        self.__salary = salary
        self.__start_date = start_date
        self.__subjects = subjects
        self.__departament = departament

    def get_salary(self) -> float:
        return self.__salary

    def set_salary(self, salary):
        self.__salary = salary

    def get_start_date(self) -> datetime:
        return self.__start_date

    def set_start_date(self, start_date):
        self.__start_date = start_date

    def get_subjects(self) -> str:
        return self.__subjects

    def set_subjects(self, subjects):
        self.__subjects = subjects

    def get_departament(self) -> Departament:
        return self.__departament

    def set_departament(self, departament):
        self.__departament = departament

    def get_Net_Income(self) -> float:
        sueldo_anual = self.__salary * 12
        sueldo_neto = 0.0

        if sueldo_anual <= 12449:
            sueldo_neto = (self.__salary - (self.__salary * 9.5 / 100))

        if sueldo_anual >= 12450 and sueldo_anual <= 20199:
            sueldo_neto = (self.__salary - (self.__salary * 12 / 100))

        if sueldo_anual >= 20200 and sueldo_anual <= 35199:
            sueldo_neto = (self.__salary - (self.__salary * 15 / 100))

        if sueldo_anual >= 35200 and sueldo_anual <= 59999:
            sueldo_neto = (self.__salary - (self.__salary * 18.5 / 100))

        if sueldo_anual >= 60000 and sueldo_anual <= 299999:
            sueldo_neto = (self.__salary - (self.__salary * 22.5 / 100))

        if sueldo_anual >= 300000:
            sueldo_neto = (self.__salary - (self.__salary * 24.5 / 100))

        return sueldo_neto
