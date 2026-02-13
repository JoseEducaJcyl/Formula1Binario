import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Escritor {
    public static void escribirPilotos(String ruta, List<Piloto> pilotos){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))){
            out.writeObject(pilotos);
        } catch (Exception e) {
            throw new RuntimeException("Error al escribir: " + e);
        }
    }
}
