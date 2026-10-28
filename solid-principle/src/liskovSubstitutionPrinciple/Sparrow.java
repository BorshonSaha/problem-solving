package liskovSubstitutionPrinciple;

public class Sparrow implements Bird {
    @Override
    public void move() {
        System.out.println("Move by flying in the sky");
    }
}
