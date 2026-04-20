package Lesson72;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(20));
        System.out.println(calculateFactorialRecursion(20));
    }

    public static long calculateFactorialRecursion(long n){
        if (n==0 || n==1) return 1;
        return n*calculateFactorialRecursion(n-1);
    }
    
    public static long calculateFactorial(long n){
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result*=i;
        }
        return result;
    }
}
