import java.util.ArrayList;

public class GenerarDatos {
    public static ArrayList<Piloto> crearPilotos(ArrayList<Piloto> pilotos){
        pilotos.add(new Piloto("Verstappen","Red Bull",255));
        pilotos.add(new Piloto("Hamilton","Mercedes",190));
        pilotos.add(new Piloto("Alonso","Aston Martin",170));
        pilotos.add(new Piloto("Leclerc","Ferrari",185));

        return pilotos;

    }
}
