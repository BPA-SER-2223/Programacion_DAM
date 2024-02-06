class GestorListas:
    def __init__(self, list: list):
        self.__list = list

    def get_list(self) -> list:
        return self.__list

    def set_list(self, list: list):
        self.__list = list

    def add_to_the_list(self, num: int):
        self.__list.append(num)

    def update_the_list(self, position: int, num: int):
        self.__list.insert(position, num)

    def eliminate_something_of_the_list(self, position: int):
        self.__list.remove(position)