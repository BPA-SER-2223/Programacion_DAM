import java.awt.image.AreaAveragingScaleFilter;
import java.time.LocalDate;
import java.util.ArrayList;

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
                "fecha de creacion=" + fecha_creacion +
                "\n\tdatos medicos=" + datos_medicos + '\n' +
                "\t---------------" +
                "\n\t" + hospitales +
                "\n\n";
    }
}
