package abstraction;

public abstract class MobileUser {
    abstract void sendMessage();

    void call() {
        System.out.println("Call method");
    }
}
