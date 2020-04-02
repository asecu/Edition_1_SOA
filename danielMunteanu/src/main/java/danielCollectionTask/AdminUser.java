package danielCollectionTask;

public class AdminUser extends AbstractUser {

    public AdminUser(String username) {
        super(username);
    }

    public void approveOrder(AbstractOrder order) {
        System.out.println("Approved order:\n" + order.toString());
    }

    public void rejectOrder(Order order) {
        System.out.println("Rejected order:\n" + order.toString());
    }

    @Override
    public String toString() {
        return "Admin" + super.toString();
    }
}