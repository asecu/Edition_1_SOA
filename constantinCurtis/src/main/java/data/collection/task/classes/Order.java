package data.collection.task.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static long idCounter = 0;
    public long id;
    public LocalDate date;
    public User user;
    public List<Item> items;


    public Order(User user, List<Item> items) {
        this.id = ++idCounter;
        this.date = LocalDate.now();
        this.user = user;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                ", items=" + items +
                '}';
    }

    // creating method to filter the orders by type CLOTHES
    public static List<Order> filterOrderByItemType(List<Order> orderList, Type type) {
        List<Order> orderResult = new ArrayList<>(); // creating a list to store the result
        for (Order order : orderList) {
            for (Item item : order.items) {
                if (type == item.type) {
                    orderResult.add(order);
                    System.out.println("Order " + order.id + " from " + order.date + " contains type Clothes");
                    break;
                }
            }
        }
        return orderResult;
    }


}



