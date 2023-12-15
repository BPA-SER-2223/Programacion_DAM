import java.sql.Array;
import java.util.Scanner;

public class Area implements Comparable<Area> {
    private String nombre;
    private Integer identificador;
    private Integer planta;
    private String hospital;
    private Integer num_medicos;

    public Area(String nombre_a, Integer identificador_a, Integer planta_a, String hospital_a, Integer num_medicos_a){
        this.nombre = nombre_a;
        this.identificador = identificador_a;
        this.planta = planta_a;
        this.hospital = hospital_a;
        this.num_medicos = num_medicos_a;
    }
    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre_a){
        this.nombre = nombre_a;
    }
    public Integer getIdentificador() {
        return this.identificador;
    }
    public void setidentificador_a(Integer identificador_a) {
        this.identificador = identificador_a;
    }
    public Integer getplanta_a() {
        return this.planta;
    }
    public void setplanta_a(Integer planta_a) {
        this.planta = planta_a;
    }
    public String gethospital_a() {
        return this.hospital;
    }
    public void sethospital_a(String hospital_a) {
        this.hospital = hospital_a;
    }

    public Integer getNumMedicos() {
        return this.num_medicos;
    }
    @Override
    public int compareTo(Area area_nueva) {
        return this.getNumMedicos().compareTo(area_nueva.getNumMedicos());
    }

    public int comparableMultipleAreas(Area a1, Area a2) {
        return 0;
    }

//    static Area area1 = new Area("Quirófano",1234,1,"Santa lucía",9);
//    static Area area2 = new Area("Habitaciones",5678,2,"Santa lucía",11);

//    String[] Array = new ["Quirófano","1234","1","Santa lucía","9"];

//    public static void comparar_area(){
//
//        Scanner a=new Scanner(System.in);
//        String num1=a.next();
//
//        if(num_medicos > area2.num_medicos){
//            System.out.println("area1 tiene más médicos");
//        }else{
//            System.out.println("area2 tiene menos médicos");
//        }
//    }
}
