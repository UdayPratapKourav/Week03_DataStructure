package binarysearch.searchforatarget;

public class SearchATarget {
    public boolean searchTarget(int [][]arr,int target){
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return false;
        }
        int rows = arr.length, cols = arr[0].length;
        int left = 0, right = rows * cols - 1;


        while (left<=right){
            int mid = (left+right)/2;
            int midValue = arr[mid / cols][mid % cols];
            if(midValue==target){
                return true;
            }else if(midValue<target){
                left=mid+1;
            }else {
                right=mid-1;
            }

        }
        return false;
    }
}
