package basic_java;

import java.util.Scanner;

public class UserInput {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.println("Enter a number: ");

        number = input.nextInt();
        System.out.println("Number: " +number);

        input.nextLine(); // Clear the buffer

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome " +name+ " !!");
    }
}
