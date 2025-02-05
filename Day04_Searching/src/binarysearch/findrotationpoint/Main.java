package binarysearch.findrotationpoint;

public class Main {
    public static void main(String[] args) {
        int []arr = {5, 6, 7, 1, 2, 3, 4};
        FindSmallest fs=new FindSmallest();
        int smallestElementIndex=fs.smallestElementIndex(arr);
        System.out.println(smallestElementIndex);



    }
}
