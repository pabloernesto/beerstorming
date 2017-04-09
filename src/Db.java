import java.util.Map;
import java.util.HashMap;

public class Db {
    Map<String, User> user_store;

    public Db() {
        user_store = new HashMap<String, User>();
    }

    public User getUser(String name) {
        return user_store.get(name);
    }

    public void addUser(String name) {
        if (getUser(name) == null)
            user_store.put(name, new User(name));
    }
}
