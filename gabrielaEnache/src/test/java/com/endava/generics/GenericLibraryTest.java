package com.endava.generics;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;


public class GenericLibraryTest {
    private Book book;
    private Book book1;
    private Video video;
    private Video video1;
    private Newspaper newspaper;
    private GenericLibrary<Media> genericLibrary;

    @Before
    public void setUp() throws Exception {
        book = new Book("Spring", "Ion Pascal", 80f, 895);
        book1 = new Book("Games of thrones", "Gheorghe Martin", 150f, 800);
        video = new Video("Cucumber", "Vasile", 80f, 9f);
        video1 = new Video("Coffe", "Mihai", 90f, 80f);
        newspaper = new Newspaper("Licurici", "Ana", 8f, "Telenesti");
        genericLibrary = new GenericLibrary<>();
        genericLibrary.addAllItems(Arrays.asList(book, book1, video, video1, newspaper));
    }

    @Test
    public void addItemTest() {
        genericLibrary.addItem(book);
        assertThat(format("Library list size is "), genericLibrary.getItems(), hasSize(5));
    }

    @Test
    public void getItemsCheaperThanTest() {
        List<Media> result = genericLibrary.getItemsCheaperThan(80f);
        assertThat(format("Library size is "), result, hasSize(1));
        assertThat(result, hasItem(newspaper));
    }
}