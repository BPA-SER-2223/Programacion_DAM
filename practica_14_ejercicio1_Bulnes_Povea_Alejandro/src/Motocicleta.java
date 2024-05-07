import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Motocicleta {
    public static void createTable_Motocicleta(Statement stmt, int yes_m) throws SQLException {
        if (yes_m == 0) {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Motocicleta(" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "CC INT NOT NULL," +
                    "FOREIGN KEY(id) REFERENCES VEHICULO(id));");
            System.out.println("\nTabla Motocicleta creada");
        } else {
            System.out.println("La tabla Motocicleta ya fué creada");
        }
    }
    public static void insertTable_Motocicleta(Scanner a, int yes_m, Connection conn) throws SQLException {
        if (yes_m > 0) {
            System.out.print("Introduce la cilindrada de la motocicleta: ");
            String CC = a.next();
            String insert = "INSERT INTO Motocicleta(CC) VALUES (?)";
            PreparedStatement pstmt = conn.prepareStatement(insert);
            pstmt.setString(1, String.valueOf(CC));
            pstmt.executeUpdate();
        } else {
            System.out.println("\nCrea primero la table Motocicleta (Opición 3)");
        }
    }
}
