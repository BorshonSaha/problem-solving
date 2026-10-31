package multithreading.thread_join;

public class Test {
    static void main() throws InterruptedException {
        System.out.println("Main thread started");

        A t1 = new A();

        System.out.println(t1.isAlive());

        t1.setDaemon(true);
        t1.start();

        System.out.println(t1.isAlive());

//        t1.join();
        System.out.println("Main thread Ended, x value is: " +t1.x);
    }
}
