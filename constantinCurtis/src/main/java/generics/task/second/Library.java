package generics.task.second;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Media> mediaList;

    public Library() {
        mediaList = new ArrayList<>();
    }

    public void addProduct(Media product) {
        this.mediaList.add(product);
    }

    public void removeProduct(Media product) {
        this.mediaList.remove(product);
    }

    public void sortByPrice() {
        mediaList.sort(Comparator.comparing(Media::getPrice));
    }

    public void sortByYear() {
        mediaList.sort(Comparator.comparing(Media::getYear));
    }

    public void sortByTitle() {
        mediaList.sort(Comparator.comparing(Media::getTitle));
    }

    @Override
    public String toString() {
        return "Library{" +
                "mediaList=" + mediaList +
                '}';
    }
}

