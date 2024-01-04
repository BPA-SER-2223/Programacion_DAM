import java.util.ArrayList;

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
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public void Information_Personas(String inicio_2, String[] dni_personas, ArrayList<Persona> list_Personas) {
        int no=0;
        for (int i = 0; i < dni_personas.length; i++) {
            if (inicio_2.equals(dni_personas[i])) {

                System.out.println(list_Personas.get(i));
                no++;
                break;
            }
            if (no==0){

                System.out.println("No existe la persona asociada al dni introducido.");
                break;
            }
        }
    }
}