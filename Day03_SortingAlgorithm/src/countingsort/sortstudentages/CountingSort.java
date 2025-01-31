package countingsort.sortstudentages;

public class CountingSort {
    public static void countingSort(int[] ages) {
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1; // Possible values: 10 to 18 (9 values)

        int[] count = new int[range]; // Count array
        int[] output = new int[ages.length]; // Output array

        // Step 1: Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in sorted order
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }
}