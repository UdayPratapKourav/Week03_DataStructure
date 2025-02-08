package sortinglargedataefficiently;

public class Main {
    public static void main(String[] args) {
        System.out.println("For array size of 1000 ");
        SortingLargeData sld1 = new SortingLargeData(1000);
        sld1.BubbleSort();
        SortingLargeData sld2 = new SortingLargeData(1000);
        sld2.mergeSort();
        SortingLargeData sld3 = new SortingLargeData(1000);
        sld3.quicksortalgo();


        System.out.println("For Array size of 10000 ");


        SortingLargeData sld4 = new SortingLargeData(10000);
        sld4.BubbleSort();
        SortingLargeData sld5 = new SortingLargeData(10000);
        sld5.mergeSort();
        SortingLargeData sld6 = new SortingLargeData(10000);
        sld6.quicksortalgo();


        System.out.println("For Array size of 100000");

        SortingLargeData sld7 = new SortingLargeData(1000000);
        sld7.BubbleSort();
        SortingLargeData sld8 = new SortingLargeData(1000000);
        sld8.mergeSort();
        SortingLargeData sld9 = new SortingLargeData(1000000);
        sld9.quicksortalgo();




    }
}
