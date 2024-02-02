import java.util.HashMap;
import java.util.Scanner;

public class GestorPersonas {
    private HashMap<String, Integer> map;

    public GestorPersonas(){
        this.map = new HashMap<>();
    }

    public HashMap<String, Integer> getMap() {
        return this.map;
    }
    public void createPersona(String name, Integer age){
        this.map.put(name, age);
    }
    public static void showPersona(GestorPersonas gestor) {
        System.out.println(gestor.getMap().entrySet()+"\n");
    }
    public Boolean searchPersona(){
        String name;
        System.out.println("¿Que persona quieres buscar?");
        Scanner a = new Scanner(System.in);
        name = a.next();
        return this.map.containsKey(name);
    }
}