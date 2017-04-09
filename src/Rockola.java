import java.util.*;

public class Rockola {
    static Rockola singleton;

    List<Music> songs;
    Map<String, User> users;
    Map<String, User> logged_users;
    Music currentSong;
    Queue<Music> queue;

    public static Rockola getInstance() {
        if (singleton == null) singleton = new Rockola();
        return singleton;
    }

    protected Rockola() {
        songs = new ArrayList();
        users = new HashMap();
        logged_users = new HashMap();
        queue = new LinkedList();
    }

    public void notifyLogin(String username) {
        if (!isLogged(username))
            logged_users.put(username, users.get(username));
    }

    public boolean isLogged(String username) {
        return logged_users.containsKey(username);
    }

    public void notifyLogout(String username) {
        logged_users.remove(username);
    }

    public Music getCurrentlyPlaying() {
        if (currentSong == null) nextSong();
        return currentSong;
    }

    // Cambia el tema actual. Devuelve el nuevo tema.
    public Music nextSong() {
        currentSong = queue.poll();
        if (currentSong == null) currentSong = getRandomSong();
        return currentSong;
    }

    public Music getRandomSong() {
        if (songs.size() == 0) throw new RuntimeException("No hay canciones");
        int index = new Random().nextInt(songs.size());
        return songs.get(index);
    }
}
