package datacollectiontask.models;

import java.util.UUID;

public class Item {
  private final UUID id;
  private String title;
  private Type type;
  private double price;

  public Item(String title, Type type, double price) {
    this.id = UUID.randomUUID();
    this.title = title;
    this.type = type;
    setPrice(price);
  }

  @Override
  public String toString() {
    return "Item{" + "id=" + id + ", title='" + title + '\'' + ", type=" + type + '}';
  }

  public UUID getId() {
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

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price < 0) {
      throw new IllegalArgumentException("Error parameter may not be lower than 0. You have sent " + price);
    }
    this.price = price;
  }
}