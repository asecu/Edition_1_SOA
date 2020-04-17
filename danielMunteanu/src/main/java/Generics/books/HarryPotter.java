package Generics.books;

import Generics.LibraryItemType;

public class HarryPotter implements Book {
    @Override
    public int getPages() {
        return 2369;
    }

    @Override
    public int getYear() {
        return 2000;
    }

    @Override
    public String getName() {
        return "Harry Potter";
    }

    @Override
    public LibraryItemType getType() {
        return LibraryItemType.BOOK;
    }

    @Override
    public String toString() {
        return LibraryItemType.BOOK.toString() + " name is : " + getName() + " pages: " + getPages() + " ,year: " + getYear();
    }
}