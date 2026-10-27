package multiple_inheritance;

public class C implements A,B {
    @Override
    public void display() {
        System.out.println("From C class");
    }

    static void main() {
        C c = new C();
        c.display();
    }
}
