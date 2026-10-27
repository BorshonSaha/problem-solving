package method_overloading_and_overriding;

public class Test {
    static void main() {
        Person p = new Person();
        p.displayInformation();

        Person t = new Teacher();
        t.displayInformation();
    }
}
