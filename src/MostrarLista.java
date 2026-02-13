import java.util.ArrayList;

public class MostrarLista {
    public static void mostrarPilotos(ArrayList<Piloto> pilotos) {
        for (Piloto piloto : pilotos) {
            System.out.println("Piloto: " + piloto.getNombre());
            System.out.println("Escuderia: " + piloto.getEscuderia());
            System.out.println("Puntos: " + piloto.getPuntos());
        }
    }
}
