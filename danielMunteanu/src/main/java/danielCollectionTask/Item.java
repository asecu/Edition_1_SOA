package danielCollectionTask;

import java.util.UUID;

public class Item {
    private final String id;
    private String title;
    private Type type;
    private double price;

    public Item(String title, Type type, double price) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.type = type;
        if (price > 0)
            this.price = price;
        else
            System.out.println("Invalid price!");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Invalid price!");
    }

    @Override
    public String toString() {
        return "danielCollectionTask.Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}