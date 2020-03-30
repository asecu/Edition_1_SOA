package dataCollectionTask.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {
  public long id;
  public String username;
  public Map<String, Address> addresses;
  private static long idCounter;

  public User(String username, Map<String, Address> addresses) {
    this.id = ++idCounter;
    this.username = username;
    this.addresses = addresses;
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
