package multithreading.thread;

public class Test {
    static void main() throws InterruptedException {
        // for Thread class
        A t1 = new A();
        t1.start(); // this will execute by new thread
        // t1.run(); // this will execute by main thread

        // For Runnable interface
        B b = new B();
        Thread t2 = new Thread(b, "Thread-2");
        t2.start();
        System.out.println(Thread.currentThread().getName());

        for (int i=0; i<10; i++) {
            System.out.println(1);
            Thread.sleep(500);
        }
    }
}
