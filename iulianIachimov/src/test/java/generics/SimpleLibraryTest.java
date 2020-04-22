package generics;

import genericstask.model.Books;
import genericstask.model.SimpleLibrary;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class SimpleLibraryTest {
  @Test
  public void addBookTest() {
    List<Books> listOfBooks = new ArrayList<>();
    Books myBook = new Books("Harry Potter", "J K Rolling");
    listOfBooks.add(new Books("Harry Potter", "J K Rolling"));

    assertThat(listOfBooks, is(not(new Books("a", "q"))));
    assertThat(listOfBooks, hasItem(myBook));
    assertThat(listOfBooks, hasSize(1));
    assertThat(listOfBooks, notNullValue());
    assertThat(myBook, equalTo(new Books("Harry Potter", "J K Rolling")));
    assertThat("At least a book is found", listOfBooks, anything());
  }

  @Test
  public void sortBookByTitleTest() {
    SimpleLibrary simplelib = new SimpleLibrary();
    List<Books> listOfBooks = new ArrayList<>();
    List<Books> listOfFutureBooks = new ArrayList<>();

    listOfBooks.add(new Books("b", "b"));
    listOfBooks.add(new Books("c", "c"));
    listOfBooks.add(new Books("a", "a"));
    listOfBooks.add(new Books("z", "z"));
    simplelib.sortBookByTitleNew(listOfBooks);

    List<Books> listOfBooksSorted = new ArrayList<>();
    listOfBooksSorted.add(new Books("a", "a"));
    listOfBooksSorted.add(new Books("b", "b"));
    listOfBooksSorted.add(new Books("c", "c"));
    listOfBooksSorted.add(new Books("z", "z"));

    assertEquals(listOfBooks, listOfBooksSorted);
    assertNotNull(listOfBooks);
    assertThat(listOfBooks, is(not(equalTo(listOfFutureBooks))));
  }
}

