package collections.store;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static long idCounter = 0;
    private long id;
    private LocalDateTime data;
    private User user;
    private List<Item> items;

    public Order(User user, List<Item> items) {
        this.id=idCounter++;
        this.data = LocalDateTime.now();
        this.user = user;
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void addAllItems(List<Item> list) {
        this.items.addAll(list);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void clearItemList() {
        this.items.clear();
    }

    public void removeMultipleItems(List<Item> list) {
        this.items.removeAll(list);
    }

    public static List<Order> filterOrdersByItemType(List<Order> listToSort, Type type) {
        List<Order> result = new ArrayList<>();
        for (Order order : listToSort) {
            if (order.containsItemType(type))
                result.add(order);
        }
        return result;
    }

    public boolean containsItemType(Type type) {
        for (Item item : this.getItems()) {
            if (type.equals(item.getType()))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Order: " +
                "id=" + id +
                ", data=" + data.toString() +
                ", user=" + user.getUserName() +
                ",\n shoppingItems=" + items.toString();
    }
}
