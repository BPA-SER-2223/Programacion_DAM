import java.sql.*;
import java.util.Scanner;

public class Coche {
    public static void createTable_Coche(Statement stmt, int yes_c) throws SQLException {
        if (yes_c == 0){
            stmt.executeUpdate(
                    "CREATE TABLE Coche(" +
                            "id INT PRIMARY KEY NOT NULL," +
                            "numero_puertas INT NOT NULL," +
                            "color VARCHAR(20));"
            );
            System.out.println("\nTabla Coche creada");
        }else{
            System.out.println("La tabla Coche ya se ha creado");
        }
    }
    public static void insertTable_Coche(Scanner a, int yes_c, Connection conn) throws SQLException{
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
         }else{
             System.out.println("\nCrea primero la tabla Coche (Opción 4)");
         }
    }
    public static void ShowTable_CocheyMotocicleta(Statement stmt, int yes_c, int yes_m) throws SQLException {
        if(yes_c > 0 && yes_m > 0){
            System.out.println("Coche.");
            ResultSet rs = stmt.executeQuery("SELECT * FROM Coche");
            while (rs.next()) {
                String numeropuertas = rs.getString("numero_puertas");
                String color = rs.getString("color");

                System.out.println("Número de puertas: " + numeropuertas + ", Color: " + color);
            }
            System.out.println();
            ResultSet rss = stmt.executeQuery("SELECT * FROM Motocicleta");
            System.out.println("Motocicleta.");
            while (rss.next()) {
                String CC = rss.getString("CC");

                System.out.println("CC: " + CC );
            }
        }else{
            System.out.println("Crean antes la tabla Coche y Motocicleta.");
        }


    }
}
