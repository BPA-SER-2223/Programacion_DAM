import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Elige una opción:\n\t1. Ejercicio 1.\n\t2. Ejercicio 2.\n\t3. Ejercicio 3.\n\t4. Ejercicio 4.\n\t5.Ejercicio 5.\n\t6.Salir");
        int select = a.nextInt();
        int num1;
        int num2 = 0;
        System.out.println();

        switch (select) {
            case 1:
                String [] mounth = {
                        "Enero tiene 31 días",
                        "Febrero tiene 28 días",
                        "Marzo tiene 31 días",
                        "Abril tiene 30 días",
                        "Mayo tiene 31 días",
                        "Junio tiene 30 días",
                        "Julio tiene 31 días",
                        "Agosto tiene 31 días",
                        "Septiembre tiene 30 días",
                        "Octubre tiene 31 días",
                        "Noviembre tiene 30 días",
                        "Diciembre tiene 31 días"
                };
                System.out.println("Introduce el número de algún mes (Enero = 1, Febrero = 2, Marzo = 3,...)");
                int num = a.nextInt();

                while(num <1 || num > 12){
                    System.out.println("Ese número no corresponde a ningun més");
                    num = a.nextInt();
                }

                System.out.println(mounth[num-1]);
                break;
            case 2:

                System.out.print("Primer número: ");
                num1 = a.nextInt();
                System.out.print("Segundo número: ");
                num2 = a.nextInt();

                if (num1 > num2) {
                    do {
                        System.out.print("El segundo número debe ser mayor al primero: ");
                        num2 = a.nextInt();
                    } while (num2 < num1);
                }

                for (int i = num1; i <= num2; i++) {

                    System.out.print(i);

                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.print(" = ByBorth");
                    } else if (i % 3 == 0) {
                        System.out.print(" = ByThree");
                    } else if (i % 5 == 0) {
                        System.out.print(" = ByFive");
                    }
                    System.out.println();
                }
                break;
            case 3:
                int count = 0;
                do {
                    System.out.print((count + 1) + "-. " + num2 + " + ");
                    num1 = a.nextInt();
                    num2 = num2 + num1;
                    count++;

                    if (num2 >= 1000) {
                        break;
                    }
                } while (num2 <= 1000);
                System.out.println("Total: " + num2 + "\nNúmeros introducidos: " + count + "\nMedia: " + (num2 / count));
                break;
            case 4:
                int contrary = 0;
                num1 = (int) (Math.random() * 100);

                for (int i = 0; i < 10; i++) {
                    System.out.print("Intento " + (i + 1) + ": ");
                    num2 = a.nextInt();

                    if (num2 < num1) {
                        System.out.println("El número es mayor.");
                        contrary++;
                    }
                    if (num2 > num1) {
                        System.out.println("El número es menor.");
                        contrary++;
                    }
                    if (num2 == num1) {
                        System.out.println("¡Correcto!");
                        break;
                    }
                }
                if (contrary == 10) {
                    System.out.println("No has sido capaz de adivinarlo. El número correcto era " + num1);
                }
                break;
            case 5:
                String[] options = new String[2];

                System.out.println("Elige una opción:\n\t1.Papel\n\t2.Piedra\n\t3.Tigera\n");

                do {
                    for (int i = 0; i < options.length; i++) {
                        System.out.print("Jugador"+(i+1)+": ");
                        options[i] = a.next();

                        if (!(options[i].equals("Papel")) && !(options[i].equals("Piedra")) && !(options[i].equals("Tigera"))){
                            do{
                                System.out.print("EL jugador"+(i+1)+" no ha introducido una de las opciones posibles.\nVuelve a introducir una opción: ");
                                options[i] = a.next();
                            }while (!(options[i].equals("Papel")) && !(options[i].equals("Piedra")) && !(options[i].equals("Tigera")));
                        }

                    }
                    if (options[0].equals(options[1])) {
                        System.out.println("\n¡Empate!\n");
                    } else if ((options[0].equals("Tigera") && options[1].equals("Papel")) || (options[0].equals("Papel") && options[1].equals("Piedra")) || (options[0].equals("Piedra") && options[1].equals("Tigera"))) {
                        System.out.println("\n!Gana el jugador1!");
                    } else if ((options[1].equals("Tigera") && options[0].equals("Papel")) || (options[1].equals("Papel") && options[0].equals("Piedra")) || (options[1].equals("Piedra") && options[0].equals("Tigera"))) {
                        System.out.println("\n!Gana el jugador1!");
                    }
                }while (options[0].equals(options[1]));
                break;
            case 6:
                break;

        }
        }
    }




