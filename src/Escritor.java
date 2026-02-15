// Escritor.java
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Escritor {
    // Este método guarda la lista de pilotos en un archivo binario
    public static void escribirPilotos(String ruta, List<Piloto> pilotos){
        // ObjectOutputStream permite guardar objetos enteros, no solo texto
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))){
            // Escribo la lista completa de pilotos en el archivo de un golpe
            out.writeObject(pilotos);
        } catch (Exception e) {
            // Si pasa cualquier cosa, lanzo un error con el mensaje
            throw new RuntimeException("Error al escribir: " + e);
        }
    }
}
