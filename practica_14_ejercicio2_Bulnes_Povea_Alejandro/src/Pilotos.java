import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.util.Scanner;

public class Pilotos {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Integer p_clasificacion;
    public Pilotos(String nombre, String apellido, String nacionalidad, Integer p_clasificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.p_clasificacion = p_clasificacion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){this.apellido = apellido;}
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public Integer getP_clasificacion(){
        return this.p_clasificacion;
    }
    public void setP_clasificacion(Integer p_clasificacion){
        this.p_clasificacion = p_clasificacion;
    }
    public static void a(ObjectContainer db) {
        Scanner a = new Scanner(System.in);
        int infinite = 0;
        int count = 0;
        while (infinite != 1) {
            count++;
            System.out.println("Piloto " + count);
            System.out.print("\tIntroduce el nombre del piloto: ");
            String nombre = a.next();
            System.out.print("\tIntroduce los apellidos del piloto: ");
            String apellidos = a.next();
            System.out.print("\tIntroduce la nacionalidad del piloto: ");
            String nacionalidad = a.next();
            System.out.print("\tIntroduce los puntos de calificación del piloto: ");
            int p_calidicacion = a.nextInt();

            Pilotos piloto = new Pilotos(nombre, apellidos, nacionalidad, p_calidicacion);
            db.store(piloto);
            if (count >= 10) {
                System.out.println("¿Quieres crear algún piloto más?");
                String answer = a.next();
                if (answer.equals("No") || answer.equals("no")) {
                    break;
                }
            }
        }
    }

