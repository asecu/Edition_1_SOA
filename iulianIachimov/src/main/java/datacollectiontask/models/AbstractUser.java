package datacollectiontask.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public abstract class AbstractUser {
    private final UUID id;
    private final String username;
    private Map<String, Address> addresses;


    public AbstractUser(String username, Map<String, Address> addresses) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.addresses = addresses;
    }

    public AbstractUser(String username) {
        this.username = username;
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "User{"
                + "id="
                + id
                + ", username='"
                + username
                + '\''
                + ", addresses="
                + addresses
                + '}';
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }

    public static List<AbstractUser> filterUsersByCity(List<AbstractUser> users, String city) {
        List<AbstractUser> userListResult = new ArrayList<>();
        for (AbstractUser user : users) {
            for (Map.Entry<String, Address> entry : user.getAddresses().entrySet()) {
                if (entry.getValue().getCity().equals(city)) {
                    userListResult.add(user);
                    break;
                }
            }
        }
        return userListResult;
    }
}
