package StringBuffer.comparestringbufferwithstringbuilder;

public class Compare {
    public long stringBuilderTime(){
        StringBuilder sb = new StringBuilder();
        long start=System.nanoTime();
        for(int i=0;i<1000000;i++){
           sb.append("hello ");
       }
        long end=System.nanoTime();
        return end-start;
    }





    public long stringBufferTime(){
        StringBuffer sb = new StringBuffer();
        long start=System.nanoTime();
        for(int i=0;i<1000000;i++){
            sb.append("hello ");
        }
        long end=System.nanoTime();
        return end-start;
    }
}
