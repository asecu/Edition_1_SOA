package Generics;

import java.util.List;

public class GenericLibrary<T extends LibraryItem> {
    private List<T> items;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public void printByName(String itemName) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().contains(itemName)) {
                System.out.println(items.get(i));
            }
        }
        System.out.println("No more" + " items with name " + itemName + " where found.");
    }

    public void printByYear(int itemYear) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getYear() == (itemYear)) {
                System.out.println(items.get(i));
            }
        }
        System.out.println("No more" + " items with year " + itemYear + " where found.");
    }

    public void printByYearRange(int a, int b) {

        for (int i = 0; i < items.size(); i++) {
            final int year = items.get(i).getYear();
            if (year >= a && year <= b) {
                System.out.println(items.get(i));
            }
        }
        System.out.println("No more" + " items in range of " + a + " - " + b + " where found.");
    }
}