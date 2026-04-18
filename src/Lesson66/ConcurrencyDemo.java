package Lesson66;

import Lesson57.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyDemo {
    static void main() {
        List<String> strings = new ArrayList<String>();
        strings.add("first");
        strings.add("second");

        System.out.println(strings);

        List<String> students = new CopyOnWriteArrayList<>();

        students.add("Bob");
        students.add("Alice");
        students.add("Charlie");
        students.add("Daniel");
        students.add("Emma");
        students.add("Frank");
        students.add("George");
        students.add("Inna");
        students.add("Jack");
        students.add("Kolin");
        students.add("Li");
        students.add("Mice");
        students.add("Nick");
        students.add("Opra");
        students.add("Paul");
        students.add("Rachel");
        students.add("Susane");
        students.add("Tanya");
        students.add("Uma");
        students.add("Victor");
        students.add("William");

        for (String element:students){
            System.out.println(element);
        }

        System.out.println(students );

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit( () -> {
            System.out.println("Task 1 executing....");
        });

        executorService.submit( () -> {
            System.out.println("Task 2 executing....");
        });

        executorService.submit( () -> {
            System.out.println("Task 3 executing....");
        });

        executorService.shutdown();
    }
}
