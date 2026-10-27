package call_by_value_and_reference;

public class CallByReference {
    String name;

    void change(CallByReference r2) {
        r2.name = "Saha";
    }
}
