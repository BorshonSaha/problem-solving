package basic_java;

import java.util.Scanner;

public class SumOfDigit {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int sum = 0, n, temp;
        System.out.println("Enter a number: ");
        n = input.nextInt();
        temp = n;

        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;
            temp /= 10;
        }
        System.out.println("Sum of " +n+ " is: " +sum);

    }
}
