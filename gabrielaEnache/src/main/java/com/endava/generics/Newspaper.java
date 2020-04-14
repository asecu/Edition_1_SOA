package com.endava.generics;

public class Newspaper extends Media {
    private String city;

    public Newspaper(String title, String author, float price, String city) {
        super(title, author, price);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\nNewspaper: " + super.toString() + ", City: " + city;
    }
}
