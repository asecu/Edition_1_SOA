package danielCollectionTask;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;


public class UserOrder extends AbstractOrder {
    private User user;

    static BigDecimal bigDecimal;

    public UserOrder(List<Item> items, User user) {
        super(items);
        this.user = user;
        bigDecimal = new BigDecimal(sum()).setScale(2, RoundingMode.HALF_UP);
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "user=" + user +
                '}';
    }

    @Override
    public boolean containsItemType(Type type) {
        return false;
    }
}