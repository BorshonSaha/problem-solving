package multithreading.thread;

public class B extends A implements Runnable {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

        for (int i=0; i<10; i++) {
            System.out.println("3");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
