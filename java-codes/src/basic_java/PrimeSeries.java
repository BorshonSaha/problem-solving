package basic_java;

import java.util.Scanner;

public class PrimeSeries {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter initial number: ");
        int m = input.nextInt();

        System.out.println("Enter ending number: ");
        int n = input.nextInt();

        int count = 0, totalPrime = 0;

        for(int i=m; i<n; i++) {
            for( int j=2; j<i; j++) {
                if(i % j == 0) {
                    count++;
                    break;
                }
            }
            if(i != 1 && count == 0) {
                System.out.println("" +i+ " is a prime number");
                totalPrime++;
            }
            count = 0;
        }
        System.out.println("Total prime number is: " +totalPrime);
    }
}
