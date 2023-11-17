from Usuario import Usuario
import getpass

if __name__ == '__main__':

    names=[]
    passwords=[]
    users=[["Alejandro", "Bulnes", "Sevilla este", 41020, "abp0025@gmail.com", 1234],[],[],[],[]]
    select=0
    counter=0
    i=0

    while i<=5:
        select=int(input("Elige una opción.\n\n\t1.Iniciar Sesión\n\t2.Registrarte\n\t3.Modo administrador\n\t4.Salir\n\n"))
        if select == 1:
            user1 = Usuario(users[0][0],users[0][1],users[0][2],users[0][3], users[0][4], users[0][5])
            user = input("Introduce el nombre: ")
            pass_ = int(input("Introduce la contraseña: "))
            user1.check(user, pass_)
        else:
            if select == 2:
                counter=counter+1
                name=input("Introduce el nombre del nuevo usuario: ")
                users[counter].append(name)
                second_name=input("introduce los apellido: ")
                users[counter].append(second_name)
                address=input("Introduce la dirección del nuevo usuario: ")
                users[counter].append(address)
                postal_code=int(input("Introduce el código postal del nuevo usuario: "))
                users[counter].append(postal_code)
                email=input("Introduce el email del nuevo usuario: ")
                users[counter].append(email)
                password=int(input("Introduce la contraseña del nuevo usuario: "))
                users[counter].append(password)

            else:
                if select==3:
                    print("Admin: " + "Alejandro: "+"Bulnes "+"Sevilla este "+"41020 "+"abp0025@gmail.com "+"1234")
                    for j in range(counter):
                        print("Usuario "+str(j+1)+": "+users[j+1][0]+" "+users[j+1][1]+" "+users[j+1][2]+" "+str(users[j+1][3])+" "+users[j+1][4]+" "+str(users[j+1][5]))
                    continue1 = getpass.getpass("Presiona 'Enter' para continuar...")
                    print(continue1)
                else:
                    if select==4:
                        break