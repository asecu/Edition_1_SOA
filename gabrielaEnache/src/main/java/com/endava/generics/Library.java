package com.endava.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Media> items;

    public Library() {
        items = new ArrayList<>();
    }

    public List<Media> getItems() {
        return items;
    }

    public void addItem(Media item) {
        this.items.add(item);
    }

    public void addAllItems(List<Media> list) {
        this.items.addAll(list);
    }

    public void removeItem(Media item) {
        this.items.remove(item);
    }

    public void clearItemList() {
        this.items.clear();
    }

    public void removeAllItems(List<Media> list) {
        this.items.removeAll(list);
    }

    public void printItemList(List<Media> list) {
        System.out.println(list);
    }

    public void sortByPrice() {
        items.sort(Comparator.comparing(Media::getPrice));
    }

    public void sortByTitle() {
        items.sort(Comparator.comparing(Media::getTitle));
    }

    public void printAllItemsFromEditor(String editor) {
        for (Media item : items) {
            if (item.getEditor().equalsIgnoreCase(editor)) {
                System.out.println(item);
            }
        }
    }

    public List<Media> getItemsCheaperThan(float price) {
        List<Media> result = new ArrayList<>();
        for (Media item : items) {
            if (item.getPrice() < price) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Video> getAllVideos() {
        List<Video> result = new ArrayList<>();
        for (Media item : items) {
            if (item instanceof Video) {
                result.add((Video) item);
            }
        }
        return result;
    }
}
