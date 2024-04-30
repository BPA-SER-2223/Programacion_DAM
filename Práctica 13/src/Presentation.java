import java.util.*;

public class Presentation {

    public static void main(String[] args) {
        //System.out.println(Lista.generateList());

        //List<People> peoples = new ArrayList<People>();
        //People.fivePeoples(peoples);
        //People.averageAge(peoples);
        //People.male(peoples);
        //People.woman(peoples);

        Scanner a = new Scanner(System.in);

        int aa = 0;
        int ab = 0;

        do {
            System.out.println("Elige un ejercicio:");
            aa = a.nextInt();
            switch (aa) {
                case 1:
                    List<Enero> eneros = new ArrayList<>();
                    List<String> weekDays = new ArrayList<>();
                    weekDays.add("Lunes");
                    weekDays.add("Martes");
                    weekDays.add("Miercoles");
                    weekDays.add("Jueves");
                    weekDays.add("Viernes");
                    weekDays.add("Sabado");
                    weekDays.add("Domingo");

                    do {
                        System.out.println("\n¿Qué quieres hacer?\n\t1. Rellenar las temperaturas.\n\t2. Mostrar las temperaturas.\n\t3. Visualizar la temperatura media del mes.\n\t4. Día o días más calurosos del mes.\n\t5. Salir.");
                        ab = a.nextInt();

                        if (ab == 1) {
                            Enero.writeTemperatures(eneros);
                        }
                        if (ab == 2) {
                            System.out.println();
                            Enero.seeTemperatures(weekDays, eneros);
                        }
                        if (ab == 3) {
                            Enero.average_January_temperature(eneros);
                        }
                        if(ab == 4){
                            Enero.hottest_day(eneros, weekDays);
                        }
                        if (ab == 5){
                            ab = 0;
                        }
                    }while (ab != 0);

                case 2:
                    Map<String, Integer> linkedhashmap = new LinkedHashMap<>();
                    Scanner b = new Scanner(System.in);

                    for(int i=0; i<10; i++){
                        System.out.print((i+1) + "º producto:\n\tNombre producto: ");
                        String product = b.next();
                        System.out.print("\tPrecio: ");
                        int price = b.nextInt();

                        linkedhashmap.put(product, price);
                    }
                    System.out.println("¿Cual quieres vender? Escribe el nombre de algún producto de los introducidos anteriormente");
                    String selection = a.next();

                    linkedhashmap.remove(selection);

                    System.out.println("Inventario:");
                    System.out.println(linkedhashmap);

                case 3:
                    List<Integer> list_num = new ArrayList<>();

                    System.out.println("¿Cuantos numeros quieres introducir?");
                    int num = a.nextInt();
                    System.out.println("Introduce número mayores que 0:");
                    for(int i=0;i<num;i++){
                        System.out.print("\t" + (i+1) + "º número: ");
                        int num2 = a.nextInt();
                        list_num.add(num2);
                        if(num2 <= 0){
                            while (num2 <= 0){
                                System.out.print("Introduce un número mayor a 0: ");
                                num2 = a.nextInt();
                            }
                        }
                    }
                    System.out.print("Introduce el número a buscar: ");
                    num = a.nextInt();
                    for(int i=0;list_num.size()<i;i++){
                        if(list_num.get(i) == num){
                            System.out.println(1);
                        }
                    }
                case 4:

            }
        }while (aa != 0);
    }
}
