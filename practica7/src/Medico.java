import java.time.LocalDate;

public class Medico extends Persona {
    private Double sueldo;
    private LocalDate fecha;
    private Area area;
    private Direccion direccion;

    public Medico(String dni,String nombre, Integer edad, String sexo, Double sueldo_m, LocalDate fecha_m, Area area_m, Direccion direccion){
        super(dni, nombre, edad, sexo);
        this.sueldo = sueldo_m;
        this.fecha = fecha_m;
        this.area = area_m;
        this.direccion = direccion;
    }

    public Double getsueldo_m(){return this.sueldo;}
    public void setsueldo_m(Double sueldo_m){this.sueldo = sueldo_m;}
    public LocalDate getfecha_m(){return this.fecha;}
    public void setfecha_m(LocalDate fecha_m){this.fecha = fecha_m;}
    public Area getarea_m(){return this.area;}
    public void setarea_m(Area area_m){this.area = area_m;}



}
