package Lesson73;

public class Fibonacci {
    public static long memo[];
    static void main(String[] args) {

        System.out.println(fibonacci(20));
        System.out.println(fibonacciRecursion(20));
        System.out.println(fibonacciRecursionMemo(20 ));
    }

    private static long fibonacci(long index){
        if(index==0) return 0;
        if (index==1) return 1;
        long a = 0;
        long b = 1;
        long result = 1;

        for (int i = 2; i <= index; i++) {
            result = a +b;
            a=b;
            b=result;
        }
        return result;
    }

    private static long fibonacciRecursion(long index){
        if (index==0) return 0;
        if (index==1) return 1;
        return fibonacciRecursion(index-1)+fibonacciRecursion(index-2);
    }

    private static long fibonacciRecursionMemo(int index){
        memo = new long[Math.toIntExact(index + 1)];

        return fibonacciMemoHelper(index);
    }

    private static long fibonacciMemoHelper(int index){
        if (index==0) return 0;
        if (index==1) return 1;

        if(memo[index]!=0) return memo[index];

        memo[index] = fibonacciMemoHelper(index-1)+fibonacciMemoHelper(index-2);

        return memo[index];
    }
}
