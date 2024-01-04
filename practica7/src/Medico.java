import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Medico extends Persona {
    private Double sueldo;
    private LocalDate fecha;
    private Area area;
    private Direccion direccion;

    public Medico(String dni, String nombre, Integer edad, String sexo, Double sueldo_m, LocalDate fecha_m, Area area_m, Direccion direccion) {
        super(dni, nombre, edad, sexo);
        this.sueldo = sueldo_m;
        this.fecha = fecha_m;
        this.area = area_m;
        this.direccion = direccion;
    }

    public Double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(Double sueldo_m) {
        this.sueldo = sueldo_m;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha_m) {
        this.fecha = fecha_m;
    }

    public Area getArea() {
        return this.area;
    }

    public void setArea(Area area_m) {
        this.area = area_m;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion() {
        this.direccion = direccion;
    }

    public int getAntiguedad() {
        return this.fecha.compareTo(LocalDate.now()) * -1;
    }

    public Double getSueldo_neto() {
        double sueldo_anual = this.sueldo * 12;
        double sueldo_neto = 0;

        if (sueldo_anual <= 12449) {
            sueldo_neto = (this.sueldo - (this.sueldo * 9.5 / 100));
        }
        if (sueldo_anual >= 12450 && sueldo_anual <= 20199) {
            sueldo_neto = (this.sueldo - (this.sueldo * 12 / 100));
        }
        if (sueldo_anual >= 20200 && sueldo_anual <= 35199) {
            sueldo_neto = (this.sueldo - (this.sueldo * 15 / 100));
        }
        if (sueldo_anual >= 35200 && sueldo_anual <= 59999) {
            sueldo_neto = (this.sueldo - (this.sueldo * 18.5 / 100));
        }
        if (sueldo_anual >= 60000 && sueldo_anual <= 299999) {
            sueldo_neto = (this.sueldo - (this.sueldo * 22.5 / 100));
        }
        if (sueldo_anual >= 300000) {
            sueldo_neto = (this.sueldo - (this.sueldo * 24.5 / 100));
        }

        return sueldo_neto;
    }

    @Override
    public String toString() {
        return "---------------\nMédico\n---------------" + "\n" +
                "sueldo=" + sueldo + "€\n" +
                "fecha=" + fecha + "\n\n" +
                "--area:" + area + "\n\n" +
                "--direccion:" + direccion + "\n" +
                "----------------------------" + "\n" +
                "Información útil del médico\n" +
                "----------------------------";
    }

    public void Information_Medicos(String inicio_2, ArrayList<Medico> list_Medicos, String[] dni_medicos, String[] dni_personas, ArrayList<Persona> list_Personas) {
        int no=0;
        for (int i = 0; i < dni_medicos.length; i++) {
            if (inicio_2.equals(dni_medicos[i])) {

                DecimalFormat num = new DecimalFormat("#.00");//Acción que nos permite limitar los decimales de un double
                System.out.println(list_Medicos.get(i));
                System.out.println("El medico tiene una antiguedad de " + list_Medicos.get(i).getAntiguedad() + " años");
                System.out.println("El sueldo neto de este médico es: "+list_Medicos.get(i).getSueldo_neto()+"€ -> "+num.format(list_Medicos.get(i).getSueldo_neto())+"€\n");
                no++;
                break;
            }
            }
        if(no==0){
            Information_Personas(inicio_2,dni_personas, list_Personas);
        }
    }
}
