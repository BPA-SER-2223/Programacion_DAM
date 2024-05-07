import java.util.function.ObjIntConsumer;
import com.db4o.*;
import com.db4o.config.Configuration;

public class Main {
    public static void main(String[] args) {

        ObjectContainer bd = Db4o.openFile("basedatoa_Practica14.db40");
        Pilotos.createPilots(bd);



    }
}