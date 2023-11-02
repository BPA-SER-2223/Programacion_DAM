numbers = []
for i in range(3):
    number = int(input("Escribe el " + str(i + 1) + "º número: "))
    numbers.append(number)#Se agrega el contenido de la variable number a la lista numbers

if numbers[0]>numbers[1] and numbers[0]>numbers[2]:#conjunto de if´s que averiguará el orden de los 3 números introducidos
    if numbers[1]>numbers[2]:
        print(numbers[0],numbers[1],numbers[2])
    else:
        print(numbers[0], numbers[2], numbers[1])
elif numbers[1]>numbers[0] and numbers[1]>numbers[2]:
    if numbers[0] > numbers[2]:
        print(numbers[1], numbers[0], numbers[2])
    else:
        print(numbers[1], numbers[2], numbers[0])
elif numbers[2]>numbers[0] and numbers[2]>numbers[1]:
    if numbers[0] > numbers[1]:
        print(numbers[2], numbers[0], numbers[1])
    else:
        print(numbers[2], numbers[1], numbers[0])