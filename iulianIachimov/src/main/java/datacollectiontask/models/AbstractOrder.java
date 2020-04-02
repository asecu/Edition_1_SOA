package datacollectiontask.models;

import datacollectiontask.interfaces.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractOrder implements Order {
  private final UUID id;
  private final LocalDateTime date;
  private List<Item> items;

  public AbstractOrder(List<Item> items) {
    this.id = UUID.randomUUID();
    this.date = date();
    this.items = items;
  }

  @Override
  public double sum() {
    double totalSum = 0;
    for (Item item : this.items) {
      totalSum += item.getPrice();
    }
    return totalSum;
  }

  public double sum(Item item) {
    double totalSumOfItem = 0;
    for (Item uniqueItem : this.items) {
      if (uniqueItem.getTitle().equals(item.getTitle())) {
        totalSumOfItem += item.getPrice();
      }
    }
    return totalSumOfItem;
  }

  @Override
  public int count() {
    return this.items.size();
  }

  public int count(Item item) {
    int totalCountOfItem = 0;
    for (Item uniqueItem : this.items) {
      if (uniqueItem.getTitle().equals(item.getTitle())) {
        totalCountOfItem++;
      }
    }
    return totalCountOfItem;
  }

  @Override
  public LocalDateTime date() {
    return LocalDateTime.now();
  }

  public UUID getId() {
    return id;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public static List<AbstractOrder> filterOrderByItemType(
          List<AbstractOrder> userOrderList, Type type) {
    List<AbstractOrder> userOrderResult = new ArrayList<>();
    for (AbstractOrder userOrder : userOrderList) {
      for (Item item : userOrder.getItems()) {
        if (type == item.getType()) {
          userOrderResult.add(userOrder);
          System.out.println(
                  "UserOrder "
                          + userOrder.getId()
                          + " from "
                          + userOrder.getDate()
                          + " contains type "
                          + type);
          break;
        }
      }
    }
    return userOrderResult;
  }
}
