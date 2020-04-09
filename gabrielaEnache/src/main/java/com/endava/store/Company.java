package com.endava.store;

public class Company extends AbstractUser {

    public Company(String companyName) {
        super(companyName);
    }

    @Override
    public String toString() {
        return "Company" + super.toString();
    }
}
