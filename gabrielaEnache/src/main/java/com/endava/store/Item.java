package com.endava.store;

public class Item {
    private static long idCounter = 0;
    private final long id;
    private String title;
    private Type type;
    private float price;

    public Item(String title, Type type) {
        this.id = idCounter++;
        this.title = title;
        this.type = type;
    }

    public Item(String title, Type type, float price) {
        this.id = idCounter++;
        this.title = title;
        this.type = type;
        if (price > 0)
            this.price = price;
        else
            System.out.println("Invalid price!");
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Invalid price!");
    }

    @Override
    public String toString() {
        return "Item{" +
                "id = " + id +
                ", title = " + title +
                ", type = " + type +
                ", price = " + price +
                '}';
    }
}
