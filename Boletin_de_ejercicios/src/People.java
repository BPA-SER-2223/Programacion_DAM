import java.util.List;
import java.util.Scanner;

public class People {
    private String name;
    private String subname;
    private String gender;
    private Integer age;

    public People(String name, String subname, String gender, Integer age){
        this.name = name;
        this.subname = subname;
        this.gender = gender;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSubname(){
        return this.subname;
    }
    public void setSubname(String subname){
        this.subname = subname;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    public static void fivePeoples(List<People> peoples){

        Scanner a = new Scanner(System.in);

        for(int i=0;i<5;i++){

            System.out.print("\nIntroduce el nombre de la "+(i+1)+"ª persona: ");
            String name = a.next();
            System.out.print("Introduce el Apellido de la "+(i+1)+"ª persona: ");
            String subname = a.next();
            System.out.print("Introduce el género de la "+(i+1)+"ª persona: ");
            String gerder = a.next();
            System.out.print("Introduce la edad de la "+(i+1)+"ª persona: ");
            int age = a.nextInt();

            People people = new People(name, subname, gerder, age);

            peoples.add(people);
        }

        for(int i=0;i<5;i++) {
            System.out.println(
                    "\nPersona "+(i+1)+
                    ":\nNombre: "+peoples.get(i).name+
                    "\nApellido: "+peoples.get(i).subname+
                    "\nGénero: "+peoples.get(i).gender+
                    "\nEdad: "+peoples.get(i).age);
        }
    }

    public static void averageAge(List<People> peoples){
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+peoples.get(i).age;
        }
        System.out.println("\nPromedio de edades: "+sum/5+" años");
    }
    public static void male(List<People> peoples){
        int male=0;
        for(int i=0;i<5;i++){
            if(peoples.get(i).gender.equals("Masculino")){
                male++;
        }
        System.out.println("\nHay "+male+" personas masculinas");
        }
    }
    public static void woman(List<People> peoples){
        int woman=0;
        for(int i=0;i<5;i++){
            if(peoples.get(i).gender.equals("Femenino")){
                woman++;
            }
            System.out.println("\nHay "+woman+" personas femeninas");
        }
    }
}
