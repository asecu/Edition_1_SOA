import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class User {

    private static long idCounter;
    public long id;
    public String username;
    public Map<String, Address> addresses;

    public User(String username, Map<String, Address> addresses) {
        this.id = ++idCounter;
        this.username = username;
        this.addresses = addresses;
    }

    // creating methods to filter list of users whose city is Chisinau
    public static List<User> filterUsersByCity(List<User> users, String city) {
        List<User> userListResult = new ArrayList<>();

        for (User user : users) {
            for (Map.Entry<String, Address> entry : user.addresses.entrySet()) {
                if (entry.getValue().city.equals(city)) {
                    userListResult.add(user);
                    System.out.println("Username: " + user.username + ", Type of address = " + entry.getKey() + ", city = " + entry.getValue().city);
                    break;
                }

            }
        }
        return userListResult;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
