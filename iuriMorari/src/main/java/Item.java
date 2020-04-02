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

    public Item(String boots, Type boots1, int i) {
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
}