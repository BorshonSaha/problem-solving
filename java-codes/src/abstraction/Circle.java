package abstraction;

public class Circle extends Shape{

    Circle(double radius) {
        super(radius, radius);
    }

    @Override
    void area() {
        System.out.println("Circle area: " +3.1416 * dimension1 * dimension2);
    }
}
