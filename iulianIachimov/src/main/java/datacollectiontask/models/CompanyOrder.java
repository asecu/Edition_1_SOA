package datacollectiontask.models;

import java.util.List;

public class CompanyOrder extends AbstractOrder {
    private Company company;

    public CompanyOrder(List<Item> items, Company company) {
        super(items);
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
