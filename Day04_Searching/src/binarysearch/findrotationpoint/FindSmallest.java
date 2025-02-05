package binarysearch.findrotationpoint;

public class FindSmallest {
    public int smallestElementIndex(int[]arr){
        int left=0 ;
        int right= arr.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(mid>0&&arr[mid]<arr[mid-1]){
                return mid;
            } else if (arr[mid]>arr[left]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return -1;
    }
}
