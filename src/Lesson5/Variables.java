package Lesson5;

public class Variables {
    static void main() {
        //Byte -128..127
        byte age = 48;
        System.out.println("My age is " + age);

        //Short -32768..32767
        short shortNumber = 2026;
        System.out.println("Current year is " + shortNumber);

        //Integer -2 ... 2 billion
        int intNumber = 18456157;
        System.out.println("Some count is " +intNumber);

        //Long
        long longNumber = 132465748123254132L;
        System.out.println("Very big count is " + longNumber);

        //Float
        float floatNumber = 3.14F;
        System.out.println("Float " + floatNumber);

        //Double
        double doubleNumber = 123.322434134123412341234;
        System.out.println("Double " + doubleNumber);

        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.isNaN(1.0/.0));

        char charSymbol = 'A';
        System.out.println("Char is " + charSymbol);

        boolean bool = true;
        System.out.println("Boolean is " + bool);

        var variableNum = 1024L;
        System.out.println("Variable is " + variableNum);
    }
}
