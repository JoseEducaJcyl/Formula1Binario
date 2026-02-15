// GenerarDatos.java
import java.util.ArrayList;

public class GenerarDatos {
    // Este método crea 4 pilotos de F1 de ejemplo y los mete en la lista
    public static ArrayList<Piloto> crearPilotos(ArrayList<Piloto> pilotos){
        // Añado pilotos con nombre, escudería y puntos
        pilotos.add(new Piloto("Verstappen","Red Bull",255));
        pilotos.add(new Piloto("Hamilton","Mercedes",190));
        pilotos.add(new Piloto("Alonso","Aston Martin",170));
        pilotos.add(new Piloto("Leclerc","Ferrari",185));

        return pilotos; // Devuelvo la lista con los pilotos añadidos
    }
}
