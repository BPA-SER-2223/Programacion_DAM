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




            ResultSet rs = stmt.executeQuery("SELECT * FROM red_social.usuarios");
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumnas = rsmd.getColumnCount();

            int numerber_fields = 0;
            String nombre_tabla;
            String fields;
            int num = 0;
            int count = 0;
            ArrayList<String> list_table_name = new ArrayList<>();
            String[][] list_fields = new String[100][100];

            do{
                System.out.println("Elige una opción:\n\t1.Crear una tabla\n\t2.Insertar datos\n\t3.Obtener datos\n\t4.Actualizar datos\n\t5.Salir");
                selection = a.nextInt();
                switch (selection){
                    case 1:

                        String table = "CREATE TABLE ";

                        System.out.println("¿Cuál es el nombre de la table? ");
                        nombre_tabla = a.next();
                        list_table_name.add(nombre_tabla);
                        table = table + nombre_tabla + " (";
                        System.out.println("¿Con cuantos campos contará la tabla?");
                        numerber_fields  = a.nextInt();

                        for(int i=0;i<numerber_fields;i++){
                            System.out.print((i+1)+"º campo: ");
                            fields = a.next();
                            list_fields[count][i] = fields;
                            table = table + fields + " ";

                            System.out.println("\n¿Tipo del campo?\n\t1.VARCHAR\n\t2.INT\n\t3.CHAR\n\t4.DATE\n\t5.TIME\n\t6.DATETIME");
                            selection = a.nextInt();

                            if(selection == 1){
                                table = table + "VARCHAR";
                            }
                            if(selection == 2){
                                table = table + "INT";
                            }
                            if(selection == 3){
                                table = table + "CHAR";
                            }
                            if(selection == 4){
                                table = table + "DATE";
                            }
                            if(selection == 5){
                                table = table + "TIME";
                            }
                            if(selection == 6){
                                table = table + "DATETIME";
                            }

                            System.out.print("Número de caracteres: ");
                            num = a.nextInt();
                            table = table + "(" +(num+"),");
                        }
                        System.out.println("¿Cuales de estos campos es la PRIMARY KEY?");
                        for(int i=0;i<list_fields[count].length;i++){
                            if(list_fields[count][i] != null) {
                                System.out.println("\t" + (i + 1) + "." + list_fields[count][i]);
                            }
                        }
                        selection = a.nextInt();
                        table = table + "PRIMARY KEY (" + list_fields[count][selection-1] + ")";

                        System.out.println("¿La tabla cuenta con alguna FOREiNG KEY? Pod: Recuerda que para crear estas relaciones, amabas tablas deben estar creadas.\n\t1.Si\n\t2.No");
                        selection = a.nextInt();

                        if(selection == 1){
                            System.out.println("¿Cuantas?");
                            int selection3 = a.nextInt();
                            for(int i=0;i<selection3;i++)
                                System.out.println((i+1) + "º FOREING KEY:\n¿Que campo de la tabla '" + nombre_tabla + "' formará parte de esta relación?");
                                for(int i=0;i<list_fields[count].length;i++){
                                    if(list_fields[count][i] != null) {
                                        System.out.println("\t" + (i + 1) + "." + list_fields[count][i]);
                                    }
                                }
                                selection = a.nextInt();
                                table = table + ", FOREING KEY (" + list_fields[count][selection-1] + ") REFERENCES ";

                                System.out.println("¿Con que tabla se relacionará el campo?");
                                for(int i=0;i<list_table_name.size();i++){
                                    System.out.println("\t" + (i+1) + "." + list_table_name.get(i));
                                }
                                selection = a.nextInt();
                                table = table + list_table_name.get(selection-1) + "(";

                                System.out.println("¿Que campo de la tabla '" + list_table_name.get(selection-1) + "' añadirás a la relación?");
                                for(int i=0;i<list_fields[selection-1].length;i++){
                                    if(list_fields[selection-1][i] != null) {
                                        System.out.println("\t" + (i + 1) + "." + list_fields[selection-1][i]);
                                    }
                                }
                                int selection2 = a.nextInt();

                                table = table + list_fields[selection-1][selection2-1] + ")";
                        }
                        table = table + ");";

                        System.out.println(table);

                        System.out.println("-----------------------------\n\t\t¡Tabla creada!\n-----------------------------\n");
                        count++;

                        stmt.executeUpdate("use red_social;");
                        stmt.executeUpdate(table);

                }
            }while(selection != 0);











            rs.close();
            stmt.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
