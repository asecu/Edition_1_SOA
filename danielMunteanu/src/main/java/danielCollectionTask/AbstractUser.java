package danielCollectionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public abstract class AbstractUser {
    private final String username;
    private final String id;
    private Map<String, Address> addresses;

    public AbstractUser(String username, Map<String, Address> addresses) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.addresses = addresses;
    }

    public AbstractUser(String username) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    public String getUsername() {
        return username;
    }

    public String getId() {
        return id;
    }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "AbstractUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    public static List<AbstractUser> filterUsersByCity(List<AbstractUser> users, String city) {
        List<AbstractUser> userListResult = new ArrayList<>();
        for (AbstractUser user : users) {
            for (Map.Entry<String, Address> entry : user.getAddresses().entrySet()) {
                if (entry.getValue().getCity().equals(city)) {
                    userListResult.add(user);
                    System.out.println("Username: " + user.getUsername() + ", Type of address = " + entry.getKey() + ", city = " + entry.getValue().getCity());
                    break;
                }
            }
        }
        return userListResult;
    }
}