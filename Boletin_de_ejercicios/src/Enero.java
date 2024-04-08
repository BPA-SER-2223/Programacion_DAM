import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Enero {
    private List<Integer> temperatures;

    @Override
    public String toString() {
        return temperatures.toString();
    }

    public Enero(List<Integer> temperatures){
        this.temperatures = temperatures;
    }

    public List<Integer> getTemperature(){
        return this.temperatures;
    }
    public void setTemperatures(List<Integer> temperatures){
        this.temperatures = temperatures;
    }

    public static void writeTemperatures(List<Enero> eneros, List<Integer> temperatures){
        Scanner a = new Scanner(System.in);
        Enero enero = new Enero(temperatures);

        for(int i=0;i<31;i++){
            System.out.print("Día "+(i+1)+": ");
            temperatures.add(a.nextInt());
        }
        eneros.add(enero);
        System.out.println("\n¡Temperaturas del més de Enero Nº"+ eneros.size() +" registrado!");
    }

    public void seeTemperatures(List<Integer> temperatures, List<String> weekDays){

        int week = 1;
        int in=0;

        for(int i=0;i<temperatures.size();i++){
            System.out.print("El "+weekDays.get(in)+" de la Semana "+week+" con "+temperatures.get(i)+" grados.");
            System.out.println();
            in++;
            if(i%7==6){
                week++;
                in=0;
            }
        }

    }

}
