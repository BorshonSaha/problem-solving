package openClosedPrinciple;

public class Rectangle implements Shape {
    private double height;
    private double width;

    @Override
    public double calculateArea() {
        return height * width;
    }
}
