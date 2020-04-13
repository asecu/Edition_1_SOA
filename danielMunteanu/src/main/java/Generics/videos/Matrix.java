package Generics.videos;

import Generics.LibraryItemType;

public class Matrix implements Video {
    @Override
    public long duration() {
        return 5212;
    }

    @Override
    public int getYear() {
        return 2003;
    }

    @Override
    public String getName() {
        return "Matrix";
    }

    @Override
    public LibraryItemType getType() {
        return LibraryItemType.VIDEO;
    }
}