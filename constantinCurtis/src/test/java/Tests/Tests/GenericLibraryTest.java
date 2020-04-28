package Tests;

import generics.task.second.Book;
import generics.task.second.GenericLibrary;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GenericLibraryTest {

    private GenericLibrary library;

    @Before
    public void setUp() {

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Anna Carenina", 57.8, 1877, 1124, "Lev Tolstoy"));
        listOfBooks.add(new Book("Green Mile", 29.5, 1879, 380, "Stiven King"));
        listOfBooks.add(new Book("Black Cat", 37.5, 1885, 345, "Stiven Nzonzi"));

        library = new GenericLibrary(listOfBooks);
    }

    @Test
    public void sortByPrice() {
        library.sortByPrice();
        Book book = (Book) library.getfinalList().get(0);
        assertThat("Price is sorted incorrectly", book.getPrice(), is(29.5));
    }

    @Test
    public void sortByYear() {
        library.sortByYear();
        Book book = (Book) library.getfinalList().get(0);
        assertThat("Year is sorted incorrectly", book.getYear(), is(1877));
    }

}
