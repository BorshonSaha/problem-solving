package interfaceSegregationPrinciple;

public class Human implements Workable, Eatable, Sleepable{
    @Override
    public void eat() {
        System.out.println("Performing tasks like coding");
    }

    @Override
    public void work() {
        System.out.println("Eating a meal");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping for rest");
    }
}
