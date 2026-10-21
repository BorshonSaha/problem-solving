package string;

public class PrimitiveToString {
    static void main() {

        // Primitive to String
        int i = 100;
        String s = Integer.toString(i);
        System.out.println(s);

        boolean b = true;
        String s2 = Boolean.toString(b);
        System.out.println(s2);

        // String to Primitive
        String s3 = "32";
        int num = Integer.parseInt(s3);
        System.out.println(num);

        String s4 = "45";
        double num2 = Double.parseDouble(s4);
        System.out.println(num2);
    }
}
