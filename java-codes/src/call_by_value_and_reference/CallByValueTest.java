package call_by_value_and_reference;

public class CallByValueTest {
    static void main() {
        CallByValue ob = new CallByValue();
        int x = 10; // primitive data
        System.out.println("X before call: " +x);

        ob.change(x);
        System.out.println("X after call: " +x);
    }
}
