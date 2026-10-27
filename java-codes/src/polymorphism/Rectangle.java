package polymorphism;

public class Rectangle extends Shape{

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        System.out.println("Rectangle area");
        return length * width;
    }
}
