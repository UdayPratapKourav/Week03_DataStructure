package binarysearch.searchforatarget;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;
        SearchATarget st = new SearchATarget();
        System.out.println("Target found: " + st.searchTarget(matrix, target));
    }
}
