package com.endava.generics;

public abstract class Media {
    private static long idCounter = 0;
    private final long id;
    private final String title;
    private final String editor;
    private float price;

    public Media(String title, String editor, float price) {
        this.id = idCounter++;
        this.title = title;
        this.editor = editor;
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getEditor() {
        return editor;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", title: " + title +
                ", editor: " + editor +
                ", price: " + price;
    }
}
