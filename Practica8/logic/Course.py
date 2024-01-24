class Course:
    def __init__(self, type: str, level: str, description: str, code: int):
        self.__type = type
        self.__level = level
        self.__description = description
        self.__code = code

    def get_type(self) -> str:
        return self.__type

    def set_type(self, type):
        self.__type = type

    def get_level(self) -> str:
        return self.__level

    def set_level(self, level):
        self.__level = level

    def get_description(self) -> str:
        return self.__description

    def set_description(self, description):
        self.__description = description

    def get_code(self) -> int:
        return self.__code

    def set_code(self, code):
        self.__code = code