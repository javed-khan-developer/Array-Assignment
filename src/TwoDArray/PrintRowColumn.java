package TwoDArray;

/*Write a function which accepts a 2D array of integers and its size as arguments and
displays the elements of middle row and the elements of middle column.
Printing can be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...] */
public class PrintRowColumn {
    static void printMiddleRowAndColumn(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    System.out.print(arr[i][j]);
                }else if(j==n/2){
                    System.out.print(arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 }, { 3, 4, 3, 2, 6 }, { 0, 9, -4, 3, 2 }, { 3, 2, 1, 7, 8 },
                { 1, 2, 3, 7, 4 } };
        int n = arr.length;
        printMiddleRowAndColumn(arr, n);
    }
}
