import java.util.*;

public class MusicDB {
    static MusicDB singleton;

    List<Music> songs;

    public static MusicDB getInstance() {
        if (singleton == null) singleton = new MusicDB();
        return singleton;
    }

    protected MusicDB() {
        songs = new ArrayList();
    }

    public void loadSong(Music song) {
        if (!songs.contains(song)) songs.add(song);
    }

    public Music getRandomSong() {
        if (songs.size() == 0) throw new RuntimeException("No hay canciones");

        Random rng = new Random();
        rng.setSeed(java.time.Clock.systemDefaultZone().millis());
        int index = rng.nextInt(songs.size());
        return songs.get(index);
    }
}
