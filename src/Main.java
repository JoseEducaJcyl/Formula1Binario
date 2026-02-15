// Main.java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Para leer lo que escriba el usuario
        
        // Creo una lista vacía de pilotos
        ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
        
        // 1. Genero los pilotos de ejemplo (Verstappen, Hamilton, etc.)
        GenerarDatos.crearPilotos(pilotos);
        
        // 2. Guardo la lista en un archivo binario llamado "pilotos.dat"
        Escritor.escribirPilotos("pilotos.dat", pilotos);
        
        // 3. Leo los pilotos desde el archivo (pero no guardo el resultado)
        Lector.leerPilotos("pilotos.dat");
        
        // 4. Pido datos para añadir un piloto nuevo
        System.out.println("Añadir un piloto: ");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine(); // Leo el nombre
        System.out.println("Escuderia: ");
        String escuderia = sc.nextLine(); // Leo la escudería
        System.out.println("Puntos: ");
        int puntos = sc.nextInt(); // Leo los puntos
        
        // Creo el piloto nuevo con los datos que me dio el usuario
        Piloto piloto = new Piloto(nombre, escuderia, puntos);
        
        // Añado el piloto a la lista usando el método de AniadirLista
        AniadirLista.aniadirPilotos(pilotos, piloto);
        
        // 5. Busco un piloto 
        System.out.println("\nBusqueda de un piloto: ");
        BuscarLista.buscarPiloto("Sainz", pilotos);
        
        // 6. Muestro todos los pilotos
        System.out.println("\nMostrar pilotos: ");
        MostrarLista.mostrarPilotos(pilotos);
        
        sc.nextLine(); // Esto limpia el buffer del Scanner (por si acaso)
    }
}
