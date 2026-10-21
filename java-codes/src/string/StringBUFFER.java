package string;

public class StringBUFFER {
    static void main() {
        StringBuffer sb = new StringBuffer("Borshon");

        System.out.println(sb);

        sb.append(" Saha");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

        sb.delete(0, 2);

        System.out.println(sb);
    }
}
