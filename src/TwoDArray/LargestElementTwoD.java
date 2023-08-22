package TwoDArray;

import java.util.Scanner;

/*Write a program to find the largest element of a given 2D array of integers. */
public class LargestElementTwoD {
    static void findLargestElement(int[][] arr, int n) {
        int largest_element = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest_element) {
                    largest_element = arr[i][j];
                }
            }
        }
        System.out.println("the largest element is : " + largest_element);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        findLargestElement(arr, n);
        scanner.close();
    }
}
