public class Reproduccion {
    Musica cancion;
    Integer num_repr;

    public Reproduccion(Musica m) {
        cancion = m;
        num_repr = 0;
    }

    public void sumarReproduccion() {
        num_repr += 1;
    }
}
