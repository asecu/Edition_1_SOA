package Generics;

import java.util.ArrayList;
import java.util.List;

import static Generics.PrintClass.printArray;

public class Main {

    public static void main(String[] args) {

        // Creating Integer and String arrays (1st task)

        Integer[] FirstIntegerArray = {1, 4, 6, 4, 128, 256, 228, 322, 1488};
        String[] FirstStringArray = {"Beef", "Pork", "Chicken", "Fish"};

        printArray(FirstIntegerArray);
        printArray(FirstStringArray);
        printArray(FirstIntegerArray, FirstStringArray);

        // 2nd task simple

        Books WarAndPeace = new Books("WAP", "philosophy", 26.2, "renesans", 99999, false);
        Books AgileTesting = new Books("AgileTesting", "studying", 78.2, "modernAge", 112, true);

        List<Books> booksList = new ArrayList<>();
        booksList.add(WarAndPeace);
        booksList.add(AgileTesting);

        Newspaper Aqua = new Newspaper("Auqarelle", "beauty", 9.12, "gloss", "Diana", 10000);
        Newspaper Business = new Newspaper("BusinessClass", "business", 9.78, "gloss", "Valic", 5000);

        List<Newspaper> newspaperList = new ArrayList<>();
        newspaperList.add(Aqua);
        newspaperList.add(Business);

        Video Titanic = new Video("Titanic", "Drama", 90.12, "Family", "VHS", 163);
        Video DieHard = new Video("DieHard", "Action", 42.12, "16+", "CD-DVD", 121);

        List<Video> videoList = new ArrayList<>();
        videoList.add(Titanic);
        videoList.add(DieHard);

        //task 2 creating gerenic library

        GenericLibrary<Books> booksGenericLibrary = new GenericLibrary<>();
        booksGenericLibrary.addItems(WarAndPeace);
        booksGenericLibrary.addItems(AgileTesting);
        booksGenericLibrary.addItems(new Books("Vohvi", "History", 24.1, "monochromic", 251, false));
        WarAndPeace.setCost((double) 250);

        booksGenericLibrary.filterByCost();
        booksGenericLibrary.filterByCategory();

        booksGenericLibrary.showNames(AgileTesting);
        System.out.println(booksGenericLibrary.getAllList());

        booksGenericLibrary.deleteItems(WarAndPeace);
        System.out.println(booksGenericLibrary.getAllList());

        booksGenericLibrary.clearList();
        System.out.println(booksGenericLibrary.getAllList());


        Library firstLibrary = new Library();
        firstLibrary.addMedia(AgileTesting);
        firstLibrary.addMedia(Aqua);
        firstLibrary.deleteMedia(AgileTesting);
        System.out.println(firstLibrary);
    }
}