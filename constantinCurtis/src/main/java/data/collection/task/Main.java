package data.collection.task;

import data.collection.task.classes.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        //create Items for ItemLists
        Item itemJeans = new Item("Jeans", Type.CLOTHES, 27.1);
        Item itemBall = new Item("Ball", Type.TOY, 28.5);
        Item itemPhone = new Item("Iphone", Type.TOY, 45.4);
        Item itemSamsung = new Item("Samsung", Type.GADGET, 28.7);
        Item itemJacket = new Item("Jacket", Type.CLOTHES, 35.4);

        //create Item Lists
        List<Item> ItemFirstList = new ArrayList<>();
        List<Item> ItemSecondList = new ArrayList<>();

        // adding items to ItemFinal List
        ItemFirstList.add(itemJeans);
        ItemFirstList.add(itemBall);
        ItemFirstList.add(itemPhone);
        ItemSecondList.add(itemSamsung);
        ItemSecondList.add(itemJacket);
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

        // counting items
        UserOrder userOrder = new UserOrder(ItemFirstList, userConstantin);
        System.out.println("Quantity items: " + userOrder.count());

        //Counting items by title
        UserOrder userOrder2 = new UserOrder(ItemSecondList, userKevin);
        System.out.println("Quantity items by title: " + userOrder2.count(itemJacket));

        //Create 2 objects of Order type ()
        UserOrder userOrderConstantin = new UserOrder(ItemFirstList, userConstantin);
        UserOrder userOrderKevin = new UserOrder(ItemSecondList, userKevin);
        System.out.println("The Date of Order Creation is: " + userOrderConstantin.getDate());
        System.out.println("Sum of items in one order: " + userOrderConstantin.sum());
        System.out.println("Sum of items by title : " + userOrderKevin.sum(itemJacket));

        //Create list of orders
        List<AbstractOrder> userOrderList = new ArrayList<>();
        userOrderList.add(userOrderConstantin);
        userOrderList.add(userOrderKevin);

        //Creating AdminUser to verify void reject method
        AdminUser adminUserJack = new AdminUser("Jack Paul", addressMapFirst);
        adminUserJack.approveOrder(userOrderConstantin);

        AdminUser adminUserJason = new AdminUser("Jason Paul", addressMapSecond);
        adminUserJason.rejectOrder(userOrderKevin);

        //Filter Orders by Type CLOTHES, calling function filterOrderByItemType(orderList)
        List<AbstractOrder> filteredUserOrderList = UserOrder.filterOrderByItemType(userOrderList, Type.CLOTHES);
        LOGGER.info("Number of orders:" + filteredUserOrderList.size());

        // Creating the list for users
        List<AbstractUser> userList = new ArrayList<>();
        userList.add(userConstantin);
        userList.add(userKevin);

        //Filter users by city
        List<AbstractUser> filteredListofUsers = new ArrayList<>();
        filteredListofUsers = User.filterUsersByCity(userList, "Chisinau"); // Looks for the users from Chisinau city
        System.out.println("Number of users from Chisinau:" + filteredListofUsers.size());
    }
}

