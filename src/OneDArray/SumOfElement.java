package OneDArray;

public class SumOfElement {
    /*
     * Write a program to print the sum of all the elements present on even indices
     * in the given array
     */
    static int findSumOfEvenIndices(int[] arr) {
        int sumOfEven = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sumOfEven += arr[i];
        }
        return sumOfEven;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 3, 20, 4, 6, 9 };
        int result = findSumOfEvenIndices(arr);
        System.out.println(result);
    }

}
