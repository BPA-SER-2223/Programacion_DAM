import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Area {
    private String nombre;
    private Integer identificador;
    private Integer planta;
    private Hospital hospital;
    private Integer num_medicos;

    public Area(String nombre_a, Integer identificador_a, Integer planta_a, Hospital hospital_a, Integer num_medicos_a) {
        this.nombre = nombre_a;
        this.identificador = identificador_a;
        this.planta = planta_a;
        this.hospital = hospital_a;
        this.num_medicos = num_medicos_a;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre_a) {
        this.nombre = nombre_a;
    }

    public Integer getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(Integer identificador_a) {
        this.identificador = identificador_a;
    }

    public Integer getPlanta() {
        return this.planta;
    }

    public void setPlanta(Integer planta_a) {
        this.planta = planta_a;
    }

    public Hospital getHospital() {
        return this.hospital;
    }

    public void setHospital(Hospital hospital_a) {
        this.hospital = hospital_a;
    }

    public Integer getNumMedicos() {
        return this.num_medicos;
    }

    public String compareTo(Area area_nueva) {
        int num = this.getNumMedicos().compareTo(area_nueva.getNumMedicos());
        String men = null;

        if (num == -1) {
            men = "El area2 tiene más médicos";
        } else {
            men = "El area1 tiene más médicos";
        }
        return men;
    }

    @Override
    public String toString() {
        return "\n\tnombre:" + nombre + '\n' +
                "\tidentificador=" + identificador + '\n' +
                "\tplanta=" + planta + "\n" +
                "\tnum_medicos=" + num_medicos + "\n\n" +
                "\t--hospital:" + hospital + '\n';
    }

    Scanner new_Area = new Scanner(System.in);

    public void creation_Area(ArrayList<Hospital> list_Hospitales) {
        System.out.print("Introduce el nombre del area:");
        String nombre = new_Area.next();
        System.out.print("Introduce el identificador del area:");
        int identificador = new_Area.nextInt();
        System.out.print("Introduce la planta a la que pertenece el area;");
        int planta = new_Area.nextInt();
        System.out.print("Elige el hospital asociado al area: 'Nota: si el hospital no aparece, recuerda que tienes que crearlo primero.'");
        for (int i = 0; i < list_Hospitales.size(); i++) {
            System.out.println("\t" + (i + 1) + "-" + list_Hospitales.get(i));
        }
        int hospital = new_Area.nextInt();
        System.out.print("Introduce el número de médicos asociado a este area");
        int num_medicos = new_Area.nextInt();

        Area area = new Area(nombre, identificador, planta, list_Hospitales.get(hospital), num_medicos);

    }
}
