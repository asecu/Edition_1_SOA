package datacollectiontask.models;

import java.util.Map;

public class Company extends AbstractUser {

    public Company(String username, Map<String, Address> addresses) {
        super(username, addresses);
    }

    public Company(String username) {
        super(username);
    }
}
