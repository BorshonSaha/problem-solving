package super_keyword;

public class B extends A {
    int x = 5;

    B() {
        super();
        System.out.println("B's Constructor");
        // super(); error, because constructor needs to be called at first statement
    }

    void display() {
        System.out.println(super.x);
    }

    @Override
    void display2() {
        super.display2();
        System.out.println("Inside B class");
    }
}
