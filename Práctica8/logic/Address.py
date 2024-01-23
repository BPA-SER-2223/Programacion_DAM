class Address:
    def __init__(self, street: str, number: int, postal_code: int, location: str, province: str):
        self.__street = street
        self.__number = number
        self.__postal_code = postal_code
        self.__location = location
        self.__province = province

    def get_street(self) -> str:
        return self.__street

    def set_street(self, street):
        self.__street = street

    def get_number(self) -> int:
        return self.__number

    def set_number(self, number):
        self.__number = number

    def get_postal_code(self) -> int:
        return self.__postal_code

    def set_postal_code(self, postal_code):
        self.__postal_code = postal_code
    def get_location(self) -> str:
        return self.__location

    def set_location(self, location):
        self.__location = location

    def get_province(self) -> str:
        return self.__province

    def set_province(self, province):
        self.__province = province

