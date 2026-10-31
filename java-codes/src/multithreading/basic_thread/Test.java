package multithreading.basic_thread;

public class Test {
    static void main() {
        World world = new World();
        world.start();

        WorldTwo worldTwo = new WorldTwo();
        Thread t1 = new Thread(worldTwo);
        t1.start();

        for( ; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
