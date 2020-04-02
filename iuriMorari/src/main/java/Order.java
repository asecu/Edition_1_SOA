import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public long id;
    public LocalDateTime date;
    public User user;
    public List<Item> items;
    static long idCounter;

    public Order(User user, List<Item> items) {
        this.id = ++idCounter;
        this.date = LocalDateTime.now();
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

    // creating function to filter list of orders that have clothes
    public static List<Order> filterOrderByItemType(List<Order> ListOfOrders, Type type) {
        List<Order> orderResult = new ArrayList<>();
        for (Order order : ListOfOrders) {
            for (Item item : order.items) {
                if (type == item.type) {
                    orderResult.add(order);
                }
            }
        }
        return orderResult;
    }
}
