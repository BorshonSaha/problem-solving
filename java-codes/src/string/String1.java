package string;

public class String1 {
    public static void main() {
        String s1 = "Borshon Saha";
        String s2 = new String("Borshon Saha");

//        Here == match the references not the value, so it will print "Not same"
        if(s1 == s2) System.out.println("Same");
        else System.out.println("Not same");

//         s1.equals(s2)
        if(s1.contains(s2)) System.out.println("Same");
        else System.out.println("Not same");
    }
}
