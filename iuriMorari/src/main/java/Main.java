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

        //creating items 1
        List<Item> FirstItemList = new ArrayList<>();
        Item itemPc = new Item("Electronics", Type.PC, 55.22);
        Item itemBoots = new Item("Boots", Type.BOOTS, 99.11);
        Item itemDress = new Item("Dress", Type.CLOTHES, 66.23);

        FirstItemList.add(itemPc);
        FirstItemList.add(itemBoots);
        FirstItemList.add(itemDress);

        //creating items 2
        List<Item> SecondItemList = new ArrayList<>();
        Item itemShort = new Item("T-short", Type.CLOTHES, 44.12);
        Item itemBlazer = new Item("Blazer", Type.CLOTHES, 36.43);
        Item itemBlazer2 = new Item("Blazer", Type.CLOTHES, 36.43);

        SecondItemList.add(itemShort);
        SecondItemList.add(itemBlazer);

        //creating 2 objects of order
        UserOrder FirstOrder = new UserOrder(FirstItemList, FirstUser);
        UserOrder SecondOrder = new UserOrder(SecondItemList, SecondUser);
        AdminUser admin = new AdminUser("Mihail Nastase", FullAddressOne);
        admin.approveOrder(FirstOrder);
        admin.rejectOrder(FirstOrder);

        FirstOrder.getDate();
        System.out.println("Today is date: " + FirstOrder.getDate());
        //creating catalog of orders
        List<AbstractOrder> OrderCatalog = new ArrayList<>();
        OrderCatalog.add(FirstOrder);
        OrderCatalog.add(SecondOrder);

        System.out.println("Total cost of order: " + SecondOrder.sum());
        System.out.println("Cost of order Blazer: " + SecondOrder.sum(itemBlazer));

        //Filter orders by calling method filterOrderByItemType(OrderCatalog) from UserOrder.java
        List<AbstractOrder> filteredCatalog = AbstractOrder.filterOrderByItemType(OrderCatalog, Type.CLOTHES);
        System.out.println("The quantity of orders that consist CLOTHES: " + filteredCatalog.size());

        //creating catalog of users
        List<AbstractUser> CatalogOfUsers = new ArrayList<>();
        CatalogOfUsers.add(FirstUser);
        CatalogOfUsers.add(SecondUser);

        //Filter orders by calling method filterUsersByCity(OrderCatalog) from user.java
        List<AbstractUser> UserCatalog;
        UserCatalog = AbstractUser.filterUsersByCity(CatalogOfUsers, "Chisinau"); // call for viewing the users from Chisinau city
        System.out.println("The filtered list of users from city Chisinau is: " + UserCatalog);


    }
}
