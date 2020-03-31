package collections.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private static long idCounter = 0;
    private long id;
    private String userName;
    private Map<String, Address> address;

    public User(String userName) {
        this.id = idCounter++;
        this.userName = userName;
        this.address = new HashMap<>();
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, Address> getAddress() {
        return address;
    }

    public void setAddress(Map<String, Address> address) {
        this.address = address;
    }

    public void addAddress(String type, Address address) {
        this.address.put(type, address);
    }

    public void removeAddress(String type) {
        this.address.remove(type);
    }

    public static List<User> filerUsersByCity(List<User> userList, String city) {
        List<User> result = new ArrayList<>();
        for (User user : userList)
            if (user.isFromCity(city))
                result.add(user);
        return result;
    }

    public boolean isFromCity(String city) {
        for (String key : this.getAddress().keySet()) {
            if (this.getAddress().get(key).getCity().equalsIgnoreCase(city))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + id +
                ", userName='" + userName + "'" +
                ", " + address.toString();
    }
}
