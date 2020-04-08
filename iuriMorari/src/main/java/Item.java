public class Item {
    public Long id;
    public String title;
    public Type type;
    private static long idCounter;
    public Double price;

    public Item(String title, Type type, Double price) {
        this.id = ++idCounter;
        this.title = title;
        this.type = type;
        this.price = price;
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

    public void permitedTax(Double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Error. Price cant be negative. Please reenter price.");
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }
}
