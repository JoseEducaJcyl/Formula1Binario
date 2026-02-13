import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
        GenerarDatos.crearPilotos(pilotos);
        Escritor.escribirPilotos("pilotos.corredores", pilotos);
        Lector.leerPilotos("pilotos.corredores");
        Piloto piloto = new Piloto("Sainz","Ferrari",320);
        AniadirLista.aniadirPilotos(pilotos, piloto);
        System.out.println("\nBusqueda de un piloto: ");
        BuscarLista.buscarPiloto("Sainz",pilotos);
        System.out.println("\nMostrar pilotos: ");
        MostrarLista.mostrarPilotos(pilotos);
    }
}