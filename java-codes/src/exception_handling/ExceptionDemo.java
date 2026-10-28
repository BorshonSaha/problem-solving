package exception_handling;

public class ExceptionDemo {
    static void main() {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception: " +e);
        } catch (Exception e) {
            System.out.println("Exception: " +e);
        } finally {
            System.out.println("Finally block");
        }
    }
}
