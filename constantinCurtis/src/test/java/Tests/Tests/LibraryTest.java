package Tests;

import generics.task.second.Library;
import generics.task.second.Media;
import generics.task.second.Video;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

public class LibraryTest {
    private Library lib;

    @Before
    public void setUp() {
        List<Media> listOfVideos = new ArrayList<>();
        listOfVideos.add(new Video("Pulp Fiction", 87.5, 1999, "Mpeg4", 202, "Tarantino"));
        listOfVideos.add(new Video("Star War", 37.5, 1986, "Avi", 248, "Lucas"));
        listOfVideos.add(new Video("Catch me if you can", 77.5, 2002, "Avi", 248, "Stiven Spilberg"));
        lib = new Library(listOfVideos);
    }

    @Test
    public void removeProduct() {
        lib.removeProduct(lib.getMediaList().get(0));
        assertThat("Year is sorted incorrectly", lib.getMediaList(), hasSize(2));
    }

    @Test
    public void sortByTitle() {
        lib.sortByTitle();
        Video video = (Video) lib.getMediaList().get(0);
        assertThat("Please change text", video.getTitle(), startsWith("Catch"));
    }
}
