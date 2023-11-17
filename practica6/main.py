from Usuario import Usuario
import getpass

if __name__ == '__main__':

    names=[]
    passwords=[]
    users=[["Alejandro", "Bulnes", "Sevilla este", 41020, "abp0025@gmail.com", 1234],[],[],[],[]]
    select=0
    counter=0
    i=0

    user1 = Usuario(users[0][0], users[0][1], users[0][2], users[0][3], users[0][4], users[0][5])

    while i<=5:
        select=int(input("Elige una opción.\n\n\t1.Iniciar Sesión\n\t2.Registrarte\n\t3.Modo administrador\n\t4.Salir\n\n"))
        if select == 1:
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

                if select>5:
                    if counter==1:
                        user2 = Usuario(users[1][0], users[1][1], users[1][2], users[1][3], users[1][4], users[1][5])

                    if counter==2:
                        user3 = Usuario(users[2][0], users[2][1], users[2][2], users[2][3], users[2][4], users[2][5])

                    if counter==3:
                        user4 = Usuario(users[3][0], users[3][1], users[3][2], users[3][3], users[3][4], users[3][5])

                    if counter==4:
                        user5 = Usuario(users[4][0], users[4][1], users[4][2], users[4][3], users[4][4], users[4][5])
                else:
                    print("No se puede crear más usuario.")

            else:
                if select==3:
                    print("Admin: \n\tNombre: Alejandro\n\tApellido: Bulnes Povea\n\tDirección: Sevilla este\n\tCódigo postal: 41020\n\tEmail: abp0025@gmail.com\n\tContraseña: 1234")
                    for j in range(counter):
                        print("Usuario "+str(j+1)+":\n\tNombre: "+users[j+1][0]+"\n\tApellidos: "+users[j+1][1]+"\n\tDirección: "+users[j+1][2]+"\n\tCódigo postal: "+str(users[j+1][3])+"\n\tEmail: "+users[j+1][4]+"\n\tContraseña: "+str(users[j+1][5]))
                    continue1 = getpass.getpass("Presiona 'Enter' para continuar...")
                else:
                    if select==4:
                        break