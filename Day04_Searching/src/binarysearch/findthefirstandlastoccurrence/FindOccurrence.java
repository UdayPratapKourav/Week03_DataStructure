package binarysearch.findthefirstandlastoccurrence;

public class FindOccurrence {

    public int findFirst(int arr[],int target){
        int left=0;
        int right = arr.length-1;
        int result=-1;
        while (left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid]==target){
                result=mid;
                right=mid-1;
                
            } else if (arr[mid]<target) {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }

    public int findLast(int arr[],int target){
        int left=0;
        int right = arr.length-1;
        int result=-1;
        while (left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid]==target){
                result=mid;
                left=mid+1;

            } else if (arr[mid]<target) {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }
}
