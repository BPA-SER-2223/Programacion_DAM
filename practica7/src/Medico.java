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

        if(sueldo_anual<=12450){sueldo_neto=sueldo_anual-(this.sueldo*19/100);}
        if(sueldo_anual>=12450 && sueldo_anual<=20199){sueldo_neto=sueldo_anual-(this.sueldo*24/100);}
        if(sueldo_anual>=20200 && sueldo_anual<=35199){sueldo_neto=sueldo_anual-(this.sueldo*30/100);}
        if(sueldo_anual>=35200 && sueldo_anual<=59999){sueldo_neto=sueldo_anual-(this.sueldo*37/100);}
        if(sueldo_anual>=60.000 && sueldo_anual<=299.999){sueldo_neto=sueldo_anual-(this.sueldo*45/100);}
        if(sueldo_anual>=300.000){sueldo_neto=sueldo_anual-(this.sueldo*47/100);}

        return sueldo_neto;
    }
}
