package this_keyword;

public class Person {
    String name;
    int age;
    String hairColor;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String hairColor) {
        this(name, age); // constructor called of current class using this keyword
        this.hairColor = hairColor;
    }

    void display() {
        System.out.println("Name: " +name+ ", Age: " +age+ ", HairColor: " +hairColor);
    }
}
