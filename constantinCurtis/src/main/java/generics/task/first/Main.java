package generics.task.first;

import static generics.task.first.Print.printArray;

public class Main {
    public static void main(String[] args) {

        /* Create Integer and String arrays as Class123 data */
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hy bro", "Have a nice day"};

        printArray(intArray, stringArray);
        printArray(intArray);
        printArray(stringArray);
    }
}

