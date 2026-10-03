package basic_java;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int reverseNumber = 0, n, temp;
        System.out.println("Enter a number: ");
        n = input.nextInt();
        temp = n;

        while (temp != 0) {
            int lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }

        if(n == reverseNumber) {
            System.out.println(n+ " is a Palindrome Number");
        } else {
            System.out.println(n+ " is not a Palindrome Number");
        }
    }
}
