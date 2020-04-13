package Generics;

import Generics.books.HarryPotter;
import Generics.books.Shogun;
import Generics.newspapers.NewYorkTimes;
import Generics.newspapers.ZiarulDeGarda;
import Generics.videos.Matrix;
import Generics.videos.Rambo;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
//        books
        HarryPotter harryPotter = new HarryPotter();
        Shogun shogun = new Shogun();
//        newspapers
        NewYorkTimes newYorkTimes = new NewYorkTimes();
        ZiarulDeGarda ziarulDeGarda = new ZiarulDeGarda();
//        videos
        Matrix matrix = new Matrix();
        Rambo rambo = new Rambo();

        GenericLibrary<LibraryItem> biblioteca = new GenericLibrary();

        List<LibraryItem> bItems = new ArrayList<>();
        bItems.add(harryPotter);
        bItems.add(shogun);
        bItems.add(newYorkTimes);
        bItems.add(ziarulDeGarda);
        bItems.add(matrix);
        bItems.add(rambo);

        biblioteca.setItems(bItems);
        biblioteca.printByName("Harry");
        biblioteca.printByYear(1990);
        biblioteca.printByYearRange(2013, 2016);

    }
}