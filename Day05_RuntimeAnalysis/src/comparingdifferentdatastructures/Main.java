package comparingdifferentdatastructures;

public class Main {
    public static void main(String[] args) {

        // Creating CompareDS objects with different sizes
        CompareDS cd = new CompareDS(1000);       // Dataset with 1,000 elements
        CompareDS cd1 = new CompareDS(100000);    // Dataset with 100,000 elements
        CompareDS cd2 = new CompareDS(1000000);   // Dataset with 1,000,000 elements

        // Testing search performance on the first dataset
        cd.useArray(998);
        cd.useHashSet(998);
        cd.useHashTree(998);

        System.out.println();   // Line break for better output readability

        // Testing search performance on the second dataset
        cd1.useArray(9980);
        cd1.useHashSet(9980);
        cd1.useHashTree(9980);

        System.out.println();   // Line break for better output readability

        // Testing search performance on the third dataset
        cd2.useArray(99008);
        cd2.useHashSet(99008);
        cd2.useHashTree(99008);
    }
}
