package liskovSubstitutionPrinciple;

public class Ostrich implements Bird {
    @Override
    public void move() {
        System.out.println("Move by running on land");
    }
}
