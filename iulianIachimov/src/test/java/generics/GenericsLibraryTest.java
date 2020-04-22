package generics;

import genericstask.model.Books;
import genericstask.model.GenericsLibrary;
import genericstask.model.Newspapers;
import genericstask.model.Video;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;

public class GenericsLibraryTest {
  private Books bookone;
  private Video videoone;
  private Newspapers newspaperone;
  private Newspapers newspaperstwo;
  GenericsLibrary<Books> genericsLibraryBooksTest;
  GenericsLibrary<Video> genericsLibraryVideoTest;
  GenericsLibrary<Newspapers> genericsLibraryNewspapersTest;

  @Before
  public void setUp() {
    bookone = new Books("Wizard of Oz", "V. Fleming");
    videoone = new Video("Theory About Universe", "Youtube");
    newspaperone = new Newspapers("New York Times", "English");
    newspaperstwo = new Newspapers("La Republica", "Italian");
    genericsLibraryVideoTest = new GenericsLibrary<>();
    genericsLibraryBooksTest = new GenericsLibrary<>();
    genericsLibraryNewspapersTest = new GenericsLibrary<>();
  }

  @Test
  public void addMediaTest() {
    genericsLibraryVideoTest.addMedia(videoone);
    assertThat(genericsLibraryVideoTest, notNullValue());
    assertEquals(1, genericsLibraryVideoTest.getSize());
  }

  @Test
  public void sortByTitleTest() {
    genericsLibraryNewspapersTest.addMedia(newspaperone);
    genericsLibraryNewspapersTest.addMedia(newspaperstwo);
    genericsLibraryNewspapersTest.sortByTitle();
    assertThat("The library contains still 2 elements", genericsLibraryNewspapersTest.getSize(), is(2));
  }

  @Test
  public void removeMediaTest() {
    genericsLibraryVideoTest.addMedia(videoone);
    genericsLibraryVideoTest.removeMedia(videoone);
    assertThat(genericsLibraryVideoTest.getGenericMediaList(), hasSize(0));
  }
}
