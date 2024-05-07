import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Actions_db {
    public static void creardatabase(Statement stmt, int yes) throws SQLException {
        String name = "";
        if (yes == 0) {
            try {
                Scanner b = new Scanner(System.in);
                System.out.println("¿Cual es el nombre la base de dato?");
                name = b.next();
                stmt.executeUpdate("CREATE DATABASE " + name + ";");
            }catch (SQLException e){
                System.out.println("Base de datos existente");

            }
            stmt.executeUpdate("use " + name + ";");
        } else {
            System.out.println("Ya fue creada o elegida la base de datos");
        }

    }
}
