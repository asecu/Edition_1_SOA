package Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericLibrary<T extends AllMedia> {
    private List<T> allList = new ArrayList<>();

    public List<T> getAllList() {
        return allList;
    }

    public void addItems(T t) {
        allList.add(t);
    }

    public void deleteItems(T t) {
        allList.remove(t);
    }

    public void showNames(T t) {
        System.out.println(t);
    }

    public void filterByCost() {
        allList.sort(Comparator.comparing(T::getCost));
    }

    public void filterByCategory() {
        allList.sort(Comparator.comparing(T::getCategory));
    }

    public void clearList() {
        allList.clear();
    }
}




