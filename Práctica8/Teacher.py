from People import People

class Teacher(People):
    def __int__(self, dni, name, age, sex):
        super().__init__(dni, name, age, sex)