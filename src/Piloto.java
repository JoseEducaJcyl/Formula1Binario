// Piloto.java
import java.io.Serializable;

// Serializable permite guardar objetos Piloto en archivos binarios
public class Piloto implements Serializable {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String escuderia;
    private int puntos;

    // Constructor para crear nuevos pilotos
    public Piloto(String nombre, String escuderia, int puntos) {
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.puntos = puntos;
    }

    // Getters y setters (para acceder y modificar los atributos privados)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // toString personalizado para mostrar el piloto de forma legible
    @Override
    public String toString() {
        return "Piloto{" +
                "nombre='" + nombre + '\'' +
                ", escuderia='" + escuderia + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}
