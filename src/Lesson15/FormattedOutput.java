package Lesson15;

import java.time.LocalDateTime;

public class FormattedOutput {
    static void main() {
        var name = "Evgeny";
        int age = 48;
        double height = 1.739;
        System.out.printf("Hello %s, my age is %d and height is %.2f.", name, age, height);

        System.out.println();

        LocalDateTime time = LocalDateTime.now();
        System.out.printf("Current date and time is %tF %tT", time, time);
    }
}
