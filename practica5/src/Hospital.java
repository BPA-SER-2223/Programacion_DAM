public class Hospital {
    private String nombre;
    private String cif;
    private Direccion direccion;
    private Area area;

    public Hospital(String nombre_h, String cif_h, Direccion direccion, Area area){
        this.nombre = nombre_h;
        this.cif = cif_h;
        this.direccion = direccion;
        this.area = area;
    }
    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre_h){this.nombre = nombre_h;}
    public String getcif_h(){return this.cif;}
    public void setcif_h(String cif_h){this.cif = cif_h;}
    public String getdireccion_h(){return this.cif;}
    public void setdireccion_h(String direccion_h){this.direccion = direccion;}
    public Area getArea(){return this.area;}
}
