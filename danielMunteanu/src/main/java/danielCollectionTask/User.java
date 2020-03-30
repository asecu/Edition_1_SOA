package danielCollectionTask;

import java.util.Map;

public class User {
    public long id;
    public String username;
    public Map<String, Address> addresses;

    public User(long id, String username, Map<String, Address> addresses) {
        this.id = id;
        this.username = username;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "danielCollectionTask.User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
