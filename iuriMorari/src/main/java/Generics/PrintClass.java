package Generics;

import java.util.Arrays;

public class PrintClass {
    public static <T, S> void printArray(T[] t, S[] s) {
        for (T t1 : t) {
            System.out.print(t1.toString() + " ");
        }
        System.out.println();
        for (S s1 : s) {
            System.out.println(s1.toString() + " ");
        }
    }

    public static <T> void printArray(T[] generic) {
        System.out.println();
        System.out.println("Value of array is: " + generic.getClass().getSimpleName() + " ittems: " + Arrays.toString(generic));
    }
}
