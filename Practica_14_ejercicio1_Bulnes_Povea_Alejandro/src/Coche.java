import java.sql.SQLException;
import java.sql.Statement;

public class Coche {
    public static void createTable_Coche(Statement stmt, int yes_c) throws SQLException {
        if (yes_c == 0){
            stmt.executeUpdate(
                    "CREATE TABLE Coche(" +
                            "id INT PRIMARY KEY NOT NULL," +
                            "numero_puertas INT NOT NULL," +
                            "color VARCHAR(20));"
            );
        }else{
            System.out.println("La tabla Coche ya se ha creado");
        }
    };
}
