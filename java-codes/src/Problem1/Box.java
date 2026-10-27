package Problem1;

public class Box {
    double height, width, depth;

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVolume() {
        System.out.println("Volume is: " +height * width * depth);
    }
}
