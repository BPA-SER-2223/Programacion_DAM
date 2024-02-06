class OperadorConjunto:
    def __init__(self, conj: set):
        self.__conj = conj

    def get_conj(self) -> set:
        return self.__conj

    def set_conj(self, conj):
        self.__conj = conj

    def add_set(self, num: int):
        self.__conj.add(num)

    def update_set(self, num, num2: int):
        self.__conj.remove(num)
        self.__conj.add(num2)

    def deleter_conj(self, dele: int):
        self.__conj.remove(dele)

    def union_conj(self, new_conj: set):
        self.__conj.union(new_conj)