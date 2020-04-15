package generics.task.first;

import java.util.Arrays;

public class Print {
    public static <T, S> void printArray(T[] t, S[] s) {
        for (T t1 : t) {
            System.out.print(t1.toString() + " | ");
        }
        System.out.println();
        for (S s1 : s) {
            System.out.print(s1.toString() + " | ");
        }
    }

    public static <T> void printArray(T[] arrayGeneric) {
        System.out.println();
        System.out.println("Value of array is: " + arrayGeneric.getClass().getSimpleName() + " type: " + Arrays.toString(arrayGeneric));
    }
}


