import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Coche {
    public static void createTable_Coche(Statement stmt, int yes_c) throws SQLException {
        if (yes_c == 0) {
            stmt.executeUpdate("CREATE TABLE Coche(id INT PRIMARY KEY NOT NULL," +
                    "numero_puertas INT NOT NULL," +
                    "color VARCHAR(20)," +
                    "FOREIGN KEY(id) REFERENCES VEHICULO(id));");
            System.out.println("\nTabla Coche creada");
        } else {
            System.out.println("La tabla Coche ya ha sido creada");
        }
    }
    public static void insertTable_Coche(Scanner a, int yes_c, Connection conn) throws SQLException {
        if (yes_c > 0) {
            System.out.print("Introduce el número de puertas del coche: ");
            int CC = a.nextInt();
            System.out.print("Introduce el color del coche: ");
            String color = a.next();
            String insert = "INSERT INTO Coche(id, numero_puertas, color) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insert);
            pstmt.setString(1, String.valueOf(yes_c));
            pstmt.setString(2, String.valueOf(CC));
            pstmt.setString(3, String.valueOf(color));
            pstmt.executeUpdate();
        } else {
            System.out.println("\nCrea primero la tabla Coche (Opción 4)");
        }

    }

    public static void ShowTable_CocheyMotocicleta(Statement stmt, int yes_c, int yes_m) throws SQLException {
        if (yes_c > 0 && yes_m > 0) {
            System.out.println("Coche.");
            ResultSet rs = stmt.executeQuery("select v.marca , v.tipo, c.numero_puertas, c.color from vehiculo v inner join coche c where v.id = c.id;");
            ResultSet rss = stmt.executeQuery("select v.marca , v.tipo, c.numero_puertas, c.color from vehiculo v inner join coche c where v.id = c.id;");


            String CC;
            while(rs.next()) {
                int numeropuertas = rs.getInt("c.numero_puertas");
                CC = rs.getString("c.color");
                System.out.println("Número de puertas: " + numeropuertas + ", Color: " + CC);
            }
            System.out.println();
            System.out.println("Motocicleta.");

            while(rss.next()) {
                CC = rss.getString("CC");
                System.out.println("CC: " + CC);
            }
        } else {
            System.out.println("Crean antes la tabla Coche y Motocicleta.");
        }

    }
}
