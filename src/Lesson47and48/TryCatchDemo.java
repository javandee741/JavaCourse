package Lesson47and48;

public class TryCatchDemo {
    static void main() {
        int zero = 1;
        int count = 12;
        String string = null;

        try {
            int result = count/zero;
            System.out.println(result);
            System.out.println(string.length());
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero. You're not Chuсk Norris!");
        } catch (NullPointerException exception){
            System.out.println("String has length null");
        } finally {
            System.out.println("The end try-catch block.");
        }
    }
}
