package Generics.books;

import Generics.LibraryItemType;

public class Shogun implements Book {
    @Override
    public int getPages() {
        return 100;
    }

    @Override
    public int getYear() {
        return 1965;
    }

    @Override
    public String getName() {
        return "Shogun";
    }

    @Override
    public LibraryItemType getType() {
        return LibraryItemType.BOOK;
    }

    @Override
    public String toString() {
        return "pages" + getPages() + " " + "year" + getYear() + " " + getName() + " " + getType();
    }
}