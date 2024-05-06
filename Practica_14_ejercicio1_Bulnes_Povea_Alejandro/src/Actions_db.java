import java.sql.*;
import java.util.Scanner;

public class Actions_db {
    public static void creardatabase(Statement stmt, int yes) throws SQLException {

        String name = "";

        if (yes == 0) {
            Scanner b = new Scanner(System.in);
            System.out.print("¿Cual es el nombre la base de dato?");
            name = b.next();

            stmt.executeUpdate("CREATE DATABASE " + name + ";");
            stmt.executeUpdate("use " + name + ";");
        } else {
            System.out.println("Ya se ha creado la base de datos");
        }
    }
}
