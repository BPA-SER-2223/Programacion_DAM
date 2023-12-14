public class Medico extends Persona {
    private Integer sueldo;
    private String fecha;
    private String area;
    public Medico(String dni,String nombre, Integer edad, String sexo, Integer sueldo_m, String fecha_m, String area_m){
        super(dni, nombre, edad, sexo);
        this.sueldo = sueldo_m;
        this.fecha = fecha_m;
        this.area = area_m;
    }
    public Integer getsueldo_m(){return this.sueldo;}
    public void setsueldo_m(Integer sueldo_m){this.sueldo = sueldo_m;}
    public String getfecha_m(){return this.fecha;}
    public void setfecha_m(String fecha_m){this.fecha = fecha_m;}
    public String getarea_m(){return this.area;}
    public void setarea_m(String area_m){this.area = area_m;}
}
