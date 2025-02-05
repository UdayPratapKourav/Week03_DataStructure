package binarysearch.findthefirstandlastoccurrence;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,4,5,6,7,8,9};
        int target =2;
        FindOccurrence fo= new FindOccurrence();
        System.out.println("First occurrence is :"+fo.findFirst(arr,target));
        System.out.println("Last occurrence is :"+fo.findLast(arr,target));


    }
}
