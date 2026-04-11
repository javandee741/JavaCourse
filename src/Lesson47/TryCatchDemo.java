package Lesson47;

public class TryCatchDemo {
    static void main() {
        int zero = 0;
        int count = 12;

        try {
            int result = count/zero;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero. You're not Chuсk Norris!");
        } finally {
            System.out.println("The end try-catch block.");
        }
    }
}
