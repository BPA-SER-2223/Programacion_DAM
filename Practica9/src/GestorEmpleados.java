import java.util.HashMap;
import java.util.Scanner;

public class GestorEmpleados {
    private HashMap<String, Empleados> map;

    public GestorEmpleados(){
        this.map = new HashMap<>();
    }

    public HashMap<String, Empleados> getMap() {
        return this.map;
    }
    public void createEmployees(String name, Empleados employees){
        this.map.put(name, employees);
    }
    public static void showEmployees(GestorEmpleados employees) {
        System.out.println(employees.getMap().entrySet()+"\n");
    }
    public Boolean searchEmployees(){
        String name;
        System.out.println("¿Que empleado quieres buscar?");
        Scanner a = new Scanner(System.in);
        name = a.next();
        return this.map.containsKey(name);
    }
}
