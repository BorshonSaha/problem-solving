package abstraction;

public class Rectangle extends Shape{
    Rectangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    @Override
    void area() {
        System.out.println("Rectangle area: " +dimension1 * dimension2);
    }
}
