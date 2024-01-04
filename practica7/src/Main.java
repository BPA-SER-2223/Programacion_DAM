import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ///////////////////////////////Direcciones///////////////////////////////

        Direccion direccionMedic = new Direccion(
                "calle aeronautica",
                32,
                41001,
                "Sevilla",
                "Sevilla");

        Direccion direccionHospital1 = new Direccion(
                "calle alabarda",
                6,
                41092,
                "Sevilla",
                "Sevilla");

        Direccion direccionHospital2 = new Direccion(
                "calle balber",
                7,
                41090,
                "Sevilla",
                "Sevilla");

        ///////////////////////////////Hospitales///////////////////////////////

        Hospital hospital1 = new Hospital(
                "Santa Lucía",
                "P9150013B",
                direccionHospital1);

        Hospital hospital2 = new Hospital(
                "Ramón Refe",
                "H356991U",
                direccionHospital2);

        ///////////////////////////////Areas///////////////////////////////

        Area area1 = new Area(
                "Quirófano",
                1234,
                1,
                hospital1,
                9);

        Area area2 = new Area(
                "Habitaciones",
                5678,
                2,
                hospital2,
                11);

        Area area3 = new Area(
                "Habitaciones",
                5679,
                2,
                hospital2,
                10);

        ///////////////////////////////Personas///////////////////////////////

        Persona persona1 = new Persona(
                "35985664T",
                "Laura",
                20,
                "Femenino");

        ///////////////////////////////Medicos///////////////////////////////

        Medico medico1 = new Medico(
                "20178994G",
                "Antonio Perez",
                23,
                "Masculino",
                2800.5,
                LocalDate.of(2000, 12, 3),
                area1,
                direccionMedic);

        Medico medico2 = new Medico(
                "73888024T",
                "Raúl Martín",
                51,
                "Masculino",
                3000.3,
                LocalDate.of(1980, 4, 22),
                area2,
                direccionMedic);

        ///////////////////////////////Contratos///////////////////////////////

        Contrato contrato1 = new Contrato(
                LocalDate.of(2022, 2, 21),
                "Contratación para el area1",
                hospital1);

        Contrato contrato2 = new Contrato(
                LocalDate.of(2023, 5, 1),
                "Contratación para el area2",
                hospital2);


        String[] dni_medicos = {"20178994G", "73888024T"};
        String[] dni_personas = {"35985664T"};

        ArrayList<Contrato> list_Contratos = new ArrayList<Contrato>();
        list_Contratos.add(contrato1);
        list_Contratos.add(contrato2);

        ArrayList<Medico> list_Medicos = new ArrayList<Medico>();
        list_Medicos.add(medico1);
        list_Medicos.add(medico2);

        ArrayList<Persona> list_Personas = new ArrayList<Persona>();
        list_Personas.add(persona1);

        ArrayList<Direccion> list_Direcciones = new ArrayList<Direccion>();
        list_Direcciones.add(direccionHospital1);
        list_Direcciones.add(direccionHospital2);

        ArrayList<Hospital> list_Hospitales = new ArrayList<Hospital>();
        list_Hospitales.add(hospital1);
        list_Hospitales.add(hospital2);

        System.out.println(area1.compareTo(area2));

        Scanner selection = new Scanner(System.in);
        int num = 0;

        while (num != 3) {
            System.out.println("Elige una opción:\n\t1.Consultar datos de personas a traves del DNI.\n\t2.Registro.\n\t3.Salir.");
            int scanner = selection.nextInt();

            if (scanner == 1) {

                System.out.print("\nIntroduce el dni de alguién:");
                Scanner inicio = new Scanner(System.in);
                String inicio_2 = inicio.next();

                medico1.Information_Medicos(inicio_2, list_Medicos, dni_medicos, dni_personas, list_Personas);
            }
            if (scanner == 2) {
                scanner = selection.nextInt();
                if (scanner == 1) {
                    hospital1.creation_Hospital(list_Direcciones, list_Hospitales);
                } else {
                    if (scanner == 2) {
                        area1.creation_Area(list_Hospitales);
                    }
                }
                if (scanner == 3) {
                    break;
                }
            }
        }
    }
}