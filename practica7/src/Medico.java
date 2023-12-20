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

    public Double getSueldo(){return this.sueldo;}
    public void setSueldo(Double sueldo_m){this.sueldo = sueldo_m;}
    public LocalDate getFecha(){return this.fecha;}
    public void setFecha(LocalDate fecha_m){this.fecha = fecha_m;}
    public Area getArea(){return this.area;}
    public void setArea(Area area_m){this.area = area_m;}
    public Direccion getDireccion(){return this.direccion;}
    public void setDireccion(){this.direccion = direccion;}

    public int getAntiguedad(){
        return this.fecha.compareTo(LocalDate.now())*-1;
    }

    public Double getSueldo_neto(){
        double sueldo_anual=this.sueldo*12;
        double sueldo_neto=0;

        if(sueldo_anual<=12449){sueldo_neto=(this.sueldo-(this.sueldo*9.5/100));}
        if(sueldo_anual>=12450 && sueldo_anual<=20199){sueldo_neto=(this.sueldo-(this.sueldo*12/100));}
        if(sueldo_anual>=20200 && sueldo_anual<=35199){sueldo_neto=(this.sueldo-(this.sueldo*15/100));}
        if(sueldo_anual>=35200 && sueldo_anual<=59999){sueldo_neto=(this.sueldo-(this.sueldo*18.5/100));}
        if(sueldo_anual>=60000 && sueldo_anual<=299999){sueldo_neto=(this.sueldo-(this.sueldo*22.5/100));}
        if(sueldo_anual>=300000){
            sueldo_neto=(this.sueldo-(this.sueldo*24.5/100));
        }

        return sueldo_neto;
    }
}
