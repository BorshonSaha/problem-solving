package method_overloading_and_overriding;

public class Person {
    String name;
    int age;

    // same method different argument, method overloading
    void sum(int a, int b) {
        System.out.println(a+b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    void displayInformation() {
        System.out.println("Name: " +name+ ", Age: " +age);
    }
}
