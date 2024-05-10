import java.util.Scanner;

public class ArraySum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in your array : ");
        int size = scan.nextInt();
        float [] arr = new float[size];
        // Prompting user to enter elements and store them into an array
        for (int i=0;i<size;i++){
            System.out.print("Enter the " + i + " element : ");
            arr[i] = scan.nextFloat();
        }
        // Calculate sum using a function and display it
        float sum = 0;
        for (int i=0;i<size;i++){
            sum += arr[i];
        }
        System.out.print("The sum is: " + sum);
    }
    
}
