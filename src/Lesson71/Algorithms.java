package Lesson71;

public class Algorithms {
    public static int getMaxNumber(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }
        return max;
    }

    public static int getMinNumber(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
        }
        return min;
    }

    static void main() {

        int[] numbers = {4, 32, 16, 8, 15, 16, 23, 42, 2};

        System.out.println(getMaxNumber(numbers));

        System.out.println(getMinNumber(numbers));
    }
}
