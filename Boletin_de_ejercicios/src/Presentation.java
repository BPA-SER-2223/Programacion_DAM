import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Presentation {

    public static void main(String[] args) {
        //System.out.println(Lista.generateList());

        //List<People> peoples = new ArrayList<People>();
        //People.fivePeoples(peoples);
        //People.averageAge(peoples);
        //People.male(peoples);
        //People.woman(peoples);

        List<Enero> eneros = new ArrayList<Enero>();
        int[][] temperatures = new int[31][31];
        List<String> weekDays = new ArrayList<String>();
        weekDays.add("Lunes");
        weekDays.add("Martes");
        weekDays.add("Miercoles");
        weekDays.add("Jueves");
        weekDays.add("Viernes");
        weekDays.add("Sabado");
        weekDays.add("Domingo");

        Enero.writeTemperatures(eneros, temperatures);


    }
}
