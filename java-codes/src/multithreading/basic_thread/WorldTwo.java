package multithreading.basic_thread;

public class WorldTwo implements Runnable{
    @Override
    public void run() {
        for( ; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
