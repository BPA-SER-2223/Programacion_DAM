import java.sql.SQLException;
import java.sql.Statement;

public class Motocicleta {

    public static void createTable_Motocicleta(Statement stmt, int yes_m) throws SQLException {
        if (yes_m == 0){
            stmt.executeUpdate(
                    "CREATE TABLE Motocicleta(" +
                            "id INT PRIMARY KEY NOT NULL," +
                            "CC INT NOT NULL);"
            );
        }else{
            System.out.println("La tabla Motocicleta ya se ha creado");
        }
    };

}
