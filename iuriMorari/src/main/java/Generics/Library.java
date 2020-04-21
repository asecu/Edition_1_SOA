package Generics;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<AllMedia> allMedia;

    public Library() {
        allMedia = new ArrayList<>();
    }

    public void addMedia(AllMedia media) {
        this.allMedia.add(media);
    }

    public void deleteMedia(AllMedia media) {
        this.allMedia.remove(media);
    }

}
