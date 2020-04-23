package com.endava.generics;

import org.junit.Before;
import org.junit.Test;

import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;


public class VideoTest {
    private Video video;

    @Before
    public void setUp() {
        video = new Video("JUnit tutorial", "Josh Antoci", 98f, 60f);
    }

    @Test
    public void setPositiveDurationTest() {
        video.setDuration(90f);
        assertThat(format("Duration is "), video.getDuration(), is(90f));
    }

    @Test
    public void setNegativeDurationTest() {
        video.setDuration(-90f);
        assertThat(format("Duration has not been changed from "), video.getDuration(), not(-90f));

    }

}