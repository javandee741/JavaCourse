package Lesson62;

public class PrintThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 33; i++) {
            try {
                Thread.sleep(412);
                System.out.println(Thread.currentThread().getName() + " " +i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
