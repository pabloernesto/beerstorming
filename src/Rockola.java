
public class Rockola {
	Db db = new Db();
	String user;

	public void login(String n) {
		db.getUser(n);
		
	}

}
