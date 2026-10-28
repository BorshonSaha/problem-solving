package interfaceSegregationPrinciple;

public class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("Performing tasks like welding");
    }
}