    public static void seachPiloto(Scanner a, ObjectContainer db, Pilotos pilotoejemplo, ObjectSet personac) {
        System.out.println("A.-Buscar por campo\nB.-Budcar por piloto");
        String selection = a.next();
        if (selection.equals("A") || selection.equals("a")) {
            System.out.println("Campos:\n\t1.Nombre\n\t2.Apellido\n\t3.Nacionalidad\n\t4.-Puntos de clasificación");
            int selection2 = a.nextInt();
            switch (selection2) {
                case 1:
                    System.out.print("Escribe el nombre: ");
                    String name = a.next();
                    pilotoejemplo = new Pilotos(name, null, null, null);
                    personac = db.queryByExample(pilotoejemplo);
                    while (personac.hasNext()) {
                        Pilotos piloto = (Pilotos) personac.next();
                        System.out.println(piloto);
                    }
                    break;
                case 2:
                    System.out.print("Escribe el apellido: ");
                    String apellido = a.next();
                    pilotoejemplo = new Pilotos(null, apellido, null, null);
                    personac = db.queryByExample(pilotoejemplo);
                    while (personac.hasNext()) {
                        Pilotos piloto = (Pilotos) personac.next();
                        System.out.println(piloto);
                    }
                    break;
                case 3:
                    System.out.print("Escribe la nacionalidad: ");
                    String nacionalidad = a.next();
                    pilotoejemplo = new Pilotos(null, null, nacionalidad, null);
                    personac = db.queryByExample(pilotoejemplo);
                    while (personac.hasNext()) {
                        Pilotos piloto = (Pilotos) personac.next();
                        System.out.println(piloto);
                    }
                    break;
                case 4:
                    System.out.print("Escribe los puntos de clasificación: ");
                    int p_clasificacion = a.nextInt();
                    pilotoejemplo = new Pilotos(null, null, null, p_clasificacion);
                    personac = db.queryByExample(pilotoejemplo);
                    while (personac.hasNext()) {
                        Pilotos piloto = (Pilotos) personac.next();
                        System.out.println(piloto);
                    }
                    break;
            }
        }else{
            System.out.print("\tIntroduce el nombre del piloto: ");
            String nombre = a.next();
            System.out.print("\tIntroduce el apellido del piloto: ");
            String apellido = a.next();
            System.out.print("\tIntroduce la nacionalidad del piloto: ");
            String nacionalidad = a.next();
            System.out.print("\tIntroduce los puntos de calificación del piloto: ");
            int p_calidicacion = a.nextInt();
            System.out.println("\nResultado: ");
            pilotoejemplo = new Pilotos(nombre, apellido, nacionalidad, p_calidicacion);
            personac = db.queryByExample(pilotoejemplo);
            while (personac.hasNext()) {
                Pilotos piloto = (Pilotos) personac.next();
                System.out.println(piloto);
            }
        }
    }
    public static void upfatePiloto(Scanner a, ObjectSet personac, Pilotos pilotoejemplo, int count, ObjectContainer db){
        System.out.print("¿Cuantos campos quieres actualizar?");
        int campo = a.nextInt();
        int selection2;

        for (int i=0;i<campo;i++) {
            System.out.println("¿Que campo quieres actualizar?\n\t1.Nombre\n\t2.Apellido\n\t3.Nacionalidad\n\t4.-Puntos de clasificación");
            int selection = a.nextInt();
            Pilotos cambio;
            switch (selection) {
                case 1:
                    count = 0;
                    System.out.println("\n¿De quienes de estos pilotos le vás a cambiar el campo Nombre?");
                    pilotoejemplo = new Pilotos(null, null, null, null);
                    personac = db.queryByExample(pilotoejemplo);
                    while (personac.hasNext()) {
                        count++;
                        Pilotos piloto = (Pilotos) personac.next();
                        System.out.println("\t" + count + "-" + piloto);
                    }
                    selection2 = a.nextInt();
                    cambio = (Pilotos) personac.get(selection2-1);
                    System.out.print("Introduce el nuvo nombre del piloto: ");
                    String name = a.next();
                    cambio.setNombre(name);
                    break;
                case 2:
                    count = 0;
                    System.out.println("\n¿De quienes de estos pilotos le vás a cambiar el campo Apellido?");
                    pilotoejemplo = new Pilotos(null, null, null, null);
                    personac = db.queryByExample(pilotoejemplo);
                    while (personac.hasNext()) {
                        count++;
                        Pilotos piloto = (Pilotos) personac.next();
                        System.out.println("\t" + count + "-" + piloto);
                    }
                    selection2 = a.nextInt();
                    cambio = (Pilotos) personac.get(selection2-1);
                    System.out.print("Introduce el nuvo nombre del piloto: ");
                    String apellido = a.next();
                    cambio.setApellido(apellido);
                    break;
                case 3:
                    count = 0;
                    System.out.println("\n¿De quienes de estos pilotos le vás a cambiar el campo Macionalidad?");
                    pilotoejemplo = new Pilotos(null, null, null, null);
                    personac = db.queryByExample(pilotoejemplo);
                    while (personac.hasNext()) {
                        count++;
                        Pilotos piloto = (Pilotos) personac.next();
                        System.out.println("\t" + count + "-" + piloto);
                    }
                    selection2 = a.nextInt();
                    cambio = (Pilotos) personac.get(selection2-1);
                    System.out.print("Introduce el nuvo nombre del piloto: ");
                    String nacionalidad = a.next();
                    cambio.setNacionalidad(nacionalidad);
                    break;
                case 4:
                    count = 0;
                    System.out.println("\n¿De quienes de estos pilotos le vás a cambiar el campo Macionalidad?");
                    pilotoejemplo = new Pilotos(null, null, null, null);
                    personac = db.queryByExample(pilotoejemplo);
                    while (personac.hasNext()) {
                        count++;
                        Pilotos piloto = (Pilotos) personac.next();
                        System.out.println("\t" + count + "-" + piloto);
                    }
                    selection2 = a.nextInt();
                    cambio = (Pilotos) personac.get(selection2-1);
                    System.out.print("Introduce el nuvo nombre del piloto: ");
                    int p_clasificacion = a.nextInt();
                    cambio.setP_clasificacion(p_clasificacion);
                    break;
            }
        }
    }
    public static void droppPiloto(int count, Pilotos pilotoejemplo, ObjectSet personac, ObjectContainer db, Scanner a){
        count = 0;
        System.out.println("\n¿Que piloto quieres eliminar?");
        pilotoejemplo = new Pilotos(null, null, null, null);
        personac = db.queryByExample(pilotoejemplo);
        while (personac.hasNext()) {
            count++;
            Pilotos piloto = (Pilotos) personac.next();
            System.out.println("\t" + count + "-" + piloto);
        }
        int piloto = a.nextInt();
        Pilotos cambio = (Pilotos) personac.get(piloto-1);
        db.delete(cambio);
    }
    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", apellidos='" + apellido +
                ", nacionalidad='" + nacionalidad +
                ", p_clasificacion=" + p_clasificacion;
    }
}