import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String URL = "jdbc:mysql:localhost:3306";
        String USER = "root";
        String PASS = "1234";
        Connection conn = null;
        Statement stmt = null;
        try{
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();

            stmt.close();
        } catch (SQLException e){

        }

    }
}