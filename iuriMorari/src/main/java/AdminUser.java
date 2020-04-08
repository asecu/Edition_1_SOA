import java.util.Map;

public class AdminUser extends AbstractUser {

    public AdminUser(String username, Map<String, Address> addresses) {
        super(username, addresses);
    }
    public void approveOrder(AbstractOrder abstractOrder) {
        System.out.println("Order " + abstractOrder.getID() + " is approved");
    }

    public void rejectOrder(AbstractOrder abstractOrder) {
        System.out.println("Order " + abstractOrder.getID() + " is rejected");
    }
}
