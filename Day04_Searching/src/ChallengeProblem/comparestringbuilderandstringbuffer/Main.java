package ChallengeProblem.comparestringbuilderandstringbuffer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        int n=1000000;
        compareTime ct= new compareTime();
        long stringBuilderTime = ct.stringBuilderTime(list,n);
        long stringBufferTime = ct.stringBufferTime(list, n);

        System.out.println("Time taken by StringBuilder is : "+stringBuilderTime);
        System.out.println("Time taken by StringBuffer is : "+ stringBufferTime);
        System.out.println("Difference between the time is :"+(stringBufferTime-stringBuilderTime));




    }
}
