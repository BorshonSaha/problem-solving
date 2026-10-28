package openClosedPrinciple;

public class Circle implements Shape{
    private double radius;

    @Override
    public double calculateArea() {
        return 3.1416 * radius * radius;
    }
}
