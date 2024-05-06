import java.sql.*;
import java.util.Scanner;


public class Vehiculo {
    public static void createTable_Vehiculo(Statement stmt, int yes_v) throws SQLException {

        if (yes_v == 0){
            stmt.executeUpdate(
                    "CREATE TABLE Vehiculo(" +
                            "id INT AUTO_INCREMENT PRIMARY KEY," +
                            "marca VARCHAR(20) NOT NULL," +
                            "modelo VARCHAR(20) NOT NULL," +
                            "año INT NOT NULL," +
                            "tipo VARCHAR(20) NOT NULL);"
            );
        }else{
            System.out.println("La tabla Vehiculo ya se ha creado");
        }
    }
    public static void insertTable_Vehiculo(Scanner a, Statement stmt) throws SQLException{
        System.out.print("Introduce la marca del vahículo: ");
        String marca = a.next();
        System.out.print("Introduce el modelo del " + marca + ": ");
        String modelo = a.next();
        System.out.print("Introduce el año del " + marca + " " + modelo + ": ");
        int year = a.nextInt();
        System.out.println("Elige que tipo de vehículo es:\n\t1.-Coche\n\t2.-Motocicleta");
        int vehiculo = a.nextInt();
        String type;

        if(vehiculo == 1){
            type = "Coche";
        }else{
            type = "Motocicleta";
        }

        ResultSet rs = stmt.executeQuery("INSERT INTO Vehiculo(marca,modelo,año,tipo) VALUES (" + marca + "," + modelo + "," + year + "," + type + ")");
    }
}
