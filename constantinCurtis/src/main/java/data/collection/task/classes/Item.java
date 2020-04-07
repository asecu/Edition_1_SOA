package data.collection.task.classes;

public class Item {
    private final long id;
    private String title;
    private Type type;
    private double price;
    private static long idCounter = 0;

    public Item(String title, Type type, double price) {
        this.id = ++idCounter;
        this.type = type;
        this.title = title;
        if (price > 0)
            this.price = price;
        else
            System.out.println("Incorrect price. Price couldn't be negative.");
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Incorrect price. Price couldn't be negative.");
    }
}
