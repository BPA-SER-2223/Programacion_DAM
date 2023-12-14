public class Contacto {
    private String fecha_creacion;
    private String datos_medicos;
    private String hospitales;

    public Contacto(String fecha_creacion_c, String datos_medicos_c, String hospitales_c){
        this.fecha_creacion = fecha_creacion_c;
        this.datos_medicos = datos_medicos_c;
        this.hospitales = hospitales_c;
    }
    public String getfecha_creacion_c(){return this.fecha_creacion;}
    public void setfecha_creacion_c(String fecha_creacion_c){this.fecha_creacion = fecha_creacion_c;}
    public  String getdatos_medicos_c(){return  this.datos_medicos;}
    public void setdatos_medicos(String datos_medicos_c){this.datos_medicos = datos_medicos_c;}
    public String gethospitales(){return this.hospitales;}
    public void sethospitales(String hospitales_c){this.hospitales = hospitales_c;}
}
