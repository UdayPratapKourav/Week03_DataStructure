package stringconcatenationperformance;

public class StringConcatenation {
    String string ="Hello java";

    public void usingString(int n){
        long start=System.nanoTime();
        String str="";
        for(int i=0;i<n;i++){
            str+=string;
        }


        long end=System.nanoTime();
        System.out.println("Time taken by String  :"+(end-start)/1000000.0);

    }

    public void usingStringBuilder(int n){
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(string);
        }
        long end = System.nanoTime();

        System.out.println("Time taken by String builder :"+(end-start)/1000000.0);
    }


    public void usingStirngBuffer(int n ){
        long start= System.nanoTime();
        StringBuffer ab =new StringBuffer();
        for(int i=0;i<n;i++){
            ab.append(string);
        }
        long end=System.nanoTime();
        System.out.println("Time taken by String buffer :"+(end-start)/1000000.0);
    }
}
