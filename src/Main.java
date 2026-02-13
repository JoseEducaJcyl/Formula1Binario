import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
        GenerarDatos.crearPilotos(pilotos);
        Escritor.escribirPilotos("pilotos.dat", pilotos);
        Lector.leerPilotos("pilotos.dat");
        System.out.println("Añadir un piloto: ");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Escuderia: ");
        String escuderia = sc.nextLine();
        System.out.println("Puntos: ");
        int puntos = sc.nextInt();

        Piloto piloto = new Piloto(nombre, escuderia, puntos);
        AniadirLista.aniadirPilotos(pilotos, piloto);
        System.out.println("\nBusqueda de un piloto: ");
        BuscarLista.buscarPiloto("Sainz",pilotos);
        System.out.println("\nMostrar pilotos: ");
        MostrarLista.mostrarPilotos(pilotos);
        sc.nextLine();
    }
}