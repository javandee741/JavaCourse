package Lesson17;

import java.util.Scanner;

public class WhileDemo {
    static void main() {
        int count = 3;
        while(count >0){
            count--;

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
