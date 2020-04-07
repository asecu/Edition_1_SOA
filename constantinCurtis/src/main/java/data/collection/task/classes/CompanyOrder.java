package data.collection.task.classes;


import java.util.List;

public class CompanyOrder extends AbstractOrder {
    private Company company;


    public CompanyOrder(List<Item> items, Company company) {
        super(items);
        this.company = company;
    }
}
