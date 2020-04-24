package Generics.books;

import Generics.LibraryItemType;

public class GameOfThrones implements Book {
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
        return "Game of Thrones";
    }

    @Override
    public LibraryItemType getType() {
        return LibraryItemType.BOOK;
    }

    @Override
    public String toString() {
        return "GameOfThrones{}";
    }
}
