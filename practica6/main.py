from Usuario import Usuario

if __name__ == '__main__':
    user1=Usuario("Alejandro","Bulnes","Sevilla este",41020,"abp0025@gmail.com",1234)
    user=input("Introduce el nombre: ")
    pass_=input("Introduce la contraseña: ")

    user1.check(user,pass_)
