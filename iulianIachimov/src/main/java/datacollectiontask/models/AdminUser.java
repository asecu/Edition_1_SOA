package datacollectiontask.models;

import java.util.Map;

public class AdminUser extends AbstractUser {
    public AdminUser(String username) {
        super(username);
    }

    public AdminUser(String username, Map<String, Address> addresses) {
        super(username, addresses);
    }

    public void approveOrder(AbstractOrder userorder) {
        System.out.println("Order " + userorder.getId() + " is approved");
    }

    public void rejectOrder(AbstractOrder userorder) {
        System.out.println("Order " + userorder.getId() + " is rejected");
    }

}
