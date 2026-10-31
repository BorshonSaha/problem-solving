package multithreading.basic_thread;

public class MyThreadLifecycle extends Thread {
    @Override
    public void run() {
        System.out.println("Running State");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() throws InterruptedException {
        MyThreadLifecycle t1 = new MyThreadLifecycle();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        t1.join();
        System.out.println(t1.getState());
    }
}
