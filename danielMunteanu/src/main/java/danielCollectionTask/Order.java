package danielCollectionTask;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalDateTime.now;

public class Order {
    public long id;
    private long counter;
    private LocalDateTime date;
    public User user;
    public List<Item> items;

    public Order() {
        this.date = now();
        this.id = ++counter;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "danielCollectionTask.Order{" +
                "id=" + id +
                ", date='" + date.toString() + '\'' +
                ", user='" + user + '\'' +
                ", items=" + items +
                '}';
    }
}
