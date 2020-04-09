package datacollectiontask;

import datacollectiontask.models.*;

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

    Map<String, Address> addressMapThree = new HashMap<>();
    addressMapThree.put("Office", new Address("Germany", "Berlin", "15 Bonnstrasse"));

    Map<String, Address> addressMapFour = new HashMap<>();
    addressMapFour.put("Work", new Address("Sweden", "Stockholm", "2 Uber Str."));

    User userOne = new User("Jill Jackson", addressMapOne);
    User userTwo = new User("Adam Smith", addressMapTwo);
    Company companyOne = new Company("Nike", addressMapThree);
    AdminUser adminOne = new AdminUser("Greta Tunberg", addressMapFour);

    List<Item> itemListOne = new ArrayList<>();
    Item itemOne = new Item("Iphone", Type.GADGET, 500.89);
    Item itemTwo = new Item("Trousers", Type.CLOTHES, 55.25);
    itemListOne.add(itemOne);
    itemListOne.add(itemOne);
    itemListOne.add(itemTwo);

    List<Item> itemListTwo = new ArrayList<>();
    Item itemThree = new Item("Trotinette", Type.TOY, 124.99);
    Item itemFour = new Item("Frying Pan", Type.KITCHENWARE, 15.56);
    Item itemFive = new Item("Back Yard Light", Type.HOUSEHOLD_APPLIANCES, 26.99);
    itemListTwo.add(itemThree);
    itemListTwo.add(itemFour);
    itemListTwo.add(itemFive);

    List<Item> itemListThree = new ArrayList<>();
    Item itemSix = new Item("Bed", Type.HOUSEHOLD_APPLIANCES, 1500.00);
    itemListThree.add(itemSix);
    itemListThree.add(itemSix);

    List<Item> itemListFour = new ArrayList<>();
    Item itemSeven = new Item("Chair", Type.HOUSEHOLD_APPLIANCES, 45.00);
    itemListFour.add(itemSeven);

    AbstractOrder userOrderOne = new UserOrder(itemListOne, userOne);
    AbstractOrder userOrderTwo = new UserOrder(itemListTwo, userTwo);
    CompanyOrder companyOrderOne = new CompanyOrder(itemListThree, companyOne);

    List<AbstractOrder> userOrderList = new ArrayList<>();
    userOrderList.add(userOrderOne);
    userOrderList.add(userOrderTwo);
    userOrderList.add(companyOrderOne);

    AbstractOrder.filterOrderByItemType(userOrderList, Type.CLOTHES);

    List<AbstractUser> abstractUserList = new ArrayList<>();
    abstractUserList.add(userOne);
    abstractUserList.add(userTwo);
    abstractUserList.add(companyOne);

    User.filterUsersByCity(abstractUserList, "Chisinau");

    System.out.println("The sum of the items for order " + userOrderOne.getId() + " is " + userOrderOne.sum() + "$");
    System.out.println("The number of items for order " + userOrderTwo.getId() + " is " + userOrderTwo.count());
    System.out.println("The price of all the " + itemThree.getTitle() + "(s) from the current order is " + userOrderTwo.sum(itemThree) + "$");
    System.out.println("There is/are " + userOrderOne.count(itemOne) + " " + itemOne.getTitle() + "(s) in the current order");

    adminOne.approveOrder(userOrderOne);
    adminOne.rejectOrder(userOrderTwo);

  }
}