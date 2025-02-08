package comparingdifferentdatastructures;

import java.util.HashSet;
import java.util.TreeSet;

public class CompareDS {
    int size;
    int[] arr;
    HashSet<Integer> hashSet;
    TreeSet<Integer> treeSet;

    // Constructor to initialize the data structures
    CompareDS(int size) {
        this.size = size;
        arr = new int[size];
        hashSet = new HashSet<>();
        treeSet = new TreeSet<>();

        // Adding elements to array, hashSet, and treeSet
        for (int i = 0; i < size; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }
    }

    // Method to search for an element in the array
    public void useArray(int target) {
        long start = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("found");
            }
        }
        long end = System.nanoTime();
        System.out.println("Time taken by using Array: " + (end - start) / 100000.0 + " ms");
    }

    // Method to search for an element in the HashSet
    public void useHashSet(int target) {
        long start = System.nanoTime();
        if (hashSet.contains(target)) {
            System.out.println("found");
        }
        long end = System.nanoTime();
        System.out.println("Time taken by using HashSet: " + (end - start) / 100000.0 + " ms");
    }

    // Method to search for an element in the TreeSet
    public void useHashTree(int target) {
        long start = System.nanoTime();
        if (treeSet.contains(target)) {
            System.out.println("found");
        }
        long end = System.nanoTime();
        System.out.println("Time taken by using TreeSet: " + (end - start) / 100000.0 + " ms");
    }
}
