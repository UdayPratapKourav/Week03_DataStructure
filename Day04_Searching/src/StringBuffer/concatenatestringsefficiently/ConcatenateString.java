package StringBuffer.concatenatestringsefficiently;

public class ConcatenateString {
    public String concatenatedString(String[]str){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length;i++){
            sb.append(str[i]+" ");
        }

        return sb.toString();
    }
}
