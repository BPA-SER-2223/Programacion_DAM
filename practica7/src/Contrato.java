import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Contrato {
    private LocalDate fecha_creacion;
    private String datos_medicos;
    private Hospital hospitales;

    public Contrato(LocalDate fecha_creacion_c, String datos_medicos_c, Hospital hospitales_c){
        this.fecha_creacion = fecha_creacion_c;
        this.datos_medicos = datos_medicos_c;
        this.hospitales = hospitales_c;
    }
    public LocalDate getFecha_creacion(){return this.fecha_creacion;}
    public void setFecha_creacion(LocalDate fecha_creacion_c){this.fecha_creacion = fecha_creacion_c;}
    public  String getDatos_medicos(){return  this.datos_medicos;}
    public void setDatos_medicos(String datos_medicos_c){this.datos_medicos = datos_medicos_c;}
    public Hospital getHospitales(){return this.hospitales;}
    public void setHospitales(Hospital hospitales_c){this.hospitales = hospitales_c;}

    int contratos=0;
    public int getContratos_2023(ArrayList<Contrato> Contratos){
        int contador=0;
        for(int i=0;i<=Contratos.size();i++)
            if(Contratos.get(i).fecha_creacion.getYear()==2023){
                contador++;
            }
        return contador;
    }

    @Override
    public String toString() {
        return "\nContratos\n\t" +
                "fecha de creacion: " + fecha_creacion +
                "\n\tdatos medicos: " + datos_medicos + '\n' +
                "\t---------------" +
                "\n\t" + hospitales +
                "\n\n";
    }

    Scanner new_Contratos = new Scanner(System.in);

    public void creation_Contrato(ArrayList<Hospital> list_Hospitales,ArrayList<Contrato> list_Contratos){
        System.out.print("Indica la fecha de creación del contrato\nNota:El formato de la fecha debe ser 4 dígitos(año)-2 dígitos(mes)-2 dígitos(día):");
        LocalDate fecha_creacion = LocalDate.parse(new_Contratos.next());
        System.out.print("Introduce datos relevantes: ");
        String datos = new_Contratos.next();
        System.out.print("Elige el hospital al que pertenece el contrato\n");
        for(int i=0;i<list_Hospitales.size();i++){
            System.out.println("\t"+(i+1)+"-"+list_Hospitales.get(i).getNombre());
        }
        int hospital = new_Contratos.nextInt();

        Contrato contrato3 = new Contrato(fecha_creacion,datos,list_Hospitales.get(hospital-1));
        list_Contratos.add(contrato3);

        System.out.println("¡Contrato creado!\n");
    }

    public void contratos_2023(ArrayList<Contrato> list_Contratos){
        for (Contrato listContrato : list_Contratos) {
            if (listContrato.fecha_creacion.getYear() == 2023) {
                System.out.println(listContrato);
            }
        }
    }
}
