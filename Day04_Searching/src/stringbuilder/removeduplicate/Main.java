package stringbuilder.removeduplicate;

public class Main {

    public static void main(String[] args) {
        String str="programming";
        RemoveDuplicates rd= new RemoveDuplicates();
        String result=rd.removeDuplicates(str);

        System.out.println("String after removing duplicates: " + result);


    }
}
