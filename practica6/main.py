from Usuario import Usuario
import getpass

if __name__ == '__main__':

    users=[["Alejandro", "Bulnes", "Sevilla este", 41020, "abp0025@gmail.com", 1234],[],[],[],[]]#Inicializamos un array que guardará la información de los usuario actuales y los que se crearán
    select=0
    counter=0
    i=0
    num=0

    admin = Usuario(users[0][0], users[0][1], users[0][2], users[0][3], users[0][4], users[0][5])#Creación del usuario administrador con la posiciones del array la cual contiene toda la información

    while i<=5:#While infinito, esto sucede ya que queremos que el programa se repita hasta que usuario diga que se acabe
        select=int(input("Elige una opción.\n\n\t1.Iniciar Sesión\n\t2.Registrarte\n\t3.Modo administrador\n\t4.Salir\n\n"))#Inicializamos una variable que decidirá, a traves de un número del 1 al 4, la acción a realizar a continuación
        while select<1 or select>4:#While que se repetirá hasta que el número introducido de para la elección este dentro del rango de 1 a 4
            select=int(input("Introduzca un número valido: "))#Se vuelve a pedir la selección
        if select == 1:#Si el número introducido a sido el 1, aparecerá otra elección de todos los usuarios creados actualmente, para que a continuación inicies sesión con el que tu elijas
            print("-----------------------------------------")#Decoración
            print("Elige un usuario:\n\t1.Admin")#Información

            for i in range(counter):#For que mostrará en pantalla los usuarios creados por el usuario
                print("\t"+str(i+2)+".Usuario "+str(i+1))#Usuarios

            num = int(input(""))#Inicializamos una variable la cual usaremos para seleccionar el usuario
            print("-----------------------------------------")#Decoración

            if num <= 0 or num > (counter+1):#Si el la elección anterior es mayor al número de usuarios disponibles, se pedirá otra vez la elección
                while num <= 0 or num > (counter+1):#While que se repetirá hasta que la elección este en el rango correcto
                    num = int(input("Introduce un número válido(de 1 a "+str(counter+1)+"): "))#Se pide otra vez la elección
                print("-----------------------------------------")#Decoración
            #Una vez que elegimos el usuario, pedimos su nombre y su contraseña
            user = input("Introduce el nombre: ")#Nombre
            pass_ = int(input("Introduce la contraseña: "))#Contraseña
            print("-----------------------------------------")#Decoración
            #Según el usuario que se elija, se hará el check correspondiente
            if num==1:
                admin.check(user, pass_)
                if user==admin.name and pass_==admin.password:#Si el usuario y contraseña introducidos coinciden con los guardados, aparecerá la información del usuario
                    print("-----------------------------------------")#Decoración
                    print("\tUsuario: "+admin.name)
                    print("\tApellidos: "+admin.second_name)
                    print("\tDirección: "+admin.address)
                    print("\tCódigo postal: "+str(admin.postal_code))
                    print("\tEmail: "+admin.email+"\n")
                    print(admin.mostrarUsuario())
                print()
            if num==2:
                user2.check(user, pass_)
                if user==user2.name and pass_==user2.password:#Si el usuario y contraseña introducidos coinciden con los guardados, aparecerá la información del usuario
                    print("-----------------------------------------")#Decoración
                    print("\tUsuario: "+user2.name)
                    print("\tApellidos: "+user2.second_name)
                    print("\tDirección: "+user2.address)
                    print("\tCódigo postal: "+str(user2.postal_code))
                    print("\tEmail: "+user2.email)
                    print(user2.mostrarUsuario())
                print()
            if num==3:
                user3.check(user, pass_)
                if user==user3.name and pass_==user3.password:#Si el usuario y contraseña introducidos coinciden con los guardados, aparecerá la información del usuario
                    print("-----------------------------------------")#Decoración
                    print("\tUsuario: "+user3.name)
                    print("\tApellidos: "+user3.second_name)
                    print("\tDirección: "+user3.address)
                    print("\tCódigo postal: "+str(user3.postal_code))
                    print("\tEmail: "+user3.email)
                    print(user3.mostrarUsuario())
                print()
            if num==4:
                user4.check(user, pass_)
                if user==user4.name and pass_==user4.password:#Si el usuario y contraseña introducidos coinciden con los guardados, aparecerá la información del usuario
                    print("-----------------------------------------")#Decoración
                    print("\tUsuario: "+user4.name)
                    print("\tApellidos: "+user4.second_name)
                    print("\tDirección: "+user4.address)
                    print("\tCódigo postal: "+str(user4.postal_code))
                    print("\tEmail: "+user4.email)
                    print(user4.mostrarUsuario())
                print()
            if num==5:
                user5.check(user, pass_)
                if user==user5.name and pass_==user5.password:#Si el usuario y contraseña introducidos coinciden con los guardados, aparecerá la información del usuario
                    print("-----------------------------------------")#Decoración
                    print("\tUsuario: "+user5.name)
                    print("\tApellidos: "+user5.second_name)
                    print("\tDirección: "+user5.address)
                    print("\tCódigo postal: "+str(user5.postal_code))
                    print("\tEmail: "+user5.email)
                    print(user5.mostrarUsuario())
                print()

        else:
            if select == 2:#Si el número introducido a sido el 2, se preguntará por toda la información
                if counter < 4:
                    counter=counter+1#Incrementamos en uno el contador de usuarios creados
                    name=input("\nIntroduce el nombre del nuevo usuario: ")#Pedimos el nombre
                    users[counter].append(name)#Guardamos la información en el array
                    second_name=input("introduce los apellido: ")#Pedimos los apellidos
                    users[counter].append(second_name)#Guardamos la información en el array
                    address=input("Introduce la dirección del nuevo usuario: ")#Pedimos la dirección
                    users[counter].append(address)#Guardamos la información en el array
                    postal_code=int(input("Introduce el código postal del nuevo usuario: "))#Pedimos el código postal
                    users[counter].append(postal_code)#Guardamos la información en el array
                    email=input("Introduce el email del nuevo usuario: ")#Pedimos el email
                    users[counter].append(email)#Guardamos la información en el array
                    password=int(input("Introduce la contraseña del nuevo usuario: "))#Pedimos la contraseña
                    users[counter].append(password)#Guardamos la información en el array
                    print()
                    #Según lo que indique el contador, crearemos el usuario correspondiente con la información introducida anteriormente guardada en el array
                    if counter==1:
                        user2 = Usuario(users[1][0], users[1][1], users[1][2], users[1][3], users[1][4], users[1][5])

                    if counter==2:
                        user3 = Usuario(users[2][0], users[2][1], users[2][2], users[2][3], users[2][4], users[2][5])

                    if counter==3:
                        user4 = Usuario(users[3][0], users[3][1], users[3][2], users[3][3], users[3][4], users[3][5])

                    if counter==4:
                        user5 = Usuario(users[4][0], users[4][1], users[4][2], users[4][3], users[4][4], users[4][5])
                else:
                    print("No se puede crear más usuario.")#Habrá un máximo de 5 usuarios(1 el admin y 4 para crear), cuando el contador indique 4, aparecerá este mensaje

            else:
                if select==3:#Si el número introducido a sido el 3, se abrirá un aparta unicamente para el administrador donde se vera la información de todos los usuarios existentes
                    user = input("Introduce el usuario del admin: ")#Se pide el usuario del administrador
                    pass_ = int(input("Introduce la contraseña del admin: "))#Se pide la contraseña del administrador

                    if user==admin.name and pass_==admin.password:#Si los datos introducidos coinciden con los del admin, se podrá acceder a información
                        print("-----------------------------------------")#Decoración
                        print("Admin: \n\tNombre: Alejandro\n\tApellido: Bulnes Povea\n\tDirección: Sevilla este\n\tCódigo postal: 41020\n\tEmail: abp0025@gmail.com\n\tContraseña: 1234")#Información del admin

                        for j in range(counter):#For que se repetirá tanta veces como usuarios haya
                            print("\nUsuario "+str(j+1)+":\n\tNombre: "+users[j+1][0]+"\n\tApellidos: "+users[j+1][1]+"\n\tDirección: "+users[j+1][2]+"\n\tCódigo postal: "+str(users[j+1][3])+"\n\tEmail: "+users[j+1][4]+"\n\tContraseña: "+str(users[j+1][5]))#Información de los usuarios guardados en el array llamado "users"

                        print("-----------------------------------------")#Decoración
                        continue1 = getpass.getpass("Presiona 'Enter' para continuar...")#Es como un wait para dar tiempo al administrador de ver toda la información
                        print()#Decorativo
                    else:#Si los datos no coinciden, aparecerá el siguiente mensaje
                        print("-----------------------------------------")#Decoración
                        print("El usuario o la contraseña es incorrecta.")#Mensaje
                        print("-----------------------------------------")#Decoración
                else:
                    if select==4:#Si el número introducido a sido el 4, el programa terminará
                        break