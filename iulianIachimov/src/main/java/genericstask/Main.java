package genericstask;

import genericstask.model.*;

import java.util.ArrayList;
import java.util.List;

import static genericstask.model.CustomArraysUtils.printArray;
import static genericstask.model.CustomArraysUtils.printTwoArrays;

public class Main {

  public static void main(String[] args) {
// first task
    Integer[] arrayOfInteger = {1, 2, 3, 48, 89, 4563};
    String[] arrayOfString = {"Table", "Chair", "Cupboard"};

    printArray(arrayOfInteger);
    printArray(arrayOfString);
    System.out.println();
    printTwoArrays(arrayOfInteger, arrayOfString);
    System.out.println();

// second task using generic library
    GenericsLibrary<Books> genericsLibraryBooks = new GenericsLibrary<>();
    GenericsLibrary<Newspapers> genericsLibraryNewspapers = new GenericsLibrary<>();
    GenericsLibrary<Video> genericsLibraryVideos = new GenericsLibrary<>();

    genericsLibraryBooks.addMedia(new Books("Be Smart", "B. Good"));
    genericsLibraryBooks.addMedia(new Books("The greatest people", "S. Leming"));
    genericsLibraryBooks.addMedia(new Books("Vanity Fair", "W.M. Thackeray"));

    genericsLibraryNewspapers.addMedia(new Newspapers("L'etat", "French"));
    genericsLibraryNewspapers.addMedia(new Newspapers("Pravda", "Russian"));

    genericsLibraryVideos.addMedia(new Video("Wolf from the Wall street", "Rutube"));
    genericsLibraryVideos.addMedia(new Video("The great Gatsby", "Columbia Pictures Stream"));

    System.out.println("Library before sort: " + genericsLibraryVideos.getGenericMediaList());
    genericsLibraryVideos.sortByTitle();
    System.out.println("Library after sort: " + genericsLibraryVideos.getGenericMediaList());

    System.out.println(
            "Library before removing by title: " + genericsLibraryBooks.getGenericMediaList());
    genericsLibraryBooks.removeByTitle("Be Smart");
    System.out.println(
            "Library after removing by title: " + genericsLibraryBooks.getGenericMediaList());

    System.out.println("Size of Newspaper library is " + genericsLibraryNewspapers.getSize());

    System.out.println(genericsLibraryBooks.printElementsUpperCase());

// second task using simple library
    SimpleLibrary simpleLibrary = new SimpleLibrary();

    List<Books> listOfBooks = new ArrayList<>();
    List<Video> listOfVideo = new ArrayList<>();
    List<Newspapers> listOfNewsPaper = new ArrayList<>();

    listOfBooks.add(simpleLibrary.addBook("Wizard of Oz", "V. Fleming"));
    listOfBooks.add(simpleLibrary.addBook("Gone with the wind", "M. Mitchell"));
    listOfBooks.add(simpleLibrary.addBook("Mowgli", "R. Kipling"));

    listOfNewsPaper.add(simpleLibrary.addNewspaper("New York Times", "English"));
    listOfNewsPaper.add(simpleLibrary.addNewspaper("Le Monde", "French"));
    listOfNewsPaper.add(simpleLibrary.addNewspaper("La Republica", "Italian"));

    listOfVideo.add((simpleLibrary.addVideo("Theory About Universe", "Youtube")));
    listOfVideo.add((simpleLibrary.addVideo("Singing in the rain", "Netflix")));
    listOfVideo.add((simpleLibrary.addVideo("Test Automation Course", "Udemy")));

    simpleLibrary.setBookList(listOfBooks);
    simpleLibrary.setNewspaperList(listOfNewsPaper);
    simpleLibrary.setVideoList(listOfVideo);

    simpleLibrary.printBook(listOfBooks);
    simpleLibrary.printNewsPaper(listOfNewsPaper);
    simpleLibrary.printVideos(listOfVideo);

    simpleLibrary.getBookList();
    simpleLibrary.sortBookByTitle();
    simpleLibrary.getBookList();

    simpleLibrary.printVideoTitleLowerCase();

    simpleLibrary.getNewspaperList();
    simpleLibrary.removeNewspaperByIndex(0);
    simpleLibrary.getNewspaperList();
  }
}
