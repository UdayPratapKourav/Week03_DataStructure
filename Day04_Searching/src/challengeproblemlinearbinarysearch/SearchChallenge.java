package challengeproblemlinearbinarysearch;
import java.util.Arrays;

public class SearchChallenge {
    public static int findFirstMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int expected = 1;
        for (int num : arr) {
            if (num == expected) {
                expected++;
            }
        }
        return expected;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 3;

        System.out.println("First missing positive integer: " + findFirstMissingPositive(arr));
        Arrays.sort(arr);
        System.out.println("Index of target (" + target + "): " + binarySearch(arr, target));
    }
}
