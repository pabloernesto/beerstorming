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

    public void login(String n){
        rockola.notifyLogin(n);
    }

}
