import java.util.ArrayList;
import java.util.Scanner;

public class Persona implements Humano {
    private String dni;
    private String nombre;
    private Integer edad;
    private String sexo;

    public Persona(String dni_p, String nombre_p, Integer edad_p, String sexo_p) {
        this.dni = dni_p;
        this.nombre = nombre_p;
        this.edad = edad_p;
        this.sexo = sexo_p;
    }

    public String getDni() {
        return this.dni;
    }

    public void getDni(String dni_p) {
        this.dni = dni_p;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre_p) {
        this.nombre = nombre_p;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad_p) {
        this.edad = edad_p;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo_p) {
        this.sexo = sexo_p;
    }

    @Override
    public String toString() {
        return "---------------\nPersona\n---------------\n" +
                "\tdni: " + dni + '\n' +
                "\tnombre: " + nombre + '\n' +
                "\tedad: " + edad + '\n' +
                "\tsexo: " + sexo + '\n';
    }

    Scanner new_Personas = new Scanner(System.in);

    public void creation_persona(ArrayList<Persona> list_Personas){
        System.out.print("Introduce el dni de la persona: ");
        String dni = new_Personas.next();
        System.out.print("Introduce el nombre de la persona: ");
        String nombre = new_Personas.next();
        System.out.print("Introduce la edad de la persona: ");
        int edad = new_Personas.nextInt();
        System.out.print("Introduce el sexo de la persona: ");
        String sexo = new_Personas.next();

        Persona persona2=new Persona(dni,nombre,edad,sexo);

        list_Personas.add(persona2);
        System.out.println("¡Persona creada!\n");
    }
}