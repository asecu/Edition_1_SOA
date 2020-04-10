package data.collection.task.classes;

import java.util.Map;

public class AdminUser extends AbstractUser {

    public AdminUser(String username, Map<String, Address> addresses) {
        super(username, addresses);
    }

    public AdminUser(String username) {
        super(username);
    }

    public void approveOrder(AbstractOrder userOrder) {
        System.out.println("Order " + userOrder.getId() + " is approved");
    }

    public void rejectOrder(AbstractOrder userOrder) {
        System.out.println("Order " + userOrder.getId() + " is rejected");
    }

}
