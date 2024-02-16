import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MedicManagement {

    private FileReader fr;
    private BufferedReader br;

    public MedicManagement() {
        try {
            this.fr = new FileReader("pacientes.txt");
            this.br = new BufferedReader(this.fr);
            String line;
            while ((line = this.br.readLine()) != null) {
                String[] datos = line.split(";");
                System.out.println(datos[0]);

            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de texto: " + e.getMessage());
        }
    }
}