import java.util.List;
import java.util.LinkedList;

public class Usuario {
    String nombre;
    List<Reproduccion> reproducciones;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.reproducciones = new LinkedList<Reproduccion>();
    }

    public void sumarReproduccion(String nombreDeCancion) {
        // buscar reproducciones de <nombreDeCancion>
        // sumarle uno
    }
}
