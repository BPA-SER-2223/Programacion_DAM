import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306";
        String USER = "root";
        String PASS = "2005Alex";
        Connection conn = null;
        Statement stmt = null;
        int selection = 0;
        Scanner a = new Scanner(System.in);




        try{
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();

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

                        String table = "CREATE TABLE ";

                        System.out.println("¿Cuál es el nombre de la table? ");
                        nombre_tabla = a.nextLine();
                        table = table + nombre_tabla + " (";
                        System.out.println("¿Cuantos campos cuesta la tabla?");
                        numerber_fields  = a.nextInt();

                        ArrayList<String> list_fields = new ArrayList<>();

                        for(int i=0;i<numerber_fields;i++){
                            System.out.print((i+1)+"º campo: ");
                            fields = a.next();
                            list_fields.add(fields);

                            table = table + fields + " ";

                            System.out.println("\n¿Tipo del campo?\n\t1.VARCHAR\n\t2.INT\n\t3.CHAR\n\t4.DATE\n\t5.TIME\n\t6.DATETIME");
                            selection = a.nextInt();

                            if(selection == 1){
                                table = table + "VARCHAR ";
                            }
                            if(selection == 2){
                                table = table + "INT ";
                            }
                            if(selection == 3){
                                table = table + "CHAR ";
                            }
                            if(selection == 4){
                                table = table + "DATE ";
                            }
                            if(selection == 5){
                                table = table + "TIME ";
                            }
                            if(selection == 6){
                                table = table + "DATETIME ";
                            }

                            System.out.print("Número de caracteres: ");
                        }

                        stmt.executeUpdate("use red_social;");
                        //stmt.executeUpdate(
                        //         "CREATE TABLE Prueba (" +
                        //        "Id INT PRIMARY KEY," +
                        //         "Puertas INT NOT NULL," +
                        //         "color varchar(50) NOT NULL," +
                        //         "FOREIGN KEY (Id) REFERENCES CASA(Id)" +
                        //         ");");
                }
            }while(selection != 0);











            rs.close();
            stmt.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}