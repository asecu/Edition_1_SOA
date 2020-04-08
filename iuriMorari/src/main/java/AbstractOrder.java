import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractOrder implements Order {
    private final String id;
    private final LocalDateTime date;
    private List<Item> items;

    public AbstractOrder(List<Item> items) {
        this.id = UUID.randomUUID().toString();
        this.date = LocalDateTime.now();
        this.items = items;
    }

    public String getID() {
        return String.valueOf(UUID.randomUUID());
    }

    public LocalDateTime getDate() {
        return date;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public double sum() {
        double lumpAmount = 0;
        for (Item item : this.items) {
            lumpAmount += item.getPrice();
        }
        return lumpAmount;
    }

    public double sum(Item itemToFilter) {
        double lumpAmount = 0;
        for (Item item : this.items) {
            if (item.getTitle().equalsIgnoreCase(itemToFilter.getTitle())) {
                lumpAmount += itemToFilter.getPrice();
            }
        }
        return lumpAmount;
    }

    @Override
    public int count() {
        return this.items.size();
    }

    public int count(Item item) {
        int countSize = 0;
        for (Item size : this.items) {
            countSize++;
        }
        return countSize;
    }

    @Override
    public LocalDateTime dateTime() {
        return this.date;
    }

    @Override
    public String toString() {
        return "AbstractOrder{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", items=" + items +
                '}';

    }

    //creating method to filter list of orders by type
    public static List<AbstractOrder> filterOrderByItemType(List<AbstractOrder> ListOfOrders, Type type) {
        List<AbstractOrder> orderResult = new ArrayList<>();
        for (AbstractOrder order : ListOfOrders) {
            for (Item item : order.getItems()) {
                if (type == item.getType()) {
                    orderResult.add(order);
                    break;
                }
            }
        }
        return orderResult;
    }
}
