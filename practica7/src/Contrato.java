import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Contrato {
    private LocalDate fecha_creacion;
    private Medico medicos;
    private Hospital hospitales;

    public Contrato(LocalDate fecha_creacion_c, Medico medicos_c, Hospital hospitales_c){
        this.fecha_creacion = fecha_creacion_c;
        this.medicos = medicos_c;
        this.hospitales = hospitales_c;
    }
    public LocalDate getFecha_creacion(){return this.fecha_creacion;}
    public void setFecha_creacion(LocalDate fecha_creacion_c){this.fecha_creacion = fecha_creacion_c;}
    public  Medico getDatos_medicos(){return  this.medicos;}
    public void setDatos_medicos(Medico medicos_c){this.medicos = medicos_c;}
    public Hospital getHospitales(){return this.hospitales;}
    public void setHospitales(Hospital hospitales_c){this.hospitales = hospitales_c;}

    @Override
    public String toString() {
        return  "fecha de creacion: " + fecha_creacion +
                "\n---------------\n" +
                "Médico\n" +
                "---------------\n" +
                "Dni: " + medicos.getDni() + "\n" +
                "Nombre: " + medicos.getNombre() + "\n" +
                "Edad: " + medicos.getEdad() + "\n" +
                "Sexo: " + medicos.getSexo() + "\n" +
                "---------------\n" +
                "Hospital:\n" +
                "---------------\n" +
                "Nombre:" + hospitales.getNombre() + "\n" +
                "Cif:" + hospitales.getCif() + "\n" +
                "\n";
    }

    public static void creation_Contrato(ArrayList<Hospital> list_Hospitales,ArrayList<Contrato> list_Contratos, ArrayList<Medico> list_Medicos){
        Scanner new_Contratos = new Scanner(System.in);
        System.out.print("Indica la fecha de creación del contrato\nNota:El formato de la fecha debe ser 4 dígitos(año)-2 dígitos(mes)-2 dígitos(día): ");
        LocalDate fecha_creacion = LocalDate.parse(new_Contratos.next());
        System.out.print("Introduce datos relevantes: ");
        String datos = new_Contratos.next();
        System.out.print("Elige el hospital al que pertenece el contrato\n");
        for(int i=0;i<list_Hospitales.size();i++){
            System.out.println("\t"+(i+1)+"-"+list_Hospitales.get(i).getNombre());
        }
        int hospital = new_Contratos.nextInt();

        System.out.println("Indica el médico relacionado a este contrato: ");
        for (int i=0;i<list_Medicos.size();i++){
            System.out.println("\t"+(i+1)+"-"+list_Medicos.get(i).getNombre());
        }
        int num_medico = new_Contratos.nextInt();

        Contrato contrato3 = new Contrato(fecha_creacion,list_Medicos.get(num_medico-1),list_Hospitales.get(hospital-1));
        list_Contratos.add(contrato3);

        System.out.println("¡Contrato creado!\n");
    }

    public static void contratos_2023(ArrayList<Contrato> list_Contratos){
        for (Contrato listContrato : list_Contratos) {
            if (listContrato.fecha_creacion.getYear() == 2023) {
                System.out.println(listContrato);
            }
        }
    }
}
