class Departament:
    def __int__(self, identifier: int, name: str):
        self.__identidier = identifier
        self.__name = name

    def get_identifier(self) -> int:
        return self.__identidier

    def set_identifier(self, identifier):
        self.__identidier = identifier

    def get_name(self):
        return self.__name

    def set_name(self, name):
        self.__name = name
