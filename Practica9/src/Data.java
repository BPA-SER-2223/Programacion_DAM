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

            int selection2 = a.nextInt();

            if(selection2<1 || selection2>4){
                while (selection2<1 || selection2>4){
                    System.out.print("Introduce un número entre 1 y 4: ");
                    selection2 = a.nextInt();
                }
            }

            if(selection2 == 1){
                list1.add_num();
            }
            if(selection2 == 2){
                System.out.println("La sume es: "+list1.sumar_nums());
            }
            if(selection2 == 3){
                System.out.println(list1.get_list_num());
            }
            if (selection2 == 4){
                break;
            }
        }
    }

    public static void ejerccio2(){
        ArrayList<GestorPersonas> list_People = new ArrayList<GestorPersonas>();

        GestorPersonas people1 = new GestorPersonas("Pedro", 22);

    }
}
