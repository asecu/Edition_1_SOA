package danielCollectionTask;

public class Item {
    public long id;
    public String title;
    public Type type;
    static long idCounter;

    public Item(String title, Type type) {
        this.id = ++idCounter;
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
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



