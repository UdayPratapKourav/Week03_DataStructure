package countingsort.sortstudentages;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 14, 13, 17, 12, 11, 15};

        System.out.println("Original Ages: " + Arrays.toString(studentAges));

        CountingSort.countingSort(studentAges);

        System.out.println("Sorted Ages: " + Arrays.toString(studentAges));
    }
}
