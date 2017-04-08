
public class WiFiSocial {
	Rockola rockola = new Rockola();
	Db db = new Db();
	String user;

	public void login(String n) {
		Usuario u = db.getUser(n);
		rockola.notificarLogueo(u);
	}

}
