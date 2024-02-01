import java.util.ArrayList;
import java.util.Scanner;
public class Data {

    public static void ejercicio1(){
        int infinite = 0;
        ArrayList<Integer> list_num = new ArrayList<Integer>();

        list_num.add(1);
        list_num.add(2);
        list_num.add(3);

        GestorNumeros list1 = new GestorNumeros(list_num);

        while(infinite != 1){
            Scanner a = new Scanner(System.in);
            System.out.println("Elige una opción.\n\t1. Añadir número.\n\t2. Sumar todos los números.\n\t3. Mostrar todos los números\n\t4. Salir");

            int selection = a.nextInt();

            if(selection<1 || selection>4){
                while (selection<1 || selection>4){
                    System.out.print("Introduce un número entre 1 y 4: ");
                    selection = a.nextInt();
                }
            }

            if(selection == 1){
                list1.add_num();
            }
            if(selection == 2){
                System.out.println("La sume es: "+list1.sumar_nums());
            }
            if(selection == 3){
                System.out.println(list1.get_list_num());
            }
            if (selection == 4){
                break;
            }
        }
    }

    public static void ejerccio2(){
        int infinite = 0;

        GestorPersonas gestor = new GestorPersonas();

        while (infinite == 0){
            System.out.println("Elige una opción\n\t1. Añadir persona\n\t2. Información de personas\n\t3. Buscar persona\n\t4. Salir");
            Scanner a = new Scanner(System.in);
            int selection = a.nextInt();


            if(selection<1 || selection>4){
                while (selection<1 || selection>4){
                    System.out.print("Introduce un número entre 1 y 4: ");
                    selection = a.nextInt();
                }
            }

            if(selection == 1){
                System.out.print("Introduce el nombre de la persona: ");
                String name = a.next();
                System.out.print("Introduce la edad de la persona: ");
                int age = a.nextInt();
                gestor.createPersona(name, age);
                System.out.println("\n¡Persona creada!\n");
            }
            if(selection == 2){
                gestor.showPersona(gestor);
            }
            if(selection == 3){
                System.out.println(gestor.searchPersona()+"\n");
            }
            if (selection == 4){
                break;
            }
        }
    }
}
