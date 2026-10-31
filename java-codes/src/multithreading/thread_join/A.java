package multithreading.thread_join;

public class A extends Thread{
    int x;

    @Override
    public void run() {
        for (int i=0; i<100000; i++) {
            x++;
        }
        System.out.println("T1 thread ended, x value is: " +x);
    }
}
