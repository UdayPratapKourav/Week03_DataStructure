package linearsearch.searchfirstnegativenumber;

public class LinearSearchNegative {
    public  int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1; // Return -1 if no negative number is found
    }

}
