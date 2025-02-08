package recursivevsiterativefibonacci;

public class CompareComputation {


    //Method for calculating fibonacci using recursive approach
    public int fibonacciRecursive(int n){
        long start = System.nanoTime();
        int result = fibonacciRecursiveCore(n);
        long end = System.nanoTime();
        System.out.println("Time taken by fibonacci recursive :"+(end-start)/100000.0 +" ms");
        return result;
    }




    public  int fibonacciRecursiveCore(int n) {

        if (n <= 1) return n;
        return fibonacciRecursiveCore(n - 1) + fibonacciRecursiveCore(n - 2);
    }


//Method for calculating fibonacci using iterative approach
    public  int fibonacciIterative(int n) {
       long start = System.nanoTime();
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        long end = System.nanoTime();
        System.out.println("time taken by fibonacci iterative :"+(end-start)/100000.0 +" ms");
        return b;
    }

}
