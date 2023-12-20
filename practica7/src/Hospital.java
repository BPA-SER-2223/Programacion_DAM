public class Hospital {
    private String nombre;
    private String cif;
    private Direccion direccion;
    private Area area;

    public Hospital(String nombre_h, String cif_h, Direccion direccion){
        this.nombre = nombre_h;
        this.cif = cif_h;
        this.direccion = direccion;
    }
    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre_h){this.nombre = nombre_h;}
    public String getCif(){return this.cif;}
    public void setCif(String cif_h){this.cif = cif_h;}
    public String getDireccion(){return this.cif;}
    public void setDireccion(String direccion_h){this.direccion = direccion;}
}
