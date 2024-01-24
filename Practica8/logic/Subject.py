class Subject:
    def __init__(self, name: str, identifier: int, description: str, credits: float):
        self.__name = name
        self.__identifier = identifier
        self.__description = description
        self.__credits = credits

    def get_name(self) -> str:
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_identifier(self) -> int:
        return self.__identifier

    def set_identifier(self, identifier):
        self.__identifier = identifier

    def get_description(self) -> str:
        return self.__description

    def set_description(self, description):
        self.__description = description

    def get_credits(self) -> float:
        return self.__credits

    def set_credits(self, credits):
        self.__credits = credits
