package exception_handling;

import java.util.Scanner;

public class ExceptionProblem {
    static void main() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter num1: ");
                int num1 = input.nextInt();
                System.out.print("Please enter num2: ");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Result:" + num1 + "/" + num2+" "+ result);
            } catch (Exception e) {
                System.out.println("Exception: " +e);
                System.out.println("You must enter integer. Please try again");
            }
        }
    }
}
