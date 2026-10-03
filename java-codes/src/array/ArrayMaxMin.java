package array;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int maxNumber, minNumber;

        System.out.println("Enter " +size+ " numbers: ");

        for(int i=0; i< size; i++) {
            arr[i] = input.nextInt();
        }

        maxNumber = arr[0];
        minNumber = arr[0];

        for(int i=0; i<size; i++) {
            if(arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
            if(arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }

        System.out.println("Max number is: " +maxNumber);
        System.out.println("Min number is: " +minNumber);
    }
}
