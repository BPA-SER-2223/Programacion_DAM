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
    public String getDni(){return this.dni;}
    public void getDni(String dni_p){this.dni = dni_p;}
    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre_p){this.nombre = nombre_p;}
    public Integer getEdaddad(){return this.edad;}
    public void setEdad(Integer edad_p){this.edad = edad_p;}
    public String getSexo(){return this.sexo;}
    public void setSexo(String sexo_p){this.sexo = sexo_p;}
}
