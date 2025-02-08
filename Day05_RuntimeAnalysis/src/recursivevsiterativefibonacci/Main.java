package recursivevsiterativefibonacci;

public class Main {
    public static void main(String[] args) {
        CompareComputation cc = new CompareComputation();
         cc.fibonacciIterative(10);
         cc.fibonacciRecursive(10);
         System.out.println();




        cc.fibonacciIterative(30);
        cc.fibonacciRecursive(30);
        System.out.println();

        cc.fibonacciIterative(50);
        cc.fibonacciRecursive(50);
    }
}
