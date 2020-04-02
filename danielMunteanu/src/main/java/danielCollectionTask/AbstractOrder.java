package danielCollectionTask;

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

    private static String id() {
        return String.valueOf(UUID.randomUUID());
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public List<Item> getItems() {
        return items;
    }


    public int count(Item item) {
        int nrofitems = 0;
        for (Item uniqueItem : this.items) {
            if (uniqueItem.getTitle().equals(item.getTitle())) {
                nrofitems += 1;
            }
        }
        return nrofitems;
    }

    public double itemuriunice(Item item, List<Item> items) {
        double sumaunica = 0D;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getTitle().equals(item.getTitle()))
                sumaunica++;
        }
        return sumaunica;
    }


    @Override
    public double sum() {
        double sum = 0D;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getPrice();
        }
        return sum;
    }

    @Override
    public double sum(List<Item> items) {
        double totalSum = 0D;
        for (Item item : items) {
            totalSum += item.getPrice();
        }
        return totalSum;
    }

    @Override
    public int count() {
        return this.items.size();
    }

    @Override
    public LocalDateTime date() {
        return this.date;
    }

    // just added
    public static List<AbstractOrder> filterOrdersByItemType(List<AbstractOrder> listToSort, Type type) {
        List<AbstractOrder> result = new ArrayList<>();
        for (AbstractOrder abstractOrder : listToSort) {
            for (Item item : abstractOrder.getItems()) {
                if (type == item.getType()) {
                    result.add(abstractOrder);
                    break;
                }


            }
        }
        return result;
    }

    public abstract boolean containsItemType(Type type);
}