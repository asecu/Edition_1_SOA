package data.collection.task.classes;

import data.collection.task.interfaces.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractOrder implements Order {
    private final String id;
    private final LocalDateTime date;
    private List<Item> items;


    public AbstractOrder(List<Item> items) {
        this.id = randomUUID();
        this.date = LocalDateTime.now();
        this.items = items;
    }

    private String randomUUID() {
        return String.valueOf(UUID.randomUUID());
    }

    @Override
    public int count() {
        return this.items.size();
    }

    public int count(Item item) {
        int itemSize = 0;
        for (Item entity : this.items) {
            if (entity.getTitle().equalsIgnoreCase(item.getTitle()))
                itemSize++;
        }
        return itemSize;
    }

    @Override
    public LocalDateTime date() {
        return this.date;
    }

    @Override
    public String toString() {
        return "AbstractOrder{" +
                "id=" + id +
                ", date=" + date +
                ", items=" + items +
                '}';
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
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
        double totalSum = 0;

        for (Item entity : this.items) {
            if (entity.getTitle().equalsIgnoreCase(item.getTitle()))
                totalSum += item.getPrice();
        }
        return totalSum;
    }

    // creating method to filter the orders by type
    public static List<AbstractOrder> filterOrderByItemType(List<AbstractOrder> abstractOrderList, Type type) {
        List<AbstractOrder> orderResult = new ArrayList<>(); // creating a list to store the result
        for (AbstractOrder order : abstractOrderList) {
            for (Item item : order.items) {
                if (type == item.getType()) {
                    orderResult.add(order);
                    break;
                }
            }
        }
        return orderResult;
    }
}
