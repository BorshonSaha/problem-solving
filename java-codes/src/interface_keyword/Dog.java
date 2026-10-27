package interface_keyword;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    static void main() {
        Animal animal;
        animal = new Dog();
        animal.eat();
    }
}
