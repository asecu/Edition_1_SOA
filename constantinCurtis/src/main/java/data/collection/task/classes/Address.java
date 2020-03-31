package data.collection.task.classes;

import java.util.ArrayList;
import java.util.List;

public class Address {
    public String country;
    public String city;
    public String street;

    public String getFullAddress() {
        List<String> addressList = new ArrayList<>();
        addressList.add(country);
        addressList.add(city);
        addressList.add(street);
        return String.join(" | ", addressList);
    }

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
