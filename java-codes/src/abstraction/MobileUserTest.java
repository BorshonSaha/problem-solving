package abstraction;

public class MobileUserTest {
    static void main() {
        MobileUser mobileUser;

        mobileUser = new John();
        mobileUser.call();
        mobileUser.sendMessage();

        mobileUser = new David();
        mobileUser.call();
        mobileUser.sendMessage();
    }
}
