package com.endava.generics;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

public class LibraryTest {
    private Book book;
    private Video video;
    private Newspaper newspaper;
    private Library library;

    @Before
    public void setUp() throws Exception {
        book = new Book("Povesti", "Ion Creanga", 60f, 100);
        video = new Video("GYM", "Ioana Andreev", 8f, 60.6f);
        newspaper = new Newspaper("Alunelu", "Ion Moraru", 3f, "Chisinau");
        library = new Library();
        library.addAllItems(Arrays.asList(book, video, newspaper));
    }

    @Test
    public void addItemTest() {
        library.addItem(book);
        assertThat(format("Library list is equal to "), library.getItems(), hasSize(4));
    }

    @Test
    public void addAllItemsTest() {
        library.addAllItems(Arrays.asList(book, video, newspaper));
        assertThat(format("Library list is equal to "), library.getItems(),hasSize(6));
    }

    @Test
    public void removeItemTest() {
        library.removeItem(book);
        assertThat(format("Library list is equal to "), library.getItems(), hasSize(2));
    }

    @Test
    public void clearItemListTest() {
        library.clearItemList();
        assertThat("Library list is empty", library.getItems(), hasSize(0));
    }
}