package searchatarget;

public class SearchTarget {

   int[]arr;

   SearchTarget(int n){
       arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=i;
       }
   }


   public void linearSearch(int target){
       long start=System.nanoTime();
       for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
               System.out.println("Target found using linearSearch");
               break;
           }
       }

       long end =System.nanoTime();

       System.out.println("Time taken by LinearSearch :"+(end-start));
       System.out.println();

   }



    public void binarySearch(int target){
        long start =System.nanoTime();
        int first=0;
        int last=arr.length;
        while (first<=last){
            int mid=first+(last-first)/2;
            if(arr[mid]==target){
                System.out.println("Target founded using binary Search ");
                break;
            }else if(arr[mid]>target){
                last=mid-1;
            }else {
                first=mid+1;
            }
        }
        long end=System.nanoTime();
        System.out.println("Time taken by Binary Search :"+(end-start));
        System.out.println();

    }
}
