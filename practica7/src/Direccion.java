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
        return  "\n\t\tcalle=" + calle + '\n' +
                "\t\tnumero=" + numero + '\n' +
                "\t\tcodigo_postal=" + codigo_postal + '\n' +
                "\t\tlocalidad=" + localidad + '\n' +
                "\t\tprovincia=" + provincia;
    }
}
