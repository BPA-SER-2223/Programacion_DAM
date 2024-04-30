import java.util.ArrayList;
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

    public static void writeTemperatures(List<Enero> eneros){
        Scanner a = new Scanner(System.in);
        List<Integer> temperatures = new ArrayList<>();
        Enero enero = new Enero(temperatures);


        for(int i=0;i<31;i++){
            System.out.print("Día "+(i+1)+": ");
            temperatures.add(a.nextInt());
        }
        eneros.add(enero);
        System.out.println("\n¡Temperaturas del més de Enero Nº"+ eneros.size() +" registrado!");
    }

    public static void seeTemperatures(List<String> weekDays, List<Enero> eneros){

        int week = 1;
        int in=0;
        Scanner a = new Scanner(System.in);

        System.out.println("Elige una opción:");
        for (int i = 0; i < eneros.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + (i + 1) + "º Enero");
        }
        int selection = a.nextInt();

        for(int i=0;i<eneros.get(selection-1).getTemperature().size();i++){
            System.out.print("El "+weekDays.get(in)+" de la Semana "+week+" con "+eneros.get(selection-1).getTemperature().get(i)+" grados.");
            System.out.println();
            in++;
            if(i%7==6){
                week++;
                in=0;
            }
        }

    }
    public static void average_January_temperature(List<Enero> eneros){
        int accumulator = 0;
        Scanner a = new Scanner(System.in);

        System.out.println("Elige una opción:");
        for (int i = 0; i < eneros.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + (i + 1) + "º Enero");
        }
        int selection = a.nextInt();

        for(int i=0;i<eneros.get(selection-1).getTemperature().size();i++){
            accumulator = accumulator + eneros.get(selection-1).getTemperature().get(i);
        }
        System.out.println("La temperatura media es: " + (accumulator/31) + "ºC");
    }

    public static void hottest_day(List<Enero> eneros, List<String> weekDays){
        Scanner a = new Scanner(System.in);
        int week = 1;
        int in=0;

        System.out.println("Elige una opción:");
        for (int i = 0; i < eneros.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + (i + 1) + "º Enero");
        }
        int selection = a.nextInt();
        int referent = eneros.get(selection-1).getTemperature().get(0);
        for(int i=0;i<eneros.get(selection-1).getTemperature().size();i++){
            if(eneros.get(selection-1).getTemperature().get(i)>referent){
                referent = eneros.get(selection-1).getTemperature().get(i);
            }
        }

        for(int i=0;i<eneros.get(selection-1).getTemperature().size();i++){
            if (referent == eneros.get(selection-1).getTemperature().get(i)){
                System.out.print("El "+weekDays.get(in)+" de la Semana "+week+" con "+eneros.get(selection-1).getTemperature().get(i)+" grados.");
                in++;
                if(i%7==6){
                    week++;
                    in=0;
                }
            }
        }
    }
}
