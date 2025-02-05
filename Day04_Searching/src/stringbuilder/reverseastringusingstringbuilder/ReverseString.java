package stringbuilder.reverseastringusingstringbuilder;

public class ReverseString {
    public String reverseString(String string){
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        return sb.reverse().toString();

    }
}
