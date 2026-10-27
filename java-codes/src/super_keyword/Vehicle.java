package super_keyword;

public class Vehicle {
    String color;
    double weight;

    Vehicle(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    void display() {
        System.out.println("Color: " +color+ ", Weight: " +weight);
    }
}
