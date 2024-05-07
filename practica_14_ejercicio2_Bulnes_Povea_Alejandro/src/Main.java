import com.db4o.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ObjectContainer db = Db4o.openFile("hola.db40");
        Pilotos pilotoejemplo = null;
        ObjectSet personac = null;

        int infinite = 1;
        while (infinite != 0){
            int count = 0;
            System.out.println("\nContenido actual:");
            pilotoejemplo = new Pilotos(null, null, null, null);
            personac = db.queryByExample(pilotoejemplo);
            while (personac.hasNext()) {
                count++;
                Pilotos piloto = (Pilotos) personac.next();
                System.out.println("\t" + count + "-" + piloto);
            }

            System.out.println("\nElige un opción:\n\t1.-Introducir 10 pilotos\n\t2.-Buscar piloto\n\t3.-Actualizar dato\n\t4.-Eliminar piloto\n\t5.Salir");
            int selection = a.nextInt();
            switch (selection){
                case 1:
                    Pilotos.a(db);
                    break;
                case 2:
                    Pilotos.seachPiloto(a,db,pilotoejemplo,personac);
                    break;
                case 3:
                    Pilotos.upfatePiloto(a,personac,pilotoejemplo,count,db);
                    break;
                case 4:
                    Pilotos.droppPiloto(count,pilotoejemplo,personac,db, a);
                    break;
                case 5:
                    infinite = 0;
            }
        }
    }
}