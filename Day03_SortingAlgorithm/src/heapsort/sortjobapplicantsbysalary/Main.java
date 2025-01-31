package heapsort.sortjobapplicantsbysalary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] salaries = {40000, 60000, 35000, 80000, 50000};

        System.out.println("Original Salaries: " + Arrays.toString(salaries));

        HeapSort.heapSort(salaries);

        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
}

