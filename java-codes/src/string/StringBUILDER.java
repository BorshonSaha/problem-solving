package string;

public class StringBUILDER {
    static void main() {
        StringBuilder str = new StringBuilder("Borshon");

        str.append(" Saha");

        System.out.println(str);

        str.reverse();

        System.out.println(str);

        str.delete(0, 2);

        System.out.println(str);
    }
}
