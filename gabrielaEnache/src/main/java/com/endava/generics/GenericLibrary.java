package com.endava.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericLibrary<T extends Media> {
    private List<T> items;
    private final int MEMORY_CAPACITY = 6;

    public GenericLibrary() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        if (items.size() < MEMORY_CAPACITY) {
            this.items.add(item);
        } else {
            System.out.println("Full capacity! please remove some items!");
        }
    }

    public void addAllItems(List<T> list) {
        this.items.addAll(list);
    }

    public void removeItem(T item) {
        this.items.remove(item);
    }

    public void clearItemList() {
        this.items.clear();
    }

    public void removeAllItems(List<T> list) {
        this.items.removeAll(list);
    }

    public void printItemList(List<T> list) {
        System.out.println(list);
    }

    public void sortByPrice() {
        items.sort(Comparator.comparing(T::getPrice));
    }

    public void sortByTitle() {
        items.sort(Comparator.comparing(T::getTitle));
    }

    public List<T> getItemsCheaperThan(float price) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.getPrice() < price) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Generic Library \n" + items;
    }
}
