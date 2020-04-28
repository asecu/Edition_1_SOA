package Tests;

import generics.task.second.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class BookTest {
    private Book bookPagesPositive;
    private Book bookPagesSecondNegative;

    @Before
    public void setUp() {
        bookPagesPositive = new Book("Anna Carenina", 57.8, 1877, 1124, "Lev Tolstoy");
        bookPagesSecondNegative = new Book("Green Mile", 29.5, 1879, 380, "Stiven King");

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(bookPagesPositive);
        listOfBooks.add(bookPagesSecondNegative);
    }

    @Test
    public void setPositivePagesValues() {
        bookPagesPositive.setPages(500);
        assertThat(bookPagesPositive.getPages(), is(500));
    }

    @Test
    public void setNegativePagesValues() {
        bookPagesSecondNegative.setPrice(-500);
        assertThat("Invalid Price set", bookPagesSecondNegative.getPages(), not(-500));
    }

    @Test
    public void setPositivePrice() {
        bookPagesPositive.setPrice(75.3);
        assertThat("Price is", bookPagesPositive.getPrice(), is(75.3));
    }

    @Test
    public void setNegativePrice() {
        bookPagesSecondNegative.setPrice(300.27);
        assertThat("Price cann't be invalid:", bookPagesSecondNegative.getPrice(), is(300.27));
    }
}