class People():
    def __int__(self, dni: str, name: str, age: int, sex: str):
        self.__dni = dni
        self.__name = name
        self.__age = age
        self.__sex = sex

    def get_name(self) -> str:
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_dni(self) -> str:
        return self.__dni

    def set_dni(self, dni):
        self.__dni = dni

    def get_age(self) -> int:
        return self.__age

    def set_age(self, age):
        self.__age = age

    def get_sex(self) -> str:
        return self.__sex

    def set_sex(self, sex):
        self.__sex = sex

