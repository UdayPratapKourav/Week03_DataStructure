package bubblesort.sortstudentmarks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] studentMarks={10,50,68,98,78,12,45};
        SortStudentMarks st= new SortStudentMarks();
        System.out.println(Arrays.toString(st.sort(studentMarks)));
    }

}
