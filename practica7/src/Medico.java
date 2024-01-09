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
        return  "---------------\nMédico\n---------------" + "\n" +
                "nombre: " + getNombre() + "\n" +
                "edad: " + getEdad() + "\n" +
                "sexo: " + getSexo() + "\n" +
                "sueldo: " + sueldo + "€\n" +
                "fecha: " + fecha + "\n\n" +
                area + "\n" +
                "--direccion:" + direccion + "\n" +
                "----------------------------" + "\n" +
                "Información útil del médico\n" +
                "----------------------------";
    }

    public void Information_Medicos(String inicio_2, ArrayList<Medico> list_Medicos, ArrayList<Persona> list_Personas) {
        int no=0;
        for (int i = 0; i < list_Medicos.size(); i++) {
            if (inicio_2.equals(list_Medicos.get(i).getDni())) {

                DecimalFormat num = new DecimalFormat("#.00");//Acción que nos permite limitar los decimales de un double
                System.out.println(list_Medicos.get(i));
                System.out.println("El medico tiene una antiguedad de " + list_Medicos.get(i).getAntiguedad() + " años");
                System.out.println("El sueldo neto de este médico es: "+list_Medicos.get(i).getSueldo_neto()+"€ -> "+num.format(list_Medicos.get(i).getSueldo_neto())+"€\n");
                no++;
                break;
            }
        }
        if(no==0){
            Information_Personas(inicio_2, list_Personas);
        }
    }
    public static void creation_Medicos(ArrayList<Area> list_Area, ArrayList<Direccion> list_Direcciones_Personas, ArrayList<Medico> list_Medicos){
        Scanner new_Medicos = new Scanner(System.in);
        System.out.print("Introduce el dni del médico: ");
        String dni = new_Medicos.next();
        System.out.print("Introduce el nombre del médico: ");
        String nombre = new_Medicos.next();
        System.out.print("Introduce la edad del médico: ");
        int edad = new_Medicos.nextInt();
        System.out.print("Introduce el género del médico: ");
        String sexo = new_Medicos.next();
        System.out.print("Introduce el sueldo del médico(Nota: el formato del sueldo debe ser indicado con decimales, formato: 0,0): ");
        double sueldo = new_Medicos.nextDouble();
        System.out.print("Introduce la fecha de incorporación del médico\nNota:El formato de la fecha debe ser 4 dígitos(año)-2 dígitos(mes)-2 dígitos(día): ");
        LocalDate fecha_entrada = LocalDate.parse(new_Medicos.next());
        System.out.println("Elige el area al que está asignado el médico: ");
        for(int i=0;i<list_Area.size();i++){
            System.out.println("\t"+(i+1)+"-"+list_Area.get(i).getNombre());
        }
        int elec_area = new_Medicos.nextInt();
        Area area_medico = list_Area.get(elec_area);
        System.out.println("Elige la dirección del médico(Nota:si la dirección no aparece, recuerda que primero tienes que crearla):");
        for(int i=0;i<list_Direcciones_Personas.size();i++){
            System.out.println("\t"+(i+1)+"-"+list_Direcciones_Personas.get(i).getcalle_d());
        }
        int elec_direc = new_Medicos.nextInt();

        Medico medico3 = new Medico(dni,nombre,edad,sexo,sueldo,fecha_entrada,list_Area.get(elec_area-1),list_Direcciones_Personas.get(elec_direc-1));
        list_Medicos.add(medico3);
        System.out.println("¡Médico creado!\n");
    }
}

