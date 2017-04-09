import java.util.Collection;
import java.util.HashSet;

public class WiFiSocial {
    static WiFiSocial singleton;

    Rockola rockola;
    Collection<String> usernames;

    public static WiFiSocial getInstance() {
        if (singleton == null) singleton = new WiFiSocial();
        return singleton;
    }

    protected WiFiSocial() {
        rockola = Rockola.getInstance();
        usernames = new HashSet();
    }

    public void login(String username) throws UnregisteredUserException {
        if (!usernames.contains(username))
            throw new UnregisteredUserException(username + "is not registered");
        rockola.notifyLogin(username);
    }

    public void addUser(String username) {
        usernames.add(username);
    }
}
