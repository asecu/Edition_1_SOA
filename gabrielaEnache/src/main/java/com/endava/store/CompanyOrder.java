package com.endava.store;

import java.util.List;

public class CompanyOrder extends AbstractOrder {
    private final Company company;

    public CompanyOrder(Company company, List<Item> items) {
        super(items);
        this.company = company;
    }

    @Override
    public String toString() {
        return "Company = " + company.getName() +
                "\nCompany" + super.toString();
    }
}
