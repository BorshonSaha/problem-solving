package array;

import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter " +size+ " numbers: ");

        for(int i=0; i< size; i++) {
            arr[i] = input.nextInt();
        }

        for(int i=0; i< size; i++) {
            sum += arr[i];
        }

        System.out.println("Sum is: " +sum+ ", average is: " +sum/size);
    }
}
