package com.endava.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractUser {
    private static long idCounter = 0;
    private final long id;
    private Map<String, Address> address;
    private final String name;

    protected AbstractUser(String name) {
        this.id = idCounter++;
        this.name = name;
        this.address = new HashMap<>();
    }

    public String getName() {
        return name;
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

    public static List<AbstractUser> filterByCity(List<AbstractUser> userList, String city) {
        List<AbstractUser> result = new ArrayList<>();
        for (AbstractUser user : userList)
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
        return " User" +
                "Id = " + id +
                ", userName = " + name +
                ", " + address.toString();
    }
}
