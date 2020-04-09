package datacollectiontask.models;

import java.util.List;

public class UserOrder extends AbstractOrder {
    private final User user;

    public UserOrder(List<Item> items, User user) {
        super(items);
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
