import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Borrar {
    public static void deleter_DataTable(Statement stmt, Scanner a) throws SQLException {

        System.out.println("Elige la tabla en la cual vas a eliminar un dato.(Escribe el nombre)\n\t1.-Vehiculo\n\t2.-Coche\n\t3.-Motocicleta");
        String name = a.next();
        System.out.println("\nEscribe el número de la linea a borrar: ");

        if(name.equals("Vehiculo")){
            ResultSet rs = stmt.executeQuery("SELECT * FROM Vehiculo");
            while (rs.next()) {
                String id = rs.getString("id");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int año = rs.getInt("año");
                String tipo = rs.getString("tipo");

                System.out.println("Linea " + id + "= Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Tipo: " + tipo);
            }
        }
        if(name.equals("Coche")) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Motocicleta");
            while (rs.next()) {
                String id = rs.getString("id");
                String CC = rs.getString("CC");

                System.out.println("Linea " + id + "= CC: " + CC );
            }
        }
        if(name.equals("Motocicleta")) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Coche");
            while (rs.next()) {
                String id = rs.getString("id");
                String numero_puertas = rs.getString("numero_puertas");
                String color = rs.getString("color");

                System.out.println("Linea " + id + "= Número de puertas: " + numero_puertas + ", Color: " + color);
            }
            System.out.println();
        }

        int linea = a.nextInt();
        String deleteQuery = "DELETE FROM " + name + " WHERE id = " + linea;

        int rowsAffected = stmt.executeUpdate(deleteQuery);

        if (rowsAffected > 0) {
            System.out.println("La fila ha sido eliminada exitosamente.");
        } else {
            System.out.println("No se encontró ninguna fila para eliminar.");
        }

    }
}
