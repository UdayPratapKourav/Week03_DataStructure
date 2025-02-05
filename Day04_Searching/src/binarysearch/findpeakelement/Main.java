package binarysearch.findpeakelement;

public class Main {
    public static void main(String[] args) {
       int [] arr={11,12,13,24,23,22,21,20};
        FindThePeek ftp= new FindThePeek();
        int result= ftp.findPeek(arr);
        System.out.println(result);
    }
}
