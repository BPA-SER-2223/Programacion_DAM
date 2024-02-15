import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Medico {

    private FileReader fr;
    private BufferedReader br;

    public Medico () throws FileNotFoundException {
        try {
            this.fr = new FileReader("pacientes.txt");
            this.br = new BufferedReader(this.fr);
            String line;
            while ((line = this.br.readLine()) != null) {
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo de texto: " + e.getMessage());
        }
    }
}