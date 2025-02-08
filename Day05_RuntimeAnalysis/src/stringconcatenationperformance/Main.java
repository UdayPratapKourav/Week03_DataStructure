package stringconcatenationperformance;

public class Main {
    public static void main(String[] args) {
        StringConcatenation sc = new StringConcatenation();
        sc.usingString(1000);
        sc.usingStringBuilder(1000);
        sc.usingStirngBuffer(1000);

        System.out.println();

        StringConcatenation sc1= new StringConcatenation();
        sc1.usingString(10000);
        sc1.usingStringBuilder(10000);
        sc1.usingStirngBuffer(10000);

        System.out.println();

        StringConcatenation sc2= new StringConcatenation();
        sc2.usingString(100000);
        sc2.usingStringBuilder(100000);
        sc2.usingStirngBuffer(100000);
    }
}
