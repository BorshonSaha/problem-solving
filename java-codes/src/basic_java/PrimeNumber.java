package basic_java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any positive number: ");
        int n = input.nextInt();
        int count = 0;

        for(int i=2; i<n; i++) {
            if(n % 2 == 0) {
                count++;
                break;
            }
        }

        if(n != 1 && count == 0) {
            System.out.println("" +n+ " is a prime number");
        } else {
            System.out.println("" +n+ " is not a prime number");
        }
    }
}
