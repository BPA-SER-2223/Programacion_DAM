public class Main {
    public static void main(String[] args) {
        String URL = "jdbc:mysql:localhost:3306";
        String USER = "root";
        String PAS = "1234";
        Connection conn = null;
        Startement stmt = null;
        try{
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();

            stmt.close();
        } catch (SQLException e){

        }

    }
}