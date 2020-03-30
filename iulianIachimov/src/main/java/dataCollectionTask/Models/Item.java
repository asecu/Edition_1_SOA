package dataCollectionTask.Models;

public class Item {
  public long id;
  public String title;
  public Type type;
  private static long idCounter;

  public Item(String title, Type type) {
    this.id = ++idCounter;
    this.title = title;
    this.type = type;
  }

  @Override
  public String toString() {
    return "Item{" + "id=" + id + ", title='" + title + '\'' + ", type=" + type + '}';
  }
}
