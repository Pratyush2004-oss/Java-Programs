import java.util.Scanner;
public class MinElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " element : ");
            arr[i] = scan.nextInt();
        }

        // Printing array
        System.out.print("The given array is: \n");
        for (int i : arr) {
            System.out.print(i + "\t");
        }

        // Finding the maximum element
        int min_element = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min_element) {
                min_element = arr[i];
            }
        }
        System.out.println("\nMaximum element in the array is : " + min_element);
    }
}
