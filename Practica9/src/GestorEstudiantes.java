import java.util.HashSet;
import java.util.Scanner;

public class GestorEstudiantes {
    private HashSet<Estudiante> set;
<<<<<<< Updated upstream

    public GestorEstudiantes() {
        this.set = new HashSet<Estudiante>();
    }

    public HashSet<Estudiante> getSet() {
        return this.set;
    }

    public void createStudent(Estudiante student) {
        this.set.add(student);
    }

    public static void showStudent(GestorEstudiantes students) {
        System.out.println(students.getSet() + "\n");
    }

    public void searchColors(GestorEstudiantes students) {
=======
    public GestorEstudiantes(){
        this.set = new HashSet<Estudiante>();
    }
    public HashSet<Estudiante> getSet() {
        return this.set;
    }
    public void createStudent(Estudiante student){
        this.set.add(student);
    }
    public static void showStudent(GestorEstudiantes students) {
        System.out.println(students.getSet()+"\n");
    }
    public Boolean searchColors(GestorEstudiantes students){
>>>>>>> Stashed changes
        String name;
        int identidier;
        int selection;

        System.out.println("¿Como quieres buscar al estudiante?\n\t1. Nombre\n\t2. Identificador");
        Scanner a = new Scanner(System.in);
        selection = a.nextInt();

<<<<<<< Updated upstream
        if (selection == 1) {
            System.out.println("Introduce el nombre del estudiante.");
            name = a.next();
            for (Estudiante student : set) {
                if (name.equals(student.get_Name())) {
                    System.out.println("true");
                }

            }
        } else {
            System.out.println("Introduce el identificador del estudiante.");
            identidier = a.nextInt();
            //return this.set.contains(identidier);
=======
        if(selection == 1){
            System.out.println("Introduce el nombre del estudiante.");
            name = a.next();
            return this.set.contains(name);
        }else{
            System.out.println("Introduce el identificador del estudiante.");
            identidier = a.nextInt();
            return this.set.contains(identidier);
>>>>>>> Stashed changes
        }
    }
}
