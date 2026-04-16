package Lesson62;

public class ConcurrencyDemo {
    static void main() {
        var thread1 = new PrintThread();

        var thread2 = new PrintThread();
        var thread3 = new PrintThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
