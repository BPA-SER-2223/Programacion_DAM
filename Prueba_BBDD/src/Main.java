import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306";
        String USER = "root";
        String PASS = "1234";
        Connection conn = null;
        Statement stmt;
        String consultaI = "INSERT INTO blog_prosthesis._user(name_user, passw, name, subnames, phones, email, sex) VALUES ('user1', 'user1', 'Usuario1','1 1','25638263','sex')";
        String consultaS = "SELECT * FROM blog_prosthesis._user";
        try{
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            System.out.println("Entra");
            ResultSet rs = stmt.executeQuery(consultaS);
            System.out.println("Resultado de la base de datos:");
            while (rs.next()){

                System.out.println(rs.getString("name_user"));
            }
            stmt.close();
        } catch (SQLException e){System.out.println("Error" + e.getMessage());}



    }
}
