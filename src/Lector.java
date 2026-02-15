// Lector.java
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Lector {
    // Este método lee la lista de pilotos desde un archivo binario
    public static ArrayList<Piloto> leerPilotos(String ruta){
        // Creo una lista vacía por si acaso
        ArrayList<Piloto> pilotos = new ArrayList<>();
        
        // ObjectInputStream para leer objetos del archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            // Leo el objeto y lo convierto (casteo) a ArrayList<Piloto>
            pilotos = (ArrayList<Piloto>) ois.readObject();
        }catch(Exception e){
            // Si hay error, lanzo una excepción
            throw  new RuntimeException("Error al leer: " + e);
        }
        return pilotos; // Devuelvo la lista leída
    }
}
