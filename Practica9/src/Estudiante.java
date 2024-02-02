public class Estudiante {
    private String name;
    private Integer identifier;
    public Estudiante(String name, Integer identifier){
        this.name = name;
        this.identifier = identifier;
    }
    public String get_Name(){return this.name;}
    public void set_Name(String name){this.name = name;}

    public Integer get_Identificate(){return this.identifier;}
    public void set_Identificate(Integer identificate){this.identifier = identificate;}

    @Override
    public String toString() {
        return "\nEstudiante:\n" +
                "\tname=" + name +
                "\n\tidentifier=" + identifier + "\n";
    }
}
