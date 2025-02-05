package StringBuffer.comparestringbufferwithstringbuilder;

public class Main {
    public static void main(String[] args) {
        Compare c = new Compare();

        System.out.println("Time taken by StringBuilder is :"+c.stringBuilderTime());
        System.out.println("Time taken by StringBuffer is :"+c.stringBufferTime());
        System.out.println("Difference is :"+(c.stringBufferTime()-c.stringBufferTime()));
    }
}
