package TwoDArray;

import java.util.Scanner;

/*write a program to print the elements of both the diagonals in a user inputted
square matrix in any order. */
public class BothDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements at primary and secondary diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.println(matrix[i][i]);
        }
        for (int i = 0; i < n; i++) {
            if (i != n - 1 - i) {
                System.out.print(matrix[i][n - i - 1]);
            }
        }
        scanner.close();
    }
}
