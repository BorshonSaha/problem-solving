package abstraction;

public class Triangle extends Shape {
    Triangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    @Override
    void area() {
        System.out.println("Triangle area: " +0.5 * dimension1 * dimension2);
    }
}
