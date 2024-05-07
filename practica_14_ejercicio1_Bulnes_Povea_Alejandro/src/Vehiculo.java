import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Vehiculo {
    public static void createTable_Vehiculo(Statement stmt, int yes_v) throws SQLException {
        if (yes_v == 0) {
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Vehiculo(" +
                        "id INT AUTO_INCREMENT PRIMARY KEY," +
                        "marca VARCHAR(20) NOT NULL," +
                        "modelo VARCHAR(20) NOT NULL," +
                        "año YEAR NOT NULL," +
                        "tipo VARCHAR(20) NOT NULL);");
                System.out.println("\nTabla Vehiculo creada");
        } else {
            System.out.println("La tabla Vehiculo ya fué creada");
        }
    }
    public static void insertTable_Vehiculo(Scanner a, Connection conn, int yes_v) throws SQLException {
        if (yes_v > 0) {
            System.out.print("Introduce la marca del vahículo: ");
            String marca = a.next();
            System.out.print("Introduce el modelo del " + marca + ": ");
            String modelo = a.next();
            System.out.print("Introduce el año del " + marca + " " + modelo + ": ");
            int year = a.nextInt();
            System.out.println("Elige que tipo de vehículo es:\n\t1.-Coche\n\t2.-Motocicleta");
            int vehiculo = a.nextInt();
            String type;
            if (vehiculo == 1) {
                type = "Coche";
            } else {
                type = "Motocicleta";
            }
            String insert = "INSERT INTO Vehiculo(marca, modelo, año, tipo) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insert);
            pstmt.setString(1, marca);
            pstmt.setString(2, modelo);
            pstmt.setInt(3, year);
            pstmt.setString(4, type);
            pstmt.executeUpdate();
        } else {
            System.out.println("\nCrea primero la tabla Coche (Opción 2)");
        }
    }
    public static void ShowTable_Vehiculo(Statement stmt, int yes_v) throws SQLException {
        if (yes_v > 0) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM Vehiculo");

            while(rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int year = rs.getInt("año");
                String tipo = rs.getString("tipo");
                System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + year + ", Tipo: " + tipo);
            }
        } else {
            System.out.println("Crean antes la tabla Vehiculo.");
        }
    }
}
