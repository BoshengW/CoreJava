package AlgorithmDS;

public class Fibonacci {
    public static long fib(long index) {
        // this recursive method is too slow,
        // use long to avoid int range issue.
        if (index==0) {
            return 0;
        } else if (index==1) {
            return 1;
        } else {
            return fib(index-1) + fib(index-2);
        }
    }
    // navie iter method O(n) + memorization
    public static long iterFib(long index) {
        long a = 0;
        long b = 1;
        for(int i=0; i<index;i++) {
            long temp = a;
            a = b;
            b = temp + b;
        }
        return a;

    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.iterFib(100));
    }
}
