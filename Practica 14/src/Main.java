import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306";
        String USER = "root";
        String PASS = "1234";
        Connection conn = null;
        Statement stmt = null;
        Scanner a = new Scanner(System.in);

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("CREATE DATABASE " + name + "IF NOT EXISTS;");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}