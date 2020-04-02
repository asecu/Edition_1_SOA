import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //creating addresses collections
        Address FirstAddress = new Address("England", "London", "Manchester");
        Address SecondAddress = new Address("Romania", "Cluj", "Bogdan Voevod");
        Address FirstAddress2 = new Address("Moldova", "Chisinau", "Dimo");
        Address SecondAddress2 = new Address("Moldova", "Orhei", "Stefan cel Mare");
        Map<String, Address> FullAddressOne = new HashMap();
        FullAddressOne.put("1house", FirstAddress);
        FullAddressOne.put("2house", SecondAddress);
        Map<String, Address> FullAddressTwo = new HashMap();
        FullAddressTwo.put("1house", FirstAddress2);
        FullAddressTwo.put("2house", SecondAddress2);

        //creating users objects
        User FirstUser = new User("Pedro Malucious", FullAddressOne);
        User SecondUser = new User("Stanislav Groppa", FullAddressTwo);

        //creating item collection1
        List<Item> FirstItemList = new ArrayList<>();
        Item firstItem = new Item("electronicsItem", Type.PC, 55);
        Item secondItem = new Item("Boots", Type.BOOTS, 99);
        Item thirdItem = new Item("Dress", Type.CLOTHES, 66);
        FirstItemList.add(firstItem);
        FirstItemList.add(secondItem);
        FirstItemList.add(thirdItem);


        //creating item collection2
        List<Item> SecondItemList = new ArrayList<>();
        Item firstItem2 = new Item("T-short", Type.CLOTHES, 44);
        Item secondItem2 = new Item("Dress2", Type.CLOTHES, 36);
        FirstItemList.add(firstItem2);
        FirstItemList.add(secondItem2);

        //creating 2 objects of order
        Order FirstOrder = new Order(FirstUser, FirstItemList);
        Order SecondOrder = new Order(SecondUser, SecondItemList);

        //creating catalog of orders
        List<Order> OrderCatalog = new ArrayList<>();
        OrderCatalog.add(FirstOrder);
        OrderCatalog.add(SecondOrder);

        //Filter orders by calling function filterOrderByItemType(OrderCatalog) from Order.java
        List<Order> filteredCatalog = Order.filterOrderByItemType(OrderCatalog, Type.CLOTHES);
        System.out.println("The quantity of orders that consist CLOTHES: " + filteredCatalog.size());

        //creating catalog of users
        List<User> CatalogOfUsers = new ArrayList<>();
        CatalogOfUsers.add(FirstUser);
        CatalogOfUsers.add(SecondUser);

        //Filter orders by calling method filterUsersByCity(OrderCatalog) from user.java
        List<User> UserCatalog;
        UserCatalog = User.filterUsersByCity(CatalogOfUsers, "Chisinau"); // call for viewing the users from Chisinau city
        System.out.println("The filtered list of users from city Chisinau is: " + UserCatalog);


    }
}
