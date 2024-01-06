import java.util.ArrayList;
import java.util.Scanner;

public class Direccion {
    private String calle;
    private Integer numero;
    private Integer codigo_postal;
    private String localidad;
    private String provincia;

    public Direccion(String calle_d, Integer numero_d, Integer codigo_postal_d, String localidad_d, String provincia_d){
        this.calle = calle_d;
        this.numero = numero_d;
        this.codigo_postal = codigo_postal_d;
        this.localidad = localidad_d;
        this.provincia = provincia_d;
    }
    public String getcalle_d(){return this.calle;}
    public void setcalle_d(String calle_d){this.calle = calle_d;}
    public Integer getnumero_d(){return this.numero;}
    public void setnumero_d(Integer numero_d){this.numero = numero_d;}
    public Integer getcodigo_postal_d(){return this.codigo_postal;}
    public void setcodigo_postal_d(Integer codigo_postal_d){this.codigo_postal = codigo_postal_d;}
    public String getlocalidad_d(){return this.localidad;}
    public void setcodigo_postal_d(String localidad_d){this.localidad = localidad_d;}
    public String getprovinvia_d(){return this.provincia;}
    public void setlocalidad_d(String localidad_d){this.localidad = localidad_d;}

    @Override
    public String toString() {
        return  "\n\t\tcalle: " + calle + '\n' +
                "\t\tnumero: " + numero + '\n' +
                "\t\tcodigo_postal: " + codigo_postal + '\n' +
                "\t\tlocalidad: " + localidad + '\n' +
                "\t\tprovincia: " + provincia;
    }

    Scanner new_direcion = new Scanner(System.in);

    public void creation_Direcciones(ArrayList<Direccion> list_Direcciones_Personas,ArrayList<Direccion> list_Direcciones_Hospitales){
        System.out.print("Introduce la calle de la dirección:");
        String calle = new_direcion.next();
        System.out.print("Introduce el número de la dirección:");
        int numero = new_direcion.nextInt();
        System.out.print("Introduce el código postal de la dirección:");
        int codigo_postal = new_direcion.nextInt();
        System.out.print("Introduce la localidad de la dirección:");
        String localidad = new_direcion.next();
        System.out.print("Introduce la provinvia de la dirección:");
        String provincia = new_direcion.next();

        Direccion direccion3 = new Direccion(calle,numero,codigo_postal,localidad,provincia);

        System.out.println("Esta dirección es una dirección de 1.médico o de 2.hospital");
        int selection = new_direcion.nextInt();

        if(selection==1){
            list_Direcciones_Personas.add(direccion3);
        }else{
            list_Direcciones_Hospitales.add(direccion3);
        }

        System.out.println("¡Dirección creada!\n");

    }
}
