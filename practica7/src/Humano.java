import java.util.ArrayList;

public interface Humano {
    default void Information_Personas(String inicio_2, ArrayList<Persona> list_Personas) {
        int no=0;
        for (int i = 0; i < list_Personas.size(); i++) {
            if (inicio_2.equals(list_Personas.get(i).getDni())) {
                System.out.println(list_Personas.get(i));
                no++;
                break;
            }
        }
        if (no==0){
            System.out.println("No existe la persona asociada al dni introducido.\n");
        }
    }
}