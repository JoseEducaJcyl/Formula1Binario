import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Lector {
    public static ArrayList<Piloto> leerPilotos(String ruta){
        ArrayList<Piloto> pilotos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            pilotos = (ArrayList<Piloto>) ois.readObject();
        }catch(Exception e){
            throw  new RuntimeException("Error al leer: " + e);
        }
        return pilotos;
    }
}
