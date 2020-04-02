package collections.store;

public class Item {
    private static long idCounter = 0;
    private long id;
    private String title;
    private Type type;

    public Item(String title, Type type) {
        this.id = idCounter++;
        this.title = title;
        this.type = type;
    }

    public long getId() {
        return id;
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

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}
