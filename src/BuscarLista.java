import java.util.ArrayList;

public class BuscarLista {
    public static void buscarPiloto(String piloto, ArrayList<Piloto> pilotos) {
        boolean continuar = true;
        int contador = 0;
        while (continuar) {
            if (contador <= pilotos.size()) {
                contador++;
                if (piloto.equalsIgnoreCase(pilotos.get(contador).getNombre())) {
                    System.out.println("Piloto: " + pilotos.get(contador).getNombre());
                    System.out.println("Escuderia: " + pilotos.get(contador).getEscuderia());
                    System.out.println("Puntos: " + pilotos.get(contador).getPuntos());
                    continuar = false;
                }
            }
        }
    }
}
