package selectionsort.sortexamscores;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] examScores = {85, 60, 75, 90, 45, 70};

        System.out.println("Original Scores: " + Arrays.toString(examScores));

        SelectionSort.selectionSort(examScores);

        System.out.println("Sorted Scores: " + Arrays.toString(examScores));
    }
}
