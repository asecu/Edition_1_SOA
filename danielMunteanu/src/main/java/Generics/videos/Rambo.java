package Generics.videos;

import Generics.LibraryItemType;

public class Rambo implements Video {
    @Override
    public long duration() {
        return 2563;
    }

    @Override
    public int getYear() {
        return 1990;
    }

    @Override
    public String getName() {
        return "Rambo";
    }

    @Override
    public LibraryItemType getType() {
        return LibraryItemType.VIDEO;
    }

    @Override
    public String toString() {
        return LibraryItemType.VIDEO.toString() + " which year is " + getYear() + " is " + getName() + " , duration: " + duration();
    }

}