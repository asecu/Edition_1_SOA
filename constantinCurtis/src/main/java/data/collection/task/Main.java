package data.collection.task;

import data.collection.task.classes.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static data.collection.task.classes.Order.filterOrderByItemType;
import static data.collection.task.classes.User.filterUsersByCity;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        //create items
        List<Item> ItemFirstList = new ArrayList<>();
        Item itemJeans = new Item("Jeans", Type.CLOTHES);
        Item itemBall = new Item("Ball", Type.TOY);
        //create second Item List

        List<Item> ItemSecondList = new ArrayList<>();
        Item itemSamsung = new Item("Samsung", Type.GADJET);
        Item itemJacket = new Item("Jacket", Type.CLOTHES);

        // adding items to ItemFinal List
        ItemFirstList.add(itemJeans);
        ItemFirstList.add(itemBall);
        ItemSecondList.add(itemSamsung);
        ItemSecondList.add(itemJacket);

        //Create address
        Map<String, Address> addressMapFirst = new HashMap();
        addressMapFirst.put("Home", new Address("Republic of Moldova", "Chisinau", "62 Arborilor Str."));
        addressMapFirst.put("Work", new Address("Republic of Moldova", "Chisinau", "15 Dacia Str."));

        Map<String, Address> addressMapSecond = new HashMap();
        addressMapSecond.put("Home", new Address("UK", "London", "12 Stamford Bridge str."));
        addressMapSecond.put("Work", new Address("Russia", "Moscow", "10 Balalaika Str."));

        //create additional address to check getFullAddress method
        Address address1 = new Address("UK", "London", "12 Stamford Bridge str.");
        System.out.println(address1.getFullAddress());

        //Create users
        User userConstantin = new User("Constantin Newman", addressMapFirst);
        User userKevin = new User("Kevin Fisher", addressMapSecond);

        //Create 2 objects of Order type ()

        Order orderConstantin = new Order(userConstantin, ItemFirstList);
        Order orderKevin = new Order(userKevin, ItemSecondList);

        //Create list of orders
        List<Order> orderList = new ArrayList<>();
        orderList.add(orderConstantin);
        orderList.add(orderKevin);

        //Filter Orders by Type CLOTHES, calling function filterOrderByItemType(orderList)
        List<Order> filteredOrderList = filterOrderByItemType(orderList, Type.CLOTHES);
        LOGGER.info("Number of orders:" + filteredOrderList.size());

        // Creating the list for users
        List<User> userList = new ArrayList<>();
        userList.add(userConstantin);
        userList.add(userKevin);

        // Filter users by city
        List<User> filteredListofUsers = new ArrayList<>();
        filteredListofUsers = filterUsersByCity(userList, "Chisinau"); // Looks for the users from Chisinau city
        System.out.println("Number of users:" + filteredListofUsers.size());
    }
}

