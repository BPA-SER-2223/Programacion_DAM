import java.util.ArrayList;
import java.util.Scanner;
public class Data {

    public static void ejercicio1(){
        int infinite = 0;
        ArrayList<Integer> list_num = new ArrayList<Integer>();

        list_num.add(1);
        list_num.add(2);
        list_num.add(3);

        GestorNumeros list1 = new GestorNumeros(list_num);

        while(infinite != 1){
            Scanner a = new Scanner(System.in);
            System.out.println("Elige una opción.\n\t1. Añadir número.\n\t2. Sumar todos los números.\n\t3. Mostrar todos los números\n\t4. Salir");

            int selection = a.nextInt();

            if(selection<1 || selection>4){
                while (selection<1 || selection>4){
                    System.out.print("Introduce un número entre 1 y 4: ");
                    selection = a.nextInt();
                }
            }

            if(selection == 1){
                list1.add_num();
            }
            if(selection == 2){
                System.out.println("La sume es: "+list1.sumar_nums());
            }
            if(selection == 3){
                System.out.println(list1.get_list_num());
            }
            if (selection == 4){
                break;
            }
        }
    }

    public static void ejercicio2(){
        int infinite = 0;

        GestorPersonas gestor = new GestorPersonas();

        while (infinite == 0){
            System.out.println("Elige una opción\n\t1. Añadir persona\n\t2. Información de personas\n\t3. Buscar persona\n\t4. Salir");
            Scanner a = new Scanner(System.in);
            int selection = a.nextInt();


            if(selection<1 || selection>4){
                while (selection<1 || selection>4){
                    System.out.print("Introduce un número entre 1 y 4: ");
                    selection = a.nextInt();
                }
            }

            if(selection == 1){
                System.out.print("Introduce el nombre de la persona: ");
                String name = a.next();
                System.out.print("Introduce la edad de la persona: ");
                int age = a.nextInt();
                gestor.createPersona(name, age);
                System.out.println("\n¡Persona creada!\n");
            }
            if(selection == 2){
                gestor.showPersona(gestor);
            }
            if(selection == 3){
                System.out.println(gestor.searchPersona()+"\n");
            }
            if (selection == 4){
                break;
            }
        }
    }
    public static void ejercicio3(){
        int infinite = 0;

        GestorColores colors = new GestorColores();

        while (infinite == 0){
            System.out.println("Elige una opción\n\t1. Añadir color\n\t2. Ver todos los colores\n\t3. Buscar color\n\t4. Salir");
            Scanner a = new Scanner(System.in);
            int selection = a.nextInt();


            if(selection<1 || selection>4){
                while (selection<1 || selection>4){
                    System.out.print("Introduce un número entre 1 y 4: ");
                    selection = a.nextInt();
                }
            }

            if(selection == 1){
                System.out.print("Introduce un color: ");
                String color = a.next();
                colors.createColor(color);
                System.out.println("\n¡Color creado!\n");
            }
            if(selection == 2){
                GestorColores.showColors(colors);
            }
            if(selection == 3){
                System.out.println(colors.searchColors()+"\n");
            }
            if (selection == 4){
                break;
            }
        }
    }
    public static void ejercicio4(){
        int infinite = 0;

        GestorEstudiantes students = new GestorEstudiantes();

        while (infinite == 0){
            System.out.println("Elige una opción\n\t1. Añadir estudiante\n\t2. Ver todos los estudiantes\n\t3. Buscar estudiante\n\t4. Salir");
            Scanner a = new Scanner(System.in);
            int selection = a.nextInt();


            if(selection<1 || selection>4){
                while (selection<1 || selection>4){
                    System.out.print("Introduce un número entre 1 y 4: ");
                    selection = a.nextInt();
                }
            }

            if(selection == 1){
                System.out.print("Introduce el nombre del estudiante: ");
                String name = a.next();
                System.out.print("Introduce el identificador del estudiante: ");
                int identifier = a.nextInt();

                Estudiante new_student = new Estudiante(name, identifier);
                students.createStudent(new_student);
                System.out.println("\n¡Estudiante creado!\n");
            }
            if(selection == 2){
                GestorEstudiantes.showStudent(students);
            }
            if(selection == 3){
<<<<<<< Updated upstream
                System.out.println();
=======
                System.out.println(students.searchColors(students));
>>>>>>> Stashed changes
            }
            if (selection == 4){
                break;
            }
        }
    }
    public static void ejercicio5(){
        int infinite = 0;

        GestorEmpleados employees = new GestorEmpleados();

        while(infinite != 1){
            Scanner a = new Scanner(System.in);
            System.out.println("Elige una opción.\n\t1. Añadir empleado.\n\t2. Ver todos los empleados.\n\t3. Buscar empleado\n\t4. Salir");

            int selection = a.nextInt();

            if(selection<1 || selection>4){
                while (selection<1 || selection>4){
                    System.out.print("Introduce un número entre 1 y 4: ");
                    selection = a.nextInt();
                }
            }

            if(selection == 1){
                System.out.print("Escribe el nombre del empleado: ");
                String name = a.next();
                System.out.print("Escribe el salario del empleado con decimas: ");
                double salary = a.nextDouble();
                Empleados new_employee = new Empleados(name, salary);
                employees.createEmployees(name, new_employee);
                System.out.println("\n¡Empleado creado!\n");
            }
            if(selection == 2){
                GestorEmpleados.showEmployees(employees);
            }
            if(selection == 3){
<<<<<<< Updated upstream
                System.out.println(employees.searchEmployees()+"\n");
=======
                employees.searchEmployees();
>>>>>>> Stashed changes
            }
            if (selection == 4){
                break;
            }
        }
    }
}
