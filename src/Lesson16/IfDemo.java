package Lesson16;

import java.util.Scanner;

public class IfDemo {
    static void main() {
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
