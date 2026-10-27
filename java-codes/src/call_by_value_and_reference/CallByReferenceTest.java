package call_by_value_and_reference;

public class CallByReferenceTest {
    static void main() {
        CallByReference r1 = new CallByReference();
        r1.name = "Borshon";
        System.out.println("Before calling: " +r1.name);

        r1.change(r1);
        System.out.println("After calling: " +r1.name);
    }
}
