import com.db4o.*;
import java.util.Scanner;

public class Pilotos {
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private Integer p_clasificacion;
    public Pilotos(String nombre, String apellidos, String nacionalidad, Integer p_clasificacion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.p_clasificacion = p_clasificacion;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public Integer getP_clasificacion(){
        return this.p_clasificacion;
    }
    public void setNombre(Integer p_clasificacion){
        this.p_clasificacion = p_clasificacion;
    }
    public static void createPilots(ObjectContainer bd){
        Scanner a = new Scanner(System.in);
        int infinite = 0;
        int count = 0;
        while (infinite != 1){
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
            bd.store(piloto);
            if(count >= 10){
                System.out.println("¿Quieres crear algún piloto más?");
                String answer = a.next();
                if(answer.equals("No") || answer.equals("no")){
                    break;
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Pilotos{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", p_clasificacion=" + p_clasificacion +
                '}';
    }
}
