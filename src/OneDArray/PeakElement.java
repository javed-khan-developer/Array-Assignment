package OneDArray;

/*Given an array. Find the first peak element in the array.
 A peak element is an element that is greater than its just left and just right neighbor. */
public class PeakElement {
    static int findPeakElement(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                return arr[i];
            }
        }
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 3, 2, 6, 5 };
        int peak = findPeakElement(arr);
        if (peak != -1) {
            System.out.println("peak element is : " + peak);
        } else {
            System.out.println("no peak element found");
        }
    }
}
