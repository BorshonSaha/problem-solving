package multithreading.thread;

public class A extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

        for (int i=0; i<10; i++) {
            System.out.println(2);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
