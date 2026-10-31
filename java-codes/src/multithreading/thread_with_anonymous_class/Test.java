package multithreading.thread_with_anonymous_class;

public class Test {
    static void main() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });

        t.start();
    }
}
