package com.endava.generics;

import org.junit.Before;
import org.junit.Test;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BookTest {
    private Book book;

    @Before
    public void setUp() {
        book = new Book("Java", "Oracle", 90f, 555);
    }

    @Test
    public void setPositivePagesTest() {
        book.setPages(1000);
        assertEquals(format("Page number is "), 1000, book.getPages());
    }

    @Test
    public void setNegativePagesTest() {
        book.setPages(-1000);
        assertNotEquals(format("Page number has not been changed from "), -1000, book.getPages());
    }
}
