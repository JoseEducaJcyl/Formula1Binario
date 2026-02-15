// BuscarLista.java
import java.util.ArrayList;

public class BuscarLista {
    // Este método busca un piloto por su nombre y muestra sus datos
    public static void buscarPiloto(String piloto, ArrayList<Piloto> pilotos) {
        boolean continuar = true; // Controla si seguimos buscando
        int contador = 0; // Índice para recorrer la lista
        
        while (continuar) {
            // Compruebo que el contador no se pase del tamaño de la lista
            if (contador <= pilotos.size()) {
                contador++; 
                
                // Comparo el nombre que busco con el nombre del piloto actual
                // equalsIgnoreCase ignora mayúsculas/minúsculas
                if (piloto.equalsIgnoreCase(pilotos.get(contador).getNombre())) {
                    // Si lo encuentro, muestro todos sus datos
                    System.out.println("Piloto: " + pilotos.get(contador).getNombre());
                    System.out.println("Escuderia: " + pilotos.get(contador).getEscuderia());
                    System.out.println("Puntos: " + pilotos.get(contador).getPuntos());
                    continuar = false; // Termino la búsqueda
                }
            }
        }
    }
}
