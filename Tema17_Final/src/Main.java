import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306";
        String USER = "root";
        String PASS = "1234";
        Connection conn = null;
        Statement stmt = null;
        int selection = 0;
        Scanner a = new Scanner(System.in);

        try{
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate("use red_social;");

            switch (selection = a.nextInt()){
                case 1:
                    stmt.executeUpdate("use red_social;");
                    stmt.executeUpdate(
                            "CREATE TABLE IF NOT EXISTS vivienda (" +
                            "identificador INT PRIMARY KEY AUTO_INCREMENT," +
                            "direccion VARCHAR(100)," +
                            "numero_habitaciones INT," +
                            "precio DECIMAL(65,2));");
                    stmt.executeUpdate(
                            "CREATE TABLE IF NOT EXISTS chalet (" +
                            "identificador INT PRIMARY KEY AUTO_INCREMENT," +
                            "jardin BOOLEAN," +
                            "FOREIGN KEY (identificador) REFERENCES vivienda(identificador));"
                    );
                    break;

                case 2:
                    Scanner b = new Scanner(System.in);
                    System.out.print("Dirección: ");
                    String direction = b.nextLine();
                    System.out.print("Número de habitaciones: ");
                    int number_room = a.nextInt();
                    System.out.print("Precio: ");
                    double price = a.nextDouble();
                    stmt.executeUpdate("use red_social;");
                    stmt.executeUpdate("INSERT INTO vivienda(direccion,numero_habitaciones,precio) VALUES ('"+ direction + "','" + number_room + "','" + price + "');");
                    break;

                case 3:
                    System.out.println("¿Tiene jardín?\n\t0.No\n\t1.Si");
                    selection = a.nextInt();
                    int jardin = 0;
                    

                    stmt.executeUpdate("INSERT INTO red_social.chalet" +
                            "(identificador, jardin)" +
                            "VALUES(0, 0);");
                    break;
                case 4:
                    System.out.println("¿De que tabla quieres obtener los datos?\n\t1.Vivienda\n\t2.Chaled");
                    selection = a.nextInt();

                    if(selection == 1){
                        ResultSet rs = stmt.executeQuery("SELECT * FROM vivienda");
                        ResultSetMetaData rsmd = rs.getMetaData();
                        String encabezado = "";
                        String contenido_id = "";
                        String contenido_direction = "";
                        String contenido_n_room = "";
                        String contenido_price = "";

                        for(int i=0;i<rsmd.getColumnCount();i++){
                            encabezado = encabezado + rsmd.getColumnName(i+1) + " \t\t ";
                        }

                        System.out.println("+----+---------------------------+------------------------+-------+");
                        System.out.println("| ID | direccion                 | numero_habitaciones    | precio|");
                        System.out.println("+----+---------------------------+------------------------+-------+");

                        while (rs.next()) {
                            contenido_id = rs.getString("identificador");
                            contenido_direction = rs.getString("direccion");
                            contenido_n_room = rs.getString("numero_habitaciones");
                            contenido_price = rs.getString("precio");

                            System.out.format("| %2s | %-25s | %-22s | %5s |\n", contenido_id, contenido_direction, contenido_n_room, contenido_price);
                        }
                        System.out.println("+----+---------------------------+------------------------+-------+");
                    }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}