import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
    public static void presentar(){


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
                "Habitaciones-planta2",
                5678,
                2,
                hospital2,
                11);

        Area area3 = new Area(
                "Habitaciones-planta3",
                5679,
                3,
                hospital2,
                12);

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
                LocalDate.of(2023, 2, 21),
                medico1,
                hospital1);

        Contrato contrato2 = new Contrato(
                LocalDate.of(2023, 5, 1),
                medico2,
                hospital2);

        ///////////////////////////////Lista de contratos///////////////////////////////
        ArrayList<Contrato> list_Contratos = new ArrayList<Contrato>();
        list_Contratos.add(contrato1);
        list_Contratos.add(contrato2);

        ///////////////////////////////Lista de médicos///////////////////////////////
        ArrayList<Medico> list_Medicos = new ArrayList<Medico>();
        list_Medicos.add(medico1);
        list_Medicos.add(medico2);

        ///////////////////////////////Lista de personas///////////////////////////////
        ArrayList<Persona> list_Personas = new ArrayList<Persona>();
        list_Personas.add(persona1);

        ///////////////////////////////Lista de direcciones para personas/médicos///////////////////////////////
        ArrayList<Direccion> list_Direcciones_Personas = new ArrayList<Direccion>();
        list_Direcciones_Personas.add(direccionMedic);

        ///////////////////////////////Lista de direcciones para hospitales///////////////////////////////
        ArrayList<Direccion> list_Direcciones_Hospitales = new ArrayList<Direccion>();
        list_Direcciones_Hospitales.add(direccionHospital1);
        list_Direcciones_Hospitales.add(direccionHospital2);

        ///////////////////////////////Lista de hospitales///////////////////////////////
        ArrayList<Hospital> list_Hospitales = new ArrayList<Hospital>();
        list_Hospitales.add(hospital1);
        list_Hospitales.add(hospital2);

        ///////////////////////////////Lista de áreas///////////////////////////////
        ArrayList<Area> list_Area = new ArrayList<Area>();
        list_Area.add(area1);
        list_Area.add(area2);
        list_Area.add(area3);

        Scanner selection = new Scanner(System.in);
        int num = 0;

        while (num != 3) {
            System.out.println("Elige una opción:\n\t1.Consultar datos de personas a traves del DNI.\n\t2.Registro de.\n\t3.Comparación de numeros de médicos de 2 areas\n\t4.Contratos de 2023\n\t5.Salir.");
            int scanner = selection.nextInt();

            if(scanner<1 || scanner>5){
                while(scanner<1 || scanner>5){
                    System.out.print("Introduce un número del 1 al 5: ");
                    scanner = selection.nextInt();
                }
            }
            if (scanner == 1) {

                System.out.print("\nIntroduce el dni de alguién: ");
                Scanner inicio = new Scanner(System.in);
                String inicio_2 = inicio.next();

                medico1.Information_Medicos(inicio_2, list_Medicos, list_Personas);
            }
            if (scanner == 2) {
                System.out.println("\t1.Hospital\n\t2.Area\n\t3.Médico\n\t4.Contrato\n\t5.Dirección\n\t6.Persona");
                int scanner2 = selection.nextInt();

                if (scanner2 < 1 || scanner2 > 6) {
                    while (scanner2 < 1 || scanner2 > 6) {
                        System.out.print("Introduce un número del 1 al 6: ");
                        scanner2 = selection.nextInt();
                    }
                }

                if (scanner2 == 1) {
                    Hospital.creation_Hospital(list_Direcciones_Hospitales, list_Hospitales);
                } else {
                    if (scanner2 == 2) {
                        Area.creation_Area(list_Hospitales, list_Area);
                    }else{
                        if(scanner2 == 3){
                            Medico.creation_Medicos(list_Area, list_Direcciones_Personas, list_Medicos);
                        }else{
                            if(scanner2 == 4){
                                contrato1.creation_Contrato(list_Hospitales,list_Contratos,list_Medicos);
                            }else{
                                if(scanner2 == 5) {
                                    direccionMedic.creation_Direcciones(list_Direcciones_Personas, list_Direcciones_Hospitales);
                                }else{
                                    Persona.creation_persona(list_Personas);
                                }
                            }
                        }
                    }
                }

            }
            if (scanner == 3){
                Area.comparation_Area(list_Area);
            }
            if (scanner == 4){
                Contrato.contratos_2023(list_Contratos);
            }
            if (scanner == 5) {
                break;
            }
        }
    }
}
