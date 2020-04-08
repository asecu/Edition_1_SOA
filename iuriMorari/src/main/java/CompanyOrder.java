import java.util.List;

public class CompanyOrder extends AbstractOrder {
    public Company company;

    public CompanyOrder(List<Item> items, Company company) {
        super(items);
        this.company = company;
    }
}
