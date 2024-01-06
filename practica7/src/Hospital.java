import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private String nombre;
    private String cif;
    private Direccion direccion;
    private Area area;

    public Hospital(String nombre_h, String cif_h, Direccion direccion){
        this.nombre = nombre_h;
        this.cif = cif_h;
        this.direccion = direccion;
    }
    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre_h){this.nombre = nombre_h;}
    public String getCif(){return this.cif;}
    public void setCif(String cif_h){this.cif = cif_h;}
    public String getDireccion(){return this.cif;}
    public void setDireccion(String direccion_h){this.direccion = direccion;}

    @Override
    public String toString() {
        return  "\t--hospital:" +
                "\n\t\tnombre: " + nombre + "\n" +
                "\t\tcif: " + cif + "\n\n" +
                "\t--direccion: " + direccion;
    }

    Scanner new_Hospital = new Scanner(System.in);
    public void creation_Hospital(ArrayList<Direccion> list_Direcciones_Hospitales, ArrayList<Hospital> list_Hospitales){
        System.out.print("Escribe el nombre del hospital:");
        String nombre=new_Hospital.next();
        System.out.print("Escribe el cif del hospital:");
        String cif=new_Hospital.next();

        System.out.println("Elige una de estas direcciones para el hospital: ");
        for(int i=0;i<list_Hospitales.size();i++) {
            System.out.println("\t"+(i+1)+"-"+list_Direcciones_Hospitales.get(i).getcalle_d());
        }
        int j=new_Hospital.nextInt();

        Hospital hospital = new Hospital(nombre,cif,list_Direcciones_Hospitales.get(j-1));
        list_Hospitales.add(hospital);
        System.out.println("¡Hospital creado!\n");
    }
}
