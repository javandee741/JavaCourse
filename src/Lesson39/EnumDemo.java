package Lesson39;

import static Lesson39.DayOfWeek.Saturday;

public class EnumDemo {
    static void main() {

        System.out.println("Today is " + DayOfWeek.Monday);

        System.out.println(Saturday + " in Russian language is " + Saturday.getRussianDayOfWeek());

    }
}
