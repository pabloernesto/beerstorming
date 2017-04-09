import java.util.Map;
import java.util.HashMap;

public class Db {
    Map<String, Usuario> user_store;

    public Db() {
        user_store = new HashMap<String, Usuario>();
    }

    public Usuario getUser(String name) {
        return user_store.get(name);
    }
}
