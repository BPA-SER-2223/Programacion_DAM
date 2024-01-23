from logic import Address, Course
class Institute:
    def __init__(self, name: str, cif: str, address: Address, courses:  Course):
        self.__name = name
        self.__cif = cif
        self.__address = address
        self.__courses = courses

    def get_name(self) -> str:
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_cif(self) -> str:
        return self.__cif

    def set_cif(self, cif):
        self.__cif = cif

    def get_address(self) -> Address:
        return self.__address

    def set_address(self, address):
        self.__address = address

    def get_courses(self):
        return self.__courses

    def set_courses(self, courses):
        self.__courses = courses