package Lesson23;

public class BigDecimal {
    static void main() {
        java.math.BigDecimal number1 = new java.math.BigDecimal(1231232134234234234234.234234234234234234234243);
        java.math.BigDecimal number2 = java.math.BigDecimal.valueOf(3566745634534534545634563564.53633452342645675467);

        System.out.println(number1.add(number2));
        System.out.println(number1.multiply(number2));
        System.out.println(number2.subtract(number1));
    }
}
