public class Contrato {
    private String fecha_creacion;
    private String datos_medicos;
    private Hospital hospitales;

    public Contrato(String fecha_creacion_c, String datos_medicos_c, Hospital hospitales_c){
        this.fecha_creacion = fecha_creacion_c;
        this.datos_medicos = datos_medicos_c;
        this.hospitales = hospitales_c;
    }
    public String getFecha_creacion(){return this.fecha_creacion;}
    public void setFecha_creacion(String fecha_creacion_c){this.fecha_creacion = fecha_creacion_c;}
    public  String getDatos_medicos(){return  this.datos_medicos;}
    public void setDatos_medicos(String datos_medicos_c){this.datos_medicos = datos_medicos_c;}
    public Hospital getHospitales(){return this.hospitales;}
    public void setHospitales(Hospital hospitales_c){this.hospitales = hospitales_c;}

}
