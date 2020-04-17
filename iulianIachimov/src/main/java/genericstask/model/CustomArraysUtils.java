package genericstask.model;

public class CustomArraysUtils {
  public static <T, S> void printTwoArrays(T[] t, S[] s) {
    for (T t1 : t) {
      System.out.print(t1 + " ");
    }
    System.out.println();
    for (S s1 : s) {
      System.out.print(s1 + " ");
    }
  }

  public static <T> void printArray(T[] t) {
    for (T t1 : t) {
      System.out.print(t1 + " ");
    }
    System.out.println();
  }
}
