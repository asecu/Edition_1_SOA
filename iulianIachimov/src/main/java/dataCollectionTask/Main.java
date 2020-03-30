package dataCollectionTask;

import dataCollectionTask.Models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    Address homeAddressOne = new Address("UK", "Liverpool", "89 Baker Str.");
    Address workAddressOne = new Address("UK", "Bournemouth", "15 King Str.");

    Map<String, Address> addressMapOne = new HashMap();
    addressMapOne.put("Home", homeAddressOne);
    addressMapOne.put("Work", workAddressOne);

    Map<String, Address> addressMapTwo = new HashMap();
    addressMapTwo.put("Home", new Address("Republic of Moldova", "Chisinau", "12 Dacia Str."));
    addressMapTwo.put("Work", new Address("Republic of Moldova", "Chisinau", "45/3 Hotin Str."));

    User userOne = new User("Jill Jackson", addressMapOne);
    User userTwo = new User("Adam Smith", addressMapTwo);

    List<Item> ItemListOne = new ArrayList<>();
    Item itemOne = new Item("Iphone", Type.GADGET);
    Item itemTwo = new Item("Trousers", Type.CLOTHES);
    ItemListOne.add(itemOne);
    ItemListOne.add(itemTwo);

    List<Item> ItemListTwo = new ArrayList<>();
    Item itemThree = new Item("Trotinette", Type.TOY);
    Item itemFour = new Item("Frying Pan", Type.KITCHENWARE);
    ItemListTwo.add(itemThree);
    ItemListTwo.add(itemFour);

    Order orderOne = new Order(userOne, ItemListOne);
    Order orderTwo = new Order(userTwo, ItemListTwo);
    System.out.println(orderOne.user.username + " ordered the following items " + ItemListOne);
    System.out.println(orderTwo.user.username + " ordered the following items " + ItemListTwo);

    List<Order> orderList = new ArrayList<>();
    orderList.add(orderOne);
    orderList.add(orderTwo);

    Order.filterOrderByItemType(orderList, Type.CLOTHES);

    List<User> userList = new ArrayList<>();
    userList.add(userOne);
    userList.add(userTwo);

    User.filterUsersByCity(userList, "Chisinau");

  }
}
