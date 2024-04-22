import java.sql.*;
import java.util.ArrayList;
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
            String actualizaciobn = "INSERT INTO red_social.usuarios VALUES(20, 'Alejandro', 'Bulnes Povea', '6578lexbpx', '$2a$10$OH9B70MPW2AxnKbkjwbkyug347GxAVNUrPRuPMZnSyE.TT3D3KKAW', '2005-04-06', '626330591', NULL, '2024-04-10 09:52:28', NULL)";
            int nactualizacion = -1;
            //nactualizacion = stmt.executeUpdate(actualizaciobn);
            System.out.println("Se han actualizado " + nactualizacion);
            ResultSet rs = stmt.executeQuery("SELECT * FROM red_social.usuarios");

            System.out.println("Resultados de la base de datos:");
            while (rs.next()){
                System.out.println("ID: " + rs.getInt("id") + ", Nombre: " + rs.getString("nombre"));
            }

            //stmt.executeUpdate("use red_social;");
            //stmt.executeUpdate(
            //         "CREATE TABLE Prueba (" +
            //        "Id INT PRIMARY KEY," +
            //         "Puertas INT NOT NULL," +
            //         "color varchar(50) NOT NULL," +
            //         "FOREIGN KEY (Id) REFERENCES CASA(Id)" +
            //         ");");

            int numerber_fields = 0;
            String nombre_tabla;
            String fields;


            do{
                System.out.println("Elige una opción:\n\t1.Crear una tabla\n\t2.Insertar datos\n\t3.Obtener datos\n\t4.Actualizar datos\n\t5.Salir");
                selection = a.nextInt();
                switch (selection){
                    case 1:
                        System.out.println("¿Cuál es el nombre de la table? ");
                        nombre_tabla = a.nextLine();
                        System.out.println("¿Cuantos campos cuesta la tabla?");
                        numerber_fields  = a.nextInt();

                        ArrayList<String> list_fields = new ArrayList<>();

                        for(int i=0;i<numerber_fields;i++){
                            System.out.print((i+1)+"º campo: ");
                            list_fields.add(fields = a.next());
                        }

                }
            }while(selection != 0);











            rs.close();
            stmt.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}