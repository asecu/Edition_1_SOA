package dataCollectionTask.Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
  public final String id;
  public final LocalDateTime date;
  public User user;
  public List<Item> items;

  private static long idCounter;

  public Order(User user, List<Item> items) {
    this.id = id();
    this.date = LocalDateTime.now();
    this.user = user;
    this.items = items;
  }

  @Override
  public String toString() {
    return "Order{" + "id=" + id + ", date=" + date + ", user=" + user + ", items=" + items + '}';
  }

  public static List<Order> filterOrderByItemType(List<Order> orderList, Type type) {
    List<Order> orderResult = new ArrayList<>(); // creating a list to store the result
    for (Order order : orderList) {
      for (Item item : order.items) {
        if (type == item.type) {
          orderResult.add(order);
          System.out.println(
                  "Order " + order.id + " from " + order.date + " contains type " + type);
          break;
        }
      }
    }
    return orderResult;
  }

  public static String id() {
    return String.valueOf(UUID.randomUUID());
  }
}
