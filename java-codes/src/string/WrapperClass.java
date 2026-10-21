package string;

public class WrapperClass {
    static void main() {
        //    Autoboxing = Primitive data type to Object
        int x = 30;
        Integer y = Integer.valueOf(x); // autoboxing

        Integer z = x; // autoboxing
        System.out.println(z);


        //    Unboxing = Object to Primitive data type
        Double d = new Double(10.25);
        double db = d.doubleValue(); // unboxing
        double dbb = d;
        // unboxing
        System.out.println(dbb);
    }
}
