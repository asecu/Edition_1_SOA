package firstpart;


class GenericIntro {
    public static <T, D> void printArray(T[] arr, D[] b) {

        for (T elem : arr) {
            System.out.print(elem);
        }
        System.out.println();
        for (D elem : b) {
            System.out.print(elem);
        }
    }



}

