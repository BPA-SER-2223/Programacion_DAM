import Subject
import Address


class Institute:
    def __int__(self, name: str, cif: str, address: Address, subject: Subject):
        self.__name = name
        self.__cif = cif
        self.__address = address
        self.__subject = subject

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

    def get_subject(self) -> Subject:
        return self.__subject

    def set_subject(self, subject):
        self.__subject = subject
