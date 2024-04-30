public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer edad;

    public Persona (String p_nombre, String p_apellido1, String p_apellido2, int p_edad){
        this.nombre = p_nombre;
        this.apellido1 = p_apellido1;
        this.apellido2 = p_apellido2;
        this.edad = p_edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    public String getApellido1(){
        return this.apellido1;
    }

    public void setApellido1(String p_apellido1){
        this.apellido1 = p_apellido1;
    }

    public String getApellido2(){
        return this.apellido2;
    }

    public void setApellido2(String p_apellido2){
        this.apellido2 = p_apellido2;
    }

    public Integer getEdad(){
        return this.edad;
    }

    public void setEdad(Integer p_edad){
        this.edad = p_edad;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", edad=" + edad +
                '}';
    }
}
