import java.util.ArrayList;
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
    public static void showPersona() {

//        Integer age = this.map.get(name);
//
//        this.map.entrySet()
//        Sys
    }
    public Boolean searchPersona(String name){
        Scanner a = new Scanner(System.in);
        name = a.next();
        return this.map.containsKey(name);
    }
}
