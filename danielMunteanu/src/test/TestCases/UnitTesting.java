package TestCases;

import Generics.GenericLibrary;
import Generics.LibraryItem;
import Generics.books.GameOfThrones;
import Generics.books.HarryPotter;
import Generics.books.Shogun;
import Generics.newspapers.NewYorkTimes;
import Generics.newspapers.ZiarulDeGarda;
import Generics.videos.Matrix;
import Generics.videos.Rambo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;


public class UnitTesting {
    GenericLibrary<LibraryItem> biblioteca = new GenericLibrary();

    @Before
    public void prepareTestData() {
//        books
        HarryPotter harryPotter = new HarryPotter();
        Shogun shogun = new Shogun();
        GameOfThrones gameOfThrones = new GameOfThrones();
//        newspapers
        NewYorkTimes newYorkTimes = new NewYorkTimes();
        ZiarulDeGarda ziarulDeGarda = new ZiarulDeGarda();
//        videos
        Matrix matrix = new Matrix();
        Rambo rambo = new Rambo();

        List<LibraryItem> bItems = new ArrayList<>();
        bItems.add(harryPotter);
        bItems.add(shogun);
        bItems.add(newYorkTimes);
        bItems.add(ziarulDeGarda);
        bItems.add(matrix);
        bItems.add(rambo);
        bItems.add(gameOfThrones);

        biblioteca.setItems(bItems);
    }

    @Test
    public void listSize() {
        System.out.println("Starting method -- listSize--");
        assertThat(String.format("Library list is equal to %d", 7), biblioteca.getItems().size(), is(7));
    }

    @Test
    public void assertByYear() {
        System.out.println("Starting method --assert by year-- :");
        assertEquals(biblioteca.printByYear(1965), 1965);
    }

    @Test
    public void assertEqualsByYear() {
        System.out.println("Starting method --asserEqualsByYear--");
        assertThat(biblioteca.printByYear(2003), is(2003));
    }

    @Test
    public void assertByYearBoolean() {
        System.out.println("Starting method --asserByYearBoolean--");
        assertThat(biblioteca.printByYearBoolean(2000), is(true));
    }

    @Test
    public void assertByYearBooleanFalse() {
        System.out.println("Starting method --asserByYearBooleanFalse--");
        assertThat(biblioteca.printByYearBoolean(20060), is(false));
    }
}