import java.util.Map;


public class User extends AbstractUser {
    public User(String username, Map<String, Address> addresses) {
        super(username, addresses);
    }


}

