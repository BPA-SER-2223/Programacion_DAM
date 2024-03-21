import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Enero {
    private int[][] temperatures;

    public Enero(int[][] temperatures){
        this.temperatures = temperatures;
    }

    public int[][] getTemperature(){
        return this.temperatures;
    }
    public void setTemperatures(int[][] temperatures){
        this.temperatures = temperatures;
    }

    public static void writeTemperatures(List<Enero> eneros, int[][] temperatures){
        Scanner a = new Scanner(System.in);
        Enero enero = new Enero(temperatures);

        for(int i=0;i<31;i++){
            System.out.print("Día "+(i+1)+": ");
            temperatures[eneros.size()][i] = a.nextInt();
        }
        eneros.add(enero);
        System.out.println("\n¡Temperaturas del més de Enero registrado!");
    }



    @Override
    public String toString() {
        return Arrays.toString(temperatures);
    }

    //public static void hotday(List<Integer> temperatures){
        //for()
    //}

}
