// MostrarLista.java
import java.util.ArrayList;

public class MostrarLista {
    // Este método muestra todos los pilotos de la lista por pantalla
    public static void mostrarPilotos(ArrayList<Piloto> pilotos) {
        // Recorro toda la lista con un for-each
        for (Piloto piloto : pilotos) {
            // Muestro cada dato del piloto
            System.out.println("Piloto: " + piloto.getNombre());
            System.out.println("Escuderia: " + piloto.getEscuderia());
            System.out.println("Puntos: " + piloto.getPuntos());
            System.out.println(); // Línea en blanco para separar pilotos
        }
    }
}
