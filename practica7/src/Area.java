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

    public static void comparation_Area(ArrayList<Area> list_Area) {
        Scanner selec_Area = new Scanner(System.in);
        System.out.println("Elige dos areas");
        for(int i=0;i<list_Area.size();i++){
            System.out.println("\t"+(i+1)+"-"+list_Area.get(i).getNombre());
        }
        System.out.print("\n1º selección: ");
        int selec1 = selec_Area.nextInt();

        if (selec1 < 1 || selec1 > list_Area.size()) {
            while (selec1 < 1 || selec1 > list_Area.size()) {
                System.out.print("Introduce un número del 1 al "+list_Area.size()+": ");
                selec1 = selec_Area.nextInt();
            }
        }

        System.out.print("2º selección: ");
        int selec2 = selec_Area.nextInt();

        if (selec2 < 1 || selec2 > list_Area.size()) {
            while (selec2 < 1 || selec2 > list_Area.size()) {
                System.out.print("Introduce un número del 1 al "+list_Area.size()+": ");
                selec2 = selec_Area.nextInt();
            }
        }

        int num = list_Area.get(selec1-1).getNumMedicos().compareTo(list_Area.get(selec2-1).getNumMedicos());

        if (num == -1) {
            System.out.println("---------------------------------\nLa 2º selección tiene más médicos\n---------------------------------\n");
        } else {
            if (num == 1) {
                System.out.println("---------------------------------\nLa 1º selección tiene más médicos\n---------------------------------\n");
            }else{
                System.out.println("---------------------------------\nTienen el mismo número de médicos\n---------------------------------\n");
            }
        }

    }

    @Override
    public String toString() {
        return  "--area:\n" +
                "\tnombre:" + nombre + '\n' +
                "\tidentificador: " + identificador + '\n' +
                "\tplanta: " + planta + "\n" +
                "\tnum_medicos: " + num_medicos + "\n\n" +
                hospital + '\n';
    }


    public static void creation_Area(ArrayList<Hospital> list_Hospitales, ArrayList<Area> list_Area) {
        Scanner new_Area = new Scanner(System.in);
        System.out.print("Introduce el nombre del area: ");
        String nombre = new_Area.next();
        System.out.print("Introduce el identificador del area: ");
        int identificador = new_Area.nextInt();
        System.out.print("Introduce la planta a la que pertenece el area: ");
        int planta = new_Area.nextInt();
        System.out.print("Elige el hospital asociado al area: 'Nota: si el hospital no aparece, recuerda que tienes que crearlo primero.'\n");
        for (int i = 0; i < list_Hospitales.size(); i++) {
            System.out.println("\t" + (i + 1) + "-" + list_Hospitales.get(i).getNombre());
        }
        int j = new_Area.nextInt();
        System.out.print("Introduce el número de médicos asociado a este area: ");
        int num_medicos = new_Area.nextInt();

        Area area3 = new Area(nombre, identificador, planta, list_Hospitales.get(j-1), num_medicos);
        list_Area.add(area3);

        System.out.println("¡Area creada!\n");
    }
}
