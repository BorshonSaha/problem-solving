package polymorphism;

public class Test {
    static void main() {
        Shape shape = new Shape();
        Shape shape2 = new Rectangle(10, 20);
        Shape shape3 = new Triangle(10, 20);

        System.out.println(shape.area());
        System.out.println(shape2.area());
        System.out.println(shape3.area());

        Shape[] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Rectangle(100, 20);
        s[2] = new Triangle(100, 20);

        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());
    }
}
