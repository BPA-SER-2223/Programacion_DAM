from logic.GestorListas import GestorListas
from logic.GestorDiccionarios import GestorDiccionarios
class GestorMixto(GestorListas, GestorDiccionarios):
    def __init__(self, list: list, dicc: dict):
        GestorListas.__init__(self, list)
        GestorDiccionarios.__init__(self, dicc)

    def get_list_key(self) -> list:
        return self.get_list() + (list(self.get_dicc().keys()))