package Lesson14;

import java.util.Scanner;

public class ScannerDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your name: ");
        int age = sc.nextInt();

        System.out.println("Your name is " + name + "! I'm " + age + " years old.");

    }
}
