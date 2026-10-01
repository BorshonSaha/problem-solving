package basic_java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int first = 0, second = 1, fibo;

        System.out.println("Enter ending point: ");
        int n = input.nextInt();

        System.out.print(first+ " " +second);

        for(int i=2; i<n; i++) {
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
    }
}
