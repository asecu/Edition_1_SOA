package com.endava.generics;

public class Book extends Media {
    private int pages;

    public Book(String title, String author, float price, int pages) {
        super(title, author, price);
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Invalid pages number!");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Invalid pages number!");
        }
    }

    @Override
    public String toString() {
        return "\nBook: " + super.toString() + ", pages: " + pages;
    }
}
