package array;

import java.util.Scanner;

public class MatrixOperation {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter a 3x3 matrix: ");
        for(int row=0; row<3; row++) {
            for(int col=0; col<3; col++) {
                a[row][col] = input.nextInt();
            }
        }

        int sumOfDiagonal = 0, sumOfUpperTriangle = 0, sumOfLowerTriangle = 0;

        for(int row=0; row<3; row++) {
            for(int col=0; col<3; col++) {
                if(row == col) {
                    sumOfDiagonal += a[row][col];
                }

                if(col > row) {
                    sumOfUpperTriangle += a[row][col];
                }

                if(row > col) {
                    sumOfLowerTriangle += a[row][col];
                }
            }
        }

        System.out.println("Diagonal sum: " +sumOfDiagonal+ "\nUpper triangle sum: " +sumOfUpperTriangle+ "\nLower triangle sum: " +sumOfLowerTriangle);
    }
}
