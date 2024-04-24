import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Presentation {

    public static void main(String[] args) {
        //System.out.println(Lista.generateList());

        //List<People> peoples = new ArrayList<People>();
        //People.fivePeoples(peoples);
        //People.averageAge(peoples);
        //People.male(peoples);
        //People.woman(peoples);

        Scanner a = new Scanner(System.in);

        switch (a.nextInt()){
            case 1:
                List<Enero> eneros = new ArrayList<>();
                List<Integer> temperatures = new ArrayList<>();
                List<String> weekDays = new ArrayList<>();
                weekDays.add("Lunes");
                weekDays.add("Martes");
                weekDays.add("Miercoles");
                weekDays.add("Jueves");
                weekDays.add("Viernes");
                weekDays.add("Sabado");
                weekDays.add("Domingo");

                switch (a.nextInt()){
                    case 1:
                        Enero.writeTemperatures(eneros, temperatures);
                    case 2:
                        eneros.get(0).seeTemperatures(temperatures, weekDays);
                    case 3:

                }




        }




    }
}
