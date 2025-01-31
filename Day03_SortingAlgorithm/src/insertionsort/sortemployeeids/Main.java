package insertionsort.sortemployeeids;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
          int []  employeeIDs={1,3,2,9,5,6,4,7,8};
          SortId s= new SortId();
        System.out.println(Arrays.toString(s.sort(employeeIDs)));
    }
}
