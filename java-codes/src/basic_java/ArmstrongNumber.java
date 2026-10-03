package basic_java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int sum = 0, n, temp;
        System.out.println("Enter a number: ");
        n = input.nextInt();
        temp = n;

        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += lastDigit * lastDigit * lastDigit;
            temp /= 10;
        }

        if(n == sum) {
            System.out.println(n+ " is a Armstrong Number");
        } else {
            System.out.println(n+ " is not a Armstrong Number");
        }
    }
}
