public class Empleados {
    private String name;
    private Double salary;
    public Empleados(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }
    public String get_Name(){return this.name;}
    public void set_Name(String name){this.name = name;}

    public Double get_Salary(){return this.salary;}
    public void set_Identificate(Double salary){this.salary = salary;}

    @Override
    public String toString() {
        return "\nEmpleado:\n" +
                "\tname=" + name + "\n" +
                "\tsalary=" + salary +
                "€\n";
    }
}
