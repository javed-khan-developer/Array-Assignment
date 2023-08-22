package TwoDArray;

import java.util.Scanner;

public class CountNumbers {
    static void countEachNumbers(int[][] arr) {
        int positive_numbers_count = 0;
        int negative_numbers_count = 0;
        int odd_numbers_count = 0;
        int even_numbers_count = 0;
        int zero_numbers_count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    positive_numbers_count++;
                } else if (arr[i][j] < 0) {
                    negative_numbers_count++;
                }

                if (arr[i][j] % 2 == 0) {
                    even_numbers_count++;
                } else {
                    odd_numbers_count++;
                }

                if (arr[i][j] == 0) {
                    zero_numbers_count++;
                }
            }
        }

        System.out.println("Positive numbers count: " + positive_numbers_count);
        System.out.println("Negative numbers count: " + negative_numbers_count);
        System.out.println("Even numbers count: " + even_numbers_count);
        System.out.println("Odd numbers count: " + odd_numbers_count);
        System.out.println("Zero numbers count: " + zero_numbers_count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter " + row * col + " values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {  
                arr[i][j] = sc.nextInt();
            }
        }
        countEachNumbers(arr);
        sc.close();
    }
}
