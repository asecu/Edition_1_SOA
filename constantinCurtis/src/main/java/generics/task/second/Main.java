package generics.task.second;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book bookAnna = new Book("Anna Carenina", 57.8, 1877, 1124, "Lev Tolstoy");
        Book bookMile = new Book("Green Mile", 29.5, 1879, 380, "Stiven King");
        Book bookSun = new Book("The sun also rises", 37.7, 1928, 254, "Ernest Hemingway");

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(bookAnna);
        listOfBooks.add(bookMile);
        listOfBooks.add(bookSun);

        Video videoSpilberg = new Video("Catch me if you can", 77.5, 2002, "Avi", 248, "Stiven Spilberg");
        Video videoTarantino = new Video("Pulp Fiction", 65.5, 1994, "MPEG", 2.58, "Quentin Tarantino");

        List<Video> listOfVideos = new ArrayList<>();
        listOfVideos.add(videoSpilberg);
        listOfVideos.add(videoTarantino);

        Newspaper newspaperBbc = new Newspaper("BBC", 7.8, 2019, "Great", 23, "English");
        Newspaper newspaperAntena = new Newspaper("Antena", 1.2, 2019, "Medium", 18, "Russian");

        List<Newspaper> listOfNewspapers = new ArrayList<>();
        listOfNewspapers.add(newspaperBbc);
        listOfNewspapers.add(newspaperAntena);

        //Generics
        GenericLibrary<Newspaper> genNewspaper = new GenericLibrary<>();
        genNewspaper.addThings(newspaperAntena);
        genNewspaper.addThings(new Newspaper("Independent", 1.2, 2019, "Medium", 18, "Russian"));
        genNewspaper.addThings(newspaperBbc);

        //Verify SortByPrice method
        genNewspaper.sortByPrice();

        //Verify clear method
        genNewspaper.clearThings();
        System.out.println(genNewspaper.getfinalList());

        //Verify print method
        genNewspaper.printThingsName(newspaperBbc);

        GenericLibrary<Book> genBook = new GenericLibrary<>();
        genBook.addThings(bookAnna);
        genBook.addThings(bookMile);
        genBook.addThings(bookMile);
        bookAnna.setPrice(250);
        bookMile.setPrice(-320);

        //Verify remove methods
        genBook.removeThings(bookMile);
        genBook.printByThing(bookAnna);
        genBook.sortByYear();
        System.out.println(genBook.getfinalList());

        GenericLibrary<Video> genVideo = new GenericLibrary<>();
        genVideo.addThings(videoSpilberg);
        genVideo.addThings(videoTarantino);
        videoSpilberg.setDuration(-350);
        genVideo.sortByTitle();
        System.out.println(genVideo.getfinalList());

        Library lib = new Library();
        lib.addProduct(bookAnna);
        lib.addProduct(bookMile);
        lib.addProduct(bookSun);
        lib.addProduct(newspaperAntena);
        lib.addProduct(newspaperBbc);
        lib.addProduct(videoSpilberg);
        lib.addProduct(videoTarantino);
        lib.removeProduct(bookAnna);
        lib.sortByPrice();
        lib.sortByTitle();
        lib.sortByYear();
        System.out.println(lib);
    }
}
