class GestorDiccionarios:
    def __init__(self, dicc: dict):
        self.__dicc = dicc

    def get_dicc(self) -> dict:
        return self.__dicc

    def set_dicc(self, dicc):
        self.__dicc = dicc

    def add_to_dicc(self, word: str, mean: str):
        self.__dicc.update({word: mean})

    def change_key(self, old_key: str, new_key: str):
        self.__dicc[new_key] = self.__dicc.pop(old_key)

    def deleter_something(self, key: str):
        del self.__dicc[key]

    def seach_something(self, key: str):
        print(self.__dicc.get(key))