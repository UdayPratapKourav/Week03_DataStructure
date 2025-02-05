package linearsearch.searchfirstnegativenumber;



public class Main {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, -2, 8, -6, 10};
        LinearSearchNegative lsn = new LinearSearchNegative();
        int index = lsn.findFirstNegative(numbers);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}


