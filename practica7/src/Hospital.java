public class Hospital {
    private String nombre;
    private String cif;
    private String direccion;

    public Hospital(String nombre_h, String cif_h, String direccion_h){
        this.nombre = nombre_h;
        this.cif = cif_h;
        this.direccion = direccion_h;
    }
    public String getnombre_h(){return this.nombre;}
    public void setnombre_h(String nombre_h){this.nombre = nombre_h;}
    public String getcif_h(){return this.cif;}
    public void setcif_h(String cif_h){this.cif = cif_h;}
    public String getdireccion_h(){return this.cif;}
    public void setdireccion_h(String direccion_h){this.direccion = direccion_h;}
}
