import java.util.HashSet;
import java.util.Scanner;

public class GestorColores {
    private HashSet<String> set;

    public GestorColores(){
        this.set = new HashSet<String>();
    }
    public HashSet<String> getSet() {
        return this.set;
    }
    public void createColor(String color){
        this.set.add(color);
    }
    public static void showColors(GestorColores colors) {
        System.out.println(colors.getSet()+"\n");
    }
    public Boolean searchColors(){
        String color;
        System.out.println("¿Que color quieres buscar?");
        Scanner a = new Scanner(System.in);
        color = a.next();
        return this.set.contains(color);
    }
}
