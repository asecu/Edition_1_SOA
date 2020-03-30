package danielCollectionTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FilterByCity {
    public static List<User> filterUsersByCity(List<User> users, String city) {
        List<User> userListResult = new ArrayList<>();
        for (User user : users) {
            for (Map.Entry<String, Address> entry : user.addresses.entrySet()) {
                if (entry.getValue().city.equals(city)) {
                    userListResult.add(user);
                    break;
                }
            }
        }
        return userListResult;
    }
}
