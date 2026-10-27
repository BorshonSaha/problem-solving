package static_keyword;

public class StaticBlock {
    static int id;
    static String name;

    static {
        id = 101;
        name = "Borshon";
        System.out.println("Static block always execute before main method");
    }

    static void display() {
        System.out.println("Id: " +id+ ", Name: " +name);
    }
}
