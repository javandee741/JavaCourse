package Lesson24;

import java.util.Arrays;

public class ArrayDemo {
    static void main() {
        int[] arrNumbers = new int[6];
        arrNumbers[0] = 12;
        arrNumbers[1] = 54;
        arrNumbers[2] = 12334;
        arrNumbers[3] = 973;
        arrNumbers[4] = 324;
        arrNumbers[5] = 12323;

        System.out.println(Arrays.toString(arrNumbers));
        System.out.println(arrNumbers[2]);

        int sumArr = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            sumArr += arrNumbers[i];
        }
        System.out.printf("Sum of our Array is %d",sumArr);
    }
}
