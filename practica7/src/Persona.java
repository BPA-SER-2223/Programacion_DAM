public class Persona implements Humano{
    private String dni;
    private String nombre;
    private Integer edad;
    private String sexo;

    public Persona(String dni_p,String nombre_p,Integer edad_p,String sexo_p) {
        this.dni = dni_p;
        this.nombre = nombre_p;
        this.edad = edad_p;
        this.sexo = sexo_p;
    }
    public String getdni_p(){return this.dni;}
    public void setdni_p(String dni_p){this.dni = dni_p;}
    public String getnombre_p(){return this.nombre;}
    public void setnombre_p(String nombre_p){this.nombre = nombre_p;}
    public Integer getedad_p(){return this.edad;}
    public void setedad_p(Integer edad_p){this.edad = edad_p;}
    public String getsexo_p(){return this.sexo;}
    public void setsexo_p(String sexo_p){this.sexo = sexo_p;}
}
