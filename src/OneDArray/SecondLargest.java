package OneDArray;

/*Write a program to find out the second largest element in a given array. */
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 34, 21, 54, 65, 43 };
        int largest=arr[0];
        int second_largest = arr[0];
        for (int element : arr) {
            if (element > largest) {
                largest = element;
            }
        }
        for (int element : arr) {
            if (element > second_largest&&element<largest) {
                second_largest = element;
            }
        }
        System.out.println(second_largest);
    }
}
