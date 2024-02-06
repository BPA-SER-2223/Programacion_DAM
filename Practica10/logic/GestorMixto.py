from logic.GestorListas import GestorListas
from logic.GestorDiccionarios import GestorDiccionarios
class GestorMixto(GestorListas, GestorDiccionarios):
    def __int__(self, list, dicc: dict):
        super.__init__(list)
        self.__dicc = dicc

    def get_dicc(self):
        return self.__dicc

    def set_dicc(self, dicc):
        self.__dicc = dicc
