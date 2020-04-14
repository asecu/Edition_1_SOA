package com.endava.generics;

import java.util.Arrays;

public class GenericArray {

    public static <T> void printArray(T[] inputArray) {
        String arrayType = inputArray.getClass().getTypeName();
        System.out.println("Given Array of type: " + arrayType + "\n" + Arrays.toString(inputArray));
    }
}