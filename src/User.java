import java.util.List;
import java.util.LinkedList;

public class User {
    String name;
    List<Playback> playbacks;

    public User(String name) {
        this.name = name;
        this.playbacks = new LinkedList<Playback>();
    }

    public void addPlayback(String nombreDeCancion) {
        // buscar reproducciones de <nombreDeCancion>
        // sumarle uno
    }
}
