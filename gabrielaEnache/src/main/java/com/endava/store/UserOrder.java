package com.endava.store;

import java.util.List;

public class UserOrder extends AbstractOrder {
    private final User user;

    public UserOrder(User user, List<Item> items) {
        super(items);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "User = " + user.getName() +
                "\nUser" + super.toString();
    }
}
