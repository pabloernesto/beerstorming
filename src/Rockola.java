import java.util.Map;
import java.util.HashMap;

public class Rockola {
    Map<String, Music> songs;
    Map<String, User> users;
    Map<String, User> logged_users;

    public Rockola() {
        songs = new HashMap();
        users = new HashMap();
        logged_users = new HashMap();
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
}
