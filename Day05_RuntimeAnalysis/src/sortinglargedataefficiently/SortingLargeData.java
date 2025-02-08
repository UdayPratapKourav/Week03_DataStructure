package sortinglargedataefficiently;

public class SortingLargeData {
    int[] arr;

    SortingLargeData(int n) {
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n) + 1;
        }
    }



    //Bubble sort algo
    public void BubbleSort() {
       long start= System.nanoTime();
        int n = arr.length;
        boolean swapped;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {


            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        long end=System.nanoTime();
        System.out.println("Time taken by bubble sort algo is : "+(end-start)/1000000.0);

    }


    public void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;

        // Merge the temporary arrays
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray (if any)
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray (if any)
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Recursive Merge Sort
    public void sortmerget(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            sortmerget(arr, left, mid);
            sortmerget(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Merge Sort Entry Point
    public void mergeSort() {
     long start=System.nanoTime();
        int left = 0;
        int right = arr.length - 1;
        sortmerget(arr, left, right);
        long end=System.nanoTime();

        System.out.println("Time taken by Merge sort "+(end-start)/1000000.0);
    }

    public void displayArr(){
        for(int i:arr){
            System.out.println(i);
        }
    }





//Quick sort algorithm
    public void quicksortalgo(){
       long start=System.nanoTime();
        int low=0;
        int high = arr.length-1;
        quickSort(arr,low,high);
        long end = System.nanoTime();
        System.out.println("Time taken by quicksort :"+(end-start)/1000000.0);
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);


            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }


    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}