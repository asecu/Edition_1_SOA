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

        User user1 = new User("Daniel", addressMapOne);
        User user2 = new User("Egor", addressMapTwo);

        AdminUser admin = new AdminUser("Vasile");
        AdminUser admin2 = new AdminUser("Bob");

        List<AbstractUser> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);

        List<Item> itemList1 = new ArrayList<>();
        Item item = new Item("telefon", Type.CLOTHES, 189.12);
        Item item1 = new Item("bike", Type.GADGET, 150.65);
        itemList1.add(item);// add item to list
        itemList1.add(item1);

        List<Item> itemList2 = new ArrayList<>();
        Item item2 = new Item("nexus", Type.TOY, 346.96);
        Item item3 = new Item("nexus", Type.GADGET, 79.99);
        Item item4 = new Item("iphone", Type.GADGET, 89.99);
        itemList2.add(item2);
        itemList2.add(item3);
        itemList2.add(item4);

        UserOrder userOrderOne = new UserOrder(itemList1, user1);

        UserOrder userOrderTwo = new UserOrder(itemList2, user2);

        admin.approveOrder(userOrderTwo);
        admin2.rejectOrder(userOrderOne);

        List<AbstractOrder> userOrderList = new ArrayList<>();
        userOrderList.add(userOrderOne);
        userOrderList.add(userOrderTwo);

        //Filter Orders by TOY, filterOrderByItemType(orderList)
        List<AbstractOrder> filteredUserOrderList = UserOrder.filterOrdersByItemType(userOrderList, Type.TOY);
        System.out.println("the size of filtered order list is " + filteredUserOrderList.size());


        List<AbstractUser> filteredListofUsers;
        filteredListofUsers = AbstractUser.filterUsersByCity(usersList, "Chisinau"); // call for viewing the users from Chisinau city
        System.out.println("The filtered list of users is " + filteredListofUsers.size());

        System.out.println("Sum of order two is " + UserOrder.bigDecimal);
        System.out.println("Count or order two is : " + userOrderTwo.count());
        System.out.println("Date of order one is : " + userOrderOne.date());
        System.out.println("nr iteme identice " + userOrderTwo.count(item3));
        System.out.println("itemuri unice " + userOrderTwo.itemuriunice(item3, itemList2));
    }
}