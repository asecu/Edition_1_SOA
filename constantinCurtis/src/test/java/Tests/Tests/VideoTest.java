package Tests;

import generics.task.second.Video;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


public class VideoTest {
    private Video videoSpilberg;

    @Before
    public void setUp() {
        videoSpilberg = new Video("Catch me if you can", 77.5, 2002, "Avi", 280.4, "Stiven Spilberg");

    }

    @Test
    public void setPositiveDuration() {
        videoSpilberg.setDuration(350.4);
        assertThat("Invalid Duration was set", videoSpilberg.getDuration(), is(350.4));
    }

    @Test
    public void setNegativeDuration() {
        videoSpilberg.setDuration(-300.5);
        assertThat("Invalid Duration was set", videoSpilberg.getDuration(), not(-300.5));
    }
}