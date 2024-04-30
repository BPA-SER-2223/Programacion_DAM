import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class Main {
    public static void main(String[] args) {
        ObjectContainer bd = null;

        try{
            bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "personas.db4o");
            System.out.println("Se ha realizado la conexión a la BBDD.");

            Persona persona1 = new Persona("Alejandro", "Bulnes", "Povea", 18);
            Persona persona2 = new Persona("Daniel", "Mesa", "Mauro", 18);

            bd.store(persona1);
            bd.store(persona2);
            bd.commit();

            Persona personaejemplo = new Persona(null, null,null,0);
            ObjectSet personaconsulta = bd.queryByExample(personaejemplo);
            System.out.println(personaconsulta);

            Persona personaO = (Persona) personaconsulta.next();
            personaO.setEdad(20);
            bd.store(personaO);

            while(personaconsulta.hasNext()){
                Persona persona12 = (Persona) personaconsulta.next();
                persona12.setEdad(100);
                bd.store(persona12);
            }

            Persona personaeliminar = new Persona("Juan", null,null,0);
            ObjectSet borrador = bd.queryByExample(personaeliminar);

            while(borrador.hasNext()){
                Persona eliminar = (Persona) borrador.next();
                bd.delete(eliminar);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            bd.close();
        }
    }
}