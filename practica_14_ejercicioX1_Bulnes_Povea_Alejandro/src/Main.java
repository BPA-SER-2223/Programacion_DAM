import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner a = new Scanner(System.in);
        int yes = 0;
        int yes_v = 0;
        int yes_m = 0;
        int yes_c = 0;
        System.out.println("-----------------------------------------\n\t\tBienvenido a tu localhost!\n-----------------------------------------\n");
        Connection conn = null;
        Statement stmt = null;
        int selection = 1;
        do {
            String URL = "jdbc:mysql://localhost:3306";
            System.out.print("Usuario: ");
            String USER = a.nextLine();
            System.out.print("Contraseña: ");
            String PASS = a.nextLine();
            try {
                conn = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("\nConexión exitosa con la base de datos");
                stmt = conn.createStatement();
                while(selection != 0) {
                    System.out.println("\n¿Que quieres hacer?\n\t1.-Craer la BBDD\n\t2.-Crear la tabla Vehículo\n\t3.-Crear la tabla Motocicleta\n\t4.-Crear la tabla Coche\n\t5.-Introducir datos en la tabla Vehículo\n\t6.-Introducir datos en la tabla Motocicleta\n\t7.-Introducir datos en la tabla Coche\n\t8.-Mostrar los datos de Vehículo\n\t9.-Mostrar todos los datos de Coche y Motocicleta\n\t10.Borrar un dato de una tabla\n\t11.Salir");
                    selection = a.nextInt();
                    try {
                        switch (selection) {
                            case 1:
                                Actions_db.creardatabase(stmt, yes);
                                ++yes;
                                break;
                            case 2:
                                Vehiculo.createTable_Vehiculo(stmt, yes_v);
                                ++yes_v;
                                break;
                            case 3:
                                Motocicleta.createTable_Motocicleta(stmt, yes_m);
                                ++yes_m;
                                break;
                            case 4:
                                Coche.createTable_Coche(stmt, yes_c);
                                ++yes_c;
                                break;
                            case 5:
                                Vehiculo.insertTable_Vehiculo(a, conn, yes_v);
                                break;
                            case 6:
                                Motocicleta.insertTable_Motocicleta(a, yes_m, conn);
                                ++yes_m;
                                break;
                            case 7:
                                Coche.insertTable_Coche(a, yes_c, conn);
                                ++yes_c;
                                break;
                            case 8:
                                Vehiculo.ShowTable_Vehiculo(stmt, yes_v);
                                break;
                            case 9:
                                Coche.ShowTable_CocheyMotocicleta(stmt, yes_c, yes_m);
                                break;
                            case 10:
                                Borrar.deleter_DataTable(stmt, a);
                                break;
                            case 11:
                                selection = 0;
                        }
                    }catch (SQLException e){
                        System.out.println("¡Vaya! Ha ocurrido algún error.");
                    }
                }
            } catch (SQLException var14) {
                System.out.println("\nDatos usuario y/o contraseña incorrecta, inténtelo de nuevo");
            }
        } while(selection != 0);
    }
}