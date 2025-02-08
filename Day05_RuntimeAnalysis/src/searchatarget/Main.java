package searchatarget;

public class Main {
    public static void main(String[] args) {
      SearchTarget st1=new SearchTarget(1000);
      st1.linearSearch(333);
      st1.binarySearch(333);

      SearchTarget st2=new SearchTarget(10000);
        st2.linearSearch(333);
        st2.binarySearch(333);

        SearchTarget st3=new SearchTarget(1000000);
        st3.linearSearch(333);
        st3.binarySearch(333);
    }
}
