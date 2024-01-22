import People
import datetime
class Administration_Staff(People):
    def __int__(self, name, dni, age, sex, functions: str, salaty: float, start_date: datetime):
        super().__int__(name, dni, age, sex)
        self.__functions = functions
        self.__salaty = salaty
        self.__start_date = start_date

    def get_functions(self) -> str:
        return self.__functions

    def set_functions(self, functions):
        self.__functions = functions

    def get_salaty(self) -> float:
        return self.__salaty

    def set_salaty(self, salaty):
        self.__salaty = salaty

    def get_start_date(self) -> datetime:
        return self.__start_date

    def set_start_date(self, start_date):
        self.__start_date = start_date