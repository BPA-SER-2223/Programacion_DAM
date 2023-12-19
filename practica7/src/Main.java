import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Elige una opción:\n\t1.Consultar datos de personas a traves del DNI.\n\t2.Registro.");



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

        System.out.println(area1.compareTo(area2));

        LocalDate dateMedic1 = LocalDate.of(2000,12,3);

        Direccion direccionMedic = new Direccion("String",
                32,
                41001,
                "Sevilla",
                "Sevilla");

        Medico medico1 = new Medico(
                "20178994G",
                "Antonio Perez",
                23,
                "Masculino",
                3006.8,
                LocalDate.of(2000,12,3),
                area1,
                direccionMedic
        );
        System.out.println("El medico tiene una antiguedad de "+medico1.getAntiguedad()+" años");
    }
}
