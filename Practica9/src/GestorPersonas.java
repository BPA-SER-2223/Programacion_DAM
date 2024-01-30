public class GestorPersonas {
    private String name;
    private Integer age;

    public GestorPersonas(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public String get_name(){return this.name;}
    public void set_name(String name){this.name = name;}
    public Integer get_age(){return this.age;}
    public void set_age(Integer age){this.age = age;}

    public static void create_People(){

    }
}
