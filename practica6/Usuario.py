class Usuario:

    def __init__(self,name,second_name,address,postal_code,email,password):
        self.name=name
        self.second_name=second_name
        self.address=address
        self.postal_code=postal_code
        self.email=email
        self.password=password

    def findname(self):
        return self.name

    def findsecond_name(self):
        return self.second_name
    def findaddress(self):
        return self.address
    def findpostal_code(self):
        return self.postal_code
    def findemail(self):
        return self.email
    def findpassword(self):
        return self.password

    def check(self, user, pass_):
        print(user)
        print(self.name)
        print(pass_)
        print(self.password)
        if user == self.name and pass_ == self.password:
            print("Correcto")
        else:
            print("Error")