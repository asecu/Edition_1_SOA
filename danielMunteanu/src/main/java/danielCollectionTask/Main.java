package danielCollectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Moldova", "Chisinau", "Decebal");
        Address address2 = new Address("Italy", "Roma", "Padre");

        Map<String, Address> addressMapOne = new HashMap();
        addressMapOne.put("Home", address1);
        addressMapOne.put("Work", address2);

        Map<String, Address> addressMapTwo = new HashMap();
        addressMapTwo.put("Home", new Address("Romania", "Bucurest", "Stefan cel Mare"));

        User user1 = new User(1, "Daniel", addressMapOne);
        User user2 = new User(2, "Egor", addressMapTwo);

        List<User> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);

        List<Item> itemList1 = new ArrayList<>();
        Item item = new Item("telefon", Type.CLOTHES);
        Item item1 = new Item("bike", Type.TOY);
        itemList1.add(item);// add item to list
        itemList1.add(item1);

        List<Item> itemList2 = new ArrayList<>();
        Item item2 = new Item("bear", Type.GADGET);
        Item item3 = new Item("nexus", Type.TOY);
        itemList2.add(item2);
        itemList2.add(item3);

        Order orderOne = new Order();
        orderOne.setItems(itemList1);
        orderOne.setUser(user1);
        orderOne.getDate();

        Order orderTwo = new Order();
        orderTwo.setItems(itemList2);
        orderTwo.setUser(user2);
        orderTwo.getDate();

        List<Order> orderList = new ArrayList<>();
        orderList.add(orderOne);
        orderList.add(orderTwo);

        //Filter Orders by TOY, filterOrderByItemType(orderList)
        List<Order> filteredOrderList = FilterByType.filterOrderByItemType((orderList));
        System.out.println("the size of filtered order list is " + filteredOrderList.size());

        List<User> filteredListofUsers;
        filteredListofUsers = FilterByCity.filterUsersByCity(usersList, "Chisinau"); // call for viewing the users from Chisinau city
        System.out.println("The filtered list of users by city is " + filteredListofUsers.size());

    }
}
