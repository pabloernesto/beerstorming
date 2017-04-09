import java.util.List;
import java.util.LinkedList;

public class User {
    String name;
    List<Playback> playbacks;

    public User(String name) {
        this.name = name;
        this.playbacks = new LinkedList<Playback>();
    }

    public void addPlayback(Music song) {
        Playback p = getPlayback(song);
        if (p == null) p = new Playback(song);
        p.addPlayback();
    }

    public Playback getPlayback(Music song) {
        for (Playback p : playbacks)
            if (p.song.equals(song)) return p;
        return null;
    }
}
