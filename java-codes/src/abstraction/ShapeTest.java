package abstraction;

public class ShapeTest {
    static void main() {
        Shape shape;

        shape = new Rectangle(10, 20);
        shape.area();

        shape = new Triangle(20, 30);
        shape.area();

        shape = new Circle(10);
        shape.area();
    }
}
