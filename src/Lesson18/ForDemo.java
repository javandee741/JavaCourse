package Lesson18;

import java.util.Scanner;

public class ForDemo {
    static void main() {
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18){
                System.out.println("Your are children.");
            } else {
                System.out.println("Your are adult!");
            }
        }
    }
}
