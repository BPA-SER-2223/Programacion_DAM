import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        MedicManagement m = new MedicManagement();

        Gson gson = new Gson();

        // create a reader
        Reader reader = Files.newBufferedReader(Paths.get("Medicos.json"));

        // convert JSON file to map
        Map<String, String> map = gson.fromJson(reader, Map.class);

        System.out.println(map.get("dni"));

//        MedicManagement m = new Medic(
//                map.get("dni"),
//                map.get("name"),
//                Integer.parseInt(map.get("age")),
//                map.get("gender"),
//                Double.parseDouble(map.get("salary"))
//        );

//        System.out.println(m.getName());

        // close reader
        reader.close();

    }
}