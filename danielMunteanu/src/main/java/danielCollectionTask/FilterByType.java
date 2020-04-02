package danielCollectionTask;

import java.util.ArrayList;
import java.util.List;

public class FilterByType {
    public static List<Order> filterOrderByItemType(List<Order> orderList) {
        List<Order> orderResult = new ArrayList<>(); // creates a list to store the result
        for (Order order : orderList) {
            for (Item item : order.items) {
                if (item.getType() == Type.TOY) {
                    orderResult.add(order);
                    System.out.println("Item ID -> " + item.id + " from Order ID -> " + order.getId() + " from date " + order.getDate() + " contains type " + Type.TOY + " and name is -> " + item.getTitle());
                    break;
                }
            }
        }
        return orderResult;
    }
}
