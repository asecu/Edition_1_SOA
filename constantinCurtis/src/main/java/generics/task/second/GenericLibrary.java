package generics.task.second;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericLibrary<T extends Media> {

    private List<T> finalList = new ArrayList<>();

    public List<T> getfinalList() {
        return finalList;
    }

    public void addThings(T t) {
        finalList.add(t);
    }

    public void removeThings(T t) {
        finalList.remove(t);
    }

    public void printByThing(T t) {
        for (T t1 : finalList) {
            if (t.equals(t1.getTitle())) {
                printByThing(t1);
            }
        }
    }

    public void clearThings() {
        finalList.clear();
    }

    public void printThingsName(T t) {
        System.out.println(t);
    }

    public void sortByPrice() {
        finalList.sort(Comparator.comparing(T::getPrice));
    }

    public void sortByYear() {
        finalList.sort(Comparator.comparing(T::getYear));
    }

    public void sortByTitle() {
        finalList.sort(Comparator.comparing(T::getTitle));
    }

    @Override
    public String toString() {
        return "GenericLibrary{" +
                "FinalList=" + finalList +
                '}';
    }
}
