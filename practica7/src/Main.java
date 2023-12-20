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
                "Santa lucía",
                9);

        Area area2 = new Area(
                "Habitaciones",
                5678,
                2, "Santa lucía",
                11);

        Area area3 = new Area(
                "Habitaciones",
                5679,
                2,
                "Santa lucía",
                10);

        ///////////////////////////////Medicos///////////////////////////////

        Medico medico1 = new Medico(
                "20178994G",
                "Antonio Perez",
                23,
                "Masculino",
                2800.5,
                LocalDate.of(2000,12,3),
                area1,
                direccionMedic);

        Medico medico2 = new Medico(
                "73888024T",
                "Raúl Martín",
                51,
                "Masculino",
                3000.3,
                LocalDate.of(1980,4,22),
                area2,
                direccionMedic);

        ///////////////////////////////Contratos///////////////////////////////

        Contrato contrato1= new Contrato(
                LocalDate.of(2022,2,21),
                "Contratación para el area1",
                hospital1);

        Contrato contrato2= new Contrato(
                LocalDate.of(2023,5,1),
                "Contratación para el area2",
                hospital2);

        ArrayList<Contrato> list_Contratos = new ArrayList<Contrato>();

        list_Contratos.add(contrato1);
        list_Contratos.add(contrato2);

        System.out.println("Elige una opción:\n\t1.Consultar datos de personas a traves del DNI.\n\t2.Registro.");
        System.out.println(area1.compareTo(area2));
        System.out.println("El medico tiene una antiguedad de "+medico1.getAntiguedad()+" años");
        System.out.println(medico1.getSueldo_neto());

        System.out.println(list_Contratos.get()));
    }
}