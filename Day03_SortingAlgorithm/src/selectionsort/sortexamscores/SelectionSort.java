package selectionsort.sortexamscores;

public class SelectionSort {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {  // Loop through each element
            int minIndex = i; // Assume current element is the smallest

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
}
