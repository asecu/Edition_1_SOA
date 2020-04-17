package com.endava.main;

import com.endava.generics.Book;
import com.endava.generics.GenericLibrary;
import com.endava.generics.Library;
import com.endava.generics.Media;
import com.endava.generics.Newspaper;
import com.endava.generics.Video;

import java.util.Arrays;

import static com.endava.generics.GenericArray.printArray;

public class GenericMain {
    public static void main(String[] args) {
        Book book = new Book("Pride and Prejudice", "Jane Austen", 101.5f, 500);
        Book book1 = new Book("Emma", "Jane Austen", 50f, 200);
        Video video = new Video("Java Tutorial", "Mihai Cusnir", 80f, 5.5f);
        Video video1 = new Video("Java Tutorial - Cucumber", "Mihai Cusnir", 90f, 3f);
        Newspaper newspaper = new Newspaper("Realitatea", "Dorin Calancea", 9f, "Chisinau");
        Newspaper newspaper1 = new Newspaper("Adevarul", "Anrei Adevar", 100f, "Chisinau");

        GenericLibrary<Media> genericLibrary = new GenericLibrary<>();
        genericLibrary.addItem(book);
        genericLibrary.addAllItems(Arrays.asList(book1, video, video1, newspaper, newspaper1));
        System.out.println("Items cheaper than 100 are:\n" + genericLibrary.getItemsCheaperThan(100f));
        genericLibrary.addItem(book1);
        genericLibrary.removeItem(newspaper);
        genericLibrary.removeMultipleItems(Arrays.asList(video, book));
        genericLibrary.sortByPrice();
        genericLibrary.sortByTitle();
        System.out.println(genericLibrary);

        Library library = new Library();
        library.addAllItems(Arrays.asList(book, book1, video, video1, newspaper));
        System.out.println("All video from library: " + library.getAllVideos());
        System.out.println("Items from editor Jane Austen are: ");
        library.printAllItemsFromEditor("Jane Austen");

        Integer[] integerArray = {1, 2, 3, 4};
        String[] stringsArray = {"One", "Two", "Three", "Four"};

        printArray(integerArray);
        printArray(stringsArray);
    }
}
