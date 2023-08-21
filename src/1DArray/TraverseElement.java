public class TraverseElement {
    /*
     * Write a program to traverse over the elements of the array using for each
     * loop and print all even elements.
     */
    public static void main(String[] args) {
        int  arr[] = {34,21,54,65,43};
        for (int element : arr) {
            if (element%2==0) {
              System.out.println(element);  
            }
        }
    }
}
