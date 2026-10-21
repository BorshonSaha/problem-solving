package string;

public class String2 {
    static void main() {
        String s1 = "This is a bottle";

        String s2 = s1.replace('i', 'x');

        System.out.println(s2);

        String[] s3 = s1.split(" ");
        for(String x : s3) System.out.println(x);
    }
}
