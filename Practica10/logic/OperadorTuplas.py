class OperadorTuplas:
    def __init__(self, tupla: tuple):
        self.__tupla = tupla

    def get_tupla(self) -> tuple:
        return self.__tupla

    def set_tupla(self, tupla):
        self.__tupla = tupla

    def create_subtupla(self):
        res = []
        repeat = 0

        for i in range(2):
            sub = (self.__tupla[repeat], self.__tupla[repeat+1])
            res.append(sub)
            repeat = repeat + 2

        print(res)