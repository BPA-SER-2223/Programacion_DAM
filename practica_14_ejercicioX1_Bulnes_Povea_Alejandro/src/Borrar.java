import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Borrar {
    public static void deleter_DataTable(Statement stmt, Scanner a) throws SQLException {
        int linea = 0;
        System.out.println("Elige la tabla en la cual vas a eliminar un dato.(Escribe el nombre)\n\t1.-Vehiculo\n\t2.-Coche\n\t3.-Motocicleta");
        String name = a.next();
        ResultSet rs;
        String id;
        String numero_puertas;
        String color;
        if (name.equals("Vehiculo")) {
            System.out.println("\nEscribe el número de la linea a borrar: ");
            rs = stmt.executeQuery("SELECT * FROM Vehiculo");

            while(rs.next()) {
                id = rs.getString("id");
                numero_puertas = rs.getString("marca");
                color = rs.getString("modelo");
                int año = rs.getInt("año");
                String tipo = rs.getString("tipo");
                System.out.println("\tLinea " + id + "= Marca: " + numero_puertas + ", Modelo: " + color + ", Año: " + año + ", Tipo: " + tipo);
            }
            linea = a.nextInt();
        }

        if (name.equals("Coche")) {
            System.out.println("\nEscribe el número de la linea a borrar: ");
            rs = stmt.executeQuery("SELECT * FROM Motocicleta");

            while(rs.next()) {
                id = rs.getString("id");
                numero_puertas = rs.getString("CC");
                System.out.println("\tLinea " + id + "= CC: " + numero_puertas);
            }
            linea = a.nextInt();
        }

        if (name.equals("Motocicleta")) {
            System.out.println("\nEscribe el número de la linea a borrar: ");
            rs = stmt.executeQuery("SELECT * FROM Coche");

            while(rs.next()) {
                id = rs.getString("id");
                numero_puertas = rs.getString("numero_puertas");
                color = rs.getString("color");
                System.out.println("\tLinea " + id + "= Número de puertas: " + numero_puertas + ", Color: " + color);
            }
            linea = a.nextInt();
        }

        id = "DELETE FROM " + name + " WHERE id = " + linea;
        int rowsAffected = stmt.executeUpdate(id);
        if (rowsAffected > 0) {
            System.out.println("\nLa fila ha sido eliminada exitosamente.");
        } else {
            System.out.println("\nNo se encontró ninguna fila para eliminar.");
        }

    }
}

