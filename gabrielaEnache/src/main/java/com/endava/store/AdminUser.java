package com.endava.store;

public class AdminUser extends AbstractUser {

    public AdminUser(String userName) {
        super(userName);
    }

    public void approveOrder(Order order) {
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