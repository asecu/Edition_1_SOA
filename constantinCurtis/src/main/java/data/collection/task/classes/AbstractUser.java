package data.collection.task.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public abstract class AbstractUser {
    private final String id;
    private final String username;
    private Map<String, Address> addresses;


    public AbstractUser(String username, Map<String, Address> addresses) {
        this.id = randomUUID();
        this.username = username;
        this.addresses = addresses;
    }

    public AbstractUser(String username) {
        this.id = randomUUID();
        this.username = username;
    }

    public String randomUUID() {
        return String.valueOf(UUID.randomUUID());
    }

    @Override
    public String toString() {
        return "AbstractUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    public String getId() {
        return id;
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }

    // create method to filter list of users by city
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
