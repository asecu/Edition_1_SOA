package data.collection.task.classes;

public class Item {
    public long id;
    public String title;
    public Type type;
    private static long idCounter = 0;

    public Item(String title, Type type) {
        this.id = idCounter++;
        this.type = type;
        this.title = title;
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