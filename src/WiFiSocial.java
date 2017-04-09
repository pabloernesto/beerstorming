
public class WiFiSocial {
    Rockola rockola = Rockola.getInstance();
    String user;

    public void login(String n){
        rockola.notifyLogin(n);
    }

}
