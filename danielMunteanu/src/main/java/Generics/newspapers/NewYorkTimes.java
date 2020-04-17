package Generics.newspapers;

import Generics.LibraryItemType;

public class NewYorkTimes implements Newspaper {
    @Override
    public Gender gender() {
        return Gender.POLITICAL;
    }

    @Override
    public int getYear() {
        return 2015;
    }

    @Override
    public String getName() {
        return "New York Times";
    }

    @Override
    public LibraryItemType getType() {
        return LibraryItemType.NEWSPAPER;
    }

    @Override
    public String toString() {
        return getType() + " " + getName() + " year: " + getYear() + ",  gender: " + gender();
    }
}