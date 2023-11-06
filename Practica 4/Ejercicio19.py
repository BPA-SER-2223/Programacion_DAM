import random#Importamos la opción de generar números aleatorios con la opción random
print("\n")#Intro
array=[[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]#Inicializo un array de 4 lineas y 5 columnas
total=0#Variable que usaré para sumar todos los números aleatorios

for i in range(len(array)):#For que se repetirá tantas veces como posiciones tiene el array
    accumulator_line=""#Variable que acumulará cada línea
    add=0#Variable con la suma de todos los números de cada linea
    for j in range(len(array[0])):#For que se repetirá tantas veces como posiciones tiene la posición o del array
        array[i][j]=random.randint(0,100)#Colocamos un número aleatorio del 0 al 100 en la posición correspondiente del array
        total=total+array[i][j]#Sumamos todos los números del array
        add=add+array[i][j]
        accumulator_line=accumulator_line+"|\t"+str(array[i][j])+"\t"#Se acumulan todos los números de la linea en forma de palabras

    print(accumulator_line+"|\t"+str(add)+" Suma tola de la "+str(i+1)+"º fila ")#Se imprime en pantalla la linea

accumulator_columns=""#Variable que acumulará la suma de todos los números de cada columna

for i in range(len(array[0])):#For que se repetirá tantas veces como posiciones tiene la posición o del array
    add_2=0#Variable en la cual se guardará la suma de todos los números de la columna
    for j in range(len(array)):#For que se repetirá tantas veces como posiciones tiene el array
        add_2=add_2+array[j][i]

    accumulator_columns = accumulator_columns+"|\t"+str(add_2)+"\t"#Se guardan todos los resultados en forma de palabra en esta variable

print("-----------------------------------------------------------------------\n"+accumulator_columns+"|\t"+str(total)+" Suma total")#Mensaje con el resultado