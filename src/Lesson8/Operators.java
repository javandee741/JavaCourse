package Lesson8;

public class Operators {
    static void main() {
        int a = 16, b = 8;

        int c = a + b;
        System.out.println("a + b = " + c);

        c = a - b;
        System.out.println("a - b = " + c);

        c = a * b;
        System.out.println("a * b = " + c);

        c = a / b;
        System.out.println("a / b = " + c);

        c = a % b;
        System.out.println("a % b = " + c);

        //increment
        System.out.println("a++ =" + a++);

        //decrement
        System.out.println("a-- = " + a--);

        boolean isEqual = a==b;
        boolean isNotEqual = a!=b;
        boolean isGreater = a>b;
        boolean isGreaterOrEqual = a>=b;

        //a = a + 4
        a += 4;
        b -= 3;

    }
}
