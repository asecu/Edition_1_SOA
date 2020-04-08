import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.UUID.randomUUID;

public abstract class AbstractUser {
    private final String id = randomUUID().toString();
    private final String username;
    private Map<String, Address> addresses;

    public AbstractUser(String username, Map<String, Address> addresses) {
        this.username = username;
        this.addresses = addresses;
    }

    public String getId() {
        return id;
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "AbstractUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    // creating methods to filter list of users by city
    public static List<AbstractUser> filterUsersByCity(List<AbstractUser> users, String city) {
        List<AbstractUser> userListResult = new ArrayList<>();
        for (AbstractUser user : users) {
            for (Map.Entry<String, Address> entry : user.getAddresses().entrySet()) {
                if (entry.getValue().city.equals(city)) {
                    userListResult.add(user);
                    break;
                }
            }
        }
        return userListResult;
    }

}
