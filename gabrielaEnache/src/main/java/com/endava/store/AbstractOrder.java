package com.endava.store;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOrder implements Order {
    private static long idCounter = 0;
    private final long id;
    private final LocalDateTime data;
    private List<Item> items;

    protected AbstractOrder(List<Item> items) {
        this.id = idCounter++;
        this.data = LocalDateTime.now();
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void addAllItems(List<Item> list) {
        this.items.addAll(list);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void clearItemList() {
        this.items.clear();
    }

    public void removeMultipleItems(List<Item> list) {
        this.items.removeAll(list);
    }

    public static List<AbstractOrder> filterOrdersByItemType(List<AbstractOrder> listToSort, Type type) {
        List<AbstractOrder> result = new ArrayList<>();
        for (AbstractOrder abstractOrder : listToSort) {
            if (abstractOrder.containsItemType(type))
                result.add(abstractOrder);
        }
        return result;
    }

    public boolean containsItemType(Type type) {
        for (Item item : this.getItems()) {
            if (type.equals(item.getType()))
                return true;
        }
        return false;
    }

    //Overloaded method
    public float sum(String itemName) {
        float result = 0;
        for (Item item : items)
            if (item.getTitle().equalsIgnoreCase(itemName))
                result += item.getPrice();
        return result;
    }

    public float sum(Item item) {
        float result = 0;
        for (Item itemFromList : this.items)
            if (itemFromList.getTitle().equalsIgnoreCase(item.getTitle()))
                result += itemFromList.getPrice();
        return result;
    }

    //Overloaded method
    public int count(String itemName) {
        int result = 0;
        for (Item item : items)
            if (item.getTitle().equalsIgnoreCase(itemName))
                result++;
        return result;
    }

    public int count(Item item) {
        int result = 0;
        for (Item itemFromList : this.items)
            if (itemFromList.getTitle().equalsIgnoreCase(item.getTitle()))
                result++;
        return result;
    }

    @Override
    public float sum() {
        float result = 0;
        for (Item item : this.items)
            result += item.getPrice();
        return result;
    }

    @Override
    public int count() {
        return this.items.size();
    }

    @Override
    public LocalDateTime date() {
        return data;
    }

    @Override
    public String toString() {
        return " Order: " +
                "id = " + id +
                ", data = " + data.toString() +
                ",\nshoppingItems = " + items.toString();
    }
}
