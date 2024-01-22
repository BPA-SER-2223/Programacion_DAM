class Departament:
    def __int__(self, identifier: int, name: str):
        self.__identifier = identifier
        self.__name = name

    def get_identifier(self) -> int:
        return self.__identifier

    def set_identifier(self, identifier):
        self.__identifier = identifier

    def get_name(self) -> str:
        return self.__name

    def set_name(self, name):
        self.__name = name
