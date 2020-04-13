package Generics.newspapers;

import Generics.LibraryItemType;

public class ZiarulDeGarda implements Newspaper {
    @Override
    public Gender gender() {
        return Gender.SOCIAL;
    }


    @Override
    public int getYear() {
        return 2019;
    }

    @Override
    public String getName() {
        return "Ziarul de Garda";
    }

    @Override
    public LibraryItemType getType() {
        return LibraryItemType.NEWSPAPER;
    }
}