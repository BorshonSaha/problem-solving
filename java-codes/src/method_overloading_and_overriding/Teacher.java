package method_overloading_and_overriding;

public class Teacher extends Person{
    String qualification;

    @Override
    void displayInformation() {
        System.out.println("Name: " +name+ ", Age: " +age+ ", Qualification: " +qualification);
    }
}
