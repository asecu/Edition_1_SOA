package danielCollectionTask;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static java.time.LocalDateTime.now;

public abstract class CompanyOrder implements Order {
    private final String id;
    private Company company;
    private List<Item> items;
    private final LocalDateTime date;

    public CompanyOrder(Company company, List<Item> items) {
        this.id = UUID.randomUUID().toString();
        this.company = company;
        this.items = items;
        this.date = now();
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public double sum() {
        double sum = 0D;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getPrice();
        }
        return sum;
    }

    @Override
    public int count() {
        return items.size();
    }

    public int count(List<Item> items) {
        return items.size();
    }

    @Override
    public LocalDateTime date() {
        return date;
    }


    @Override
    public String toString() {
        return "danielCollectionTask.Order{" +
                "id=" + id +
                ", date='" + date.toString() + '\'' +
                ", user='" + company + '\'' +
                ", items=" + items +
                '}';
    }
}