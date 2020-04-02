package collections;

import collections.store.Address;
import collections.store.Item;
import collections.store.Order;
import collections.store.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collections.store.Order.filterOrdersByItemType;
import static collections.store.Type.CLOTHES;
import static collections.store.Type.TOY;
import static collections.store.User.filerUsersByCity;

public class Main {
    public static void main(String[] args) {
        Item toy = new Item("Bear", TOY);
        Item cloth = new Item("T-shirt", CLOTHES);
        Item toy1 = new Item("Car", TOY);
        Item toy2 = new Item("Doll", TOY);

        List<Item> firstItemList = new ArrayList<>();
        firstItemList.add(toy);
        firstItemList.add(cloth);

        List<Item> secondItemList = new ArrayList<>();
        secondItemList.add(toy1);
        secondItemList.add(toy2);

        Address ad1 = new Address("Moldova", "Chisinau", "Bulevardul Dacia");
        Address ad2 = new Address("Moldova", "Balti", "Decebal 10");

        User mihai = new User("Mihai");
        mihai.addAddress("Home", ad1);

        User ion = new User("Ion");
        ion.addAddress("Work", ad2);
        List<User> userList = new ArrayList<>(Arrays.asList(mihai, ion));

        Order order = new Order(mihai, firstItemList);
        Order order1 = new Order(ion, secondItemList);

        List<Order> orderList = new ArrayList<>(Arrays.asList(order, order1));

        System.out.println("Filer orders by Item: " + filterOrdersByItemType(orderList, CLOTHES));
        System.out.println("Filter users by City: " + filerUsersByCity(userList, "Chisinau"));
    }
}
