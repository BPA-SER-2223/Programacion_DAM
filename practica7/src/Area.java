public class Area{
    private String nombre;
    private Integer identificador;
    private Integer planta;
    private String hospital;

    public Area(String nombre_a, Integer identificador_a, Integer planta_a, String hospital_a){
        this.nombre = nombre_a;
        this.identificador = identificador_a;
        this.planta = planta_a;
        this.hospital = hospital_a;
    }
    public String getnombre_a(){return this.nombre;}
    public void setnombre_a(String nombre_a){this.nombre = nombre_a;}
    public Integer getidentificador_a(){return this.identificador;}
    public void setidentificador_a(Integer identificador_a){this.identificador = identificador_a;}
    public Integer getplanta_a(){return this.planta;}
    public void setplanta_a(Integer planta_a){this.planta = planta_a;}
    public String gethospital_a(){return this.hospital;}
    public void sethospital_a(String hospital_a){this.hospital = hospital_a;}
}